package org.example.Views;

import antlr4.com.CodexLatinusGrammarLexer;
import org.antlr.v4.runtime.Token;
import org.example.Ejecutores.Ejecutor;
import org.example.Interpreter.Reports.ErrorLatinus;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.io.File;
import java.util.Scanner;


public class CodexLatinusFrame  extends JFrame {

    private final EditorPanel editorPanel;
    private final JTextArea consoleTextArea;
    private Ejecutor lastEjecucion;

    public CodexLatinusFrame(){
        setTitle("Codex Latinus");
        setMinimumSize(new Dimension(600, 400));
        setSize(new Dimension(1200, 675));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        editorPanel = new EditorPanel();
        consoleTextArea = new JTextArea();
        cleanConsole();

        CodexLatinusMenuBar menuBar = new CodexLatinusMenuBar();
        setJMenuBar(menuBar);
        add(new MainPanel(editorPanel, consoleTextArea));

        wireActions(menuBar);

        setVisible(true);
        editorPanel.getTextArea().requestFocus();
    }

    private void wireActions(CodexLatinusMenuBar menuBar) {
        menuBar.onRun(e -> run());
        menuBar.onClean(e -> cleanConsole());
        menuBar.onNew(e -> abrirArchivo());
        menuBar.onExit(e -> System.exit(0));
        menuBar.onTokens(e -> showTokens());
        menuBar.onErrors(e -> errors());
        menuBar.onASTTree(e -> {
            String codigo = editorPanel.getText();
            if (codigo.trim().isEmpty()){
                JOptionPane.showMessageDialog(this, "Ingrese codigo primero");
                return;
            }
            lastEjecucion.mostrarArbolParse(codigo);
        });
        menuBar.onAbout(e -> JOptionPane.showMessageDialog(
                this,
                "Codex Latinus\nVersión 1.0.0\nOLC2",
                "Acerca de",
                JOptionPane.INFORMATION_MESSAGE));
    }

    private void run() {
        String contenido = editorPanel.getText();
        if (contenido.trim().isEmpty()) {
            cleanConsole();
            consoleTextArea.append("Campo Vacio \n");
            return;
        }
        lastEjecucion = new Ejecutor();
        cleanConsole();
        try {

            boolean sinErrores = lastEjecucion.ejecuar(contenido);

            consoleTextArea.append(lastEjecucion.getConsola());
            if (!sinErrores){
                consoleTextArea.append("Revisar reporte de errores >\n");
            }

        } catch (Exception e) {
            consoleTextArea.append("Error: " + e.getMessage() + "\n");
        }
        consoleTextArea.setCaretPosition(consoleTextArea.getDocument().getLength());
        editorPanel.getTextArea().requestFocus();
    }

    private void errors() {
        if (lastEjecucion == null) {
            JOptionPane.showMessageDialog(this,
                    "Primero ejecuta el código.",
                    "Aviso",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Crear el diálogo
        JDialog dialog = new JDialog(this, "Reporte de Errores", true);
        dialog.setSize(900, 500);
        dialog.setLocationRelativeTo(this);
        dialog.setLayout(new BorderLayout());

        // Título
        JLabel lblTitulo = new JLabel("Reporte de Errores", SwingConstants.CENTER);
        lblTitulo.setFont(new Font("Segoe UI", Font.BOLD, 22));
        lblTitulo.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));
        dialog.add(lblTitulo, BorderLayout.NORTH);

        // Tabla
        String[] columnas = {"Tipo", "Descripción", "Línea", "Columna"};
        DefaultTableModel modelo = new DefaultTableModel(columnas, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        // Errores
        for (ErrorLatinus error : lastEjecucion.getErrores()) {
            modelo.addRow(new Object[]{
                  tipoLegible(error.getTipo()),
                  error.getMessage(),
                  error.getLine(),
                  error.getColumun() >= 0 ? error.getColumun() : "-"
            });
        }


        JTable tabla = new JTable(modelo);
        tabla.setFillsViewportHeight(true);
        tabla.setRowHeight(25);
        tabla.setGridColor(Color.GRAY);
        tabla.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        tabla.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 13));
        tabla.getTableHeader().setBackground(new Color(180, 220, 180));

        // Colores por tipo de error
        tabla.setDefaultRenderer(Object.class, (t, value, isSelected, hasFocus, row, column) -> {
            JLabel cell = new JLabel(value != null ? value.toString() : "");
            cell.setOpaque(true);
            String tipo = modelo.getValueAt(row, 0).toString();
            if (isSelected) {
                cell.setBackground(t.getSelectionBackground());
            } else {
                cell.setBackground(switch (tipo) {
                    case "Lexico"     -> new Color(255, 220, 220);
                    case "Sintactico" -> new Color(255, 245, 200);
                    case "Semantico"  -> new Color(220, 220, 255);
                    default           -> Color.WHITE;
                });
            }
            return cell;
        });

        JScrollPane scroll = new JScrollPane(tabla);
        scroll.setBorder(BorderFactory.createEmptyBorder(5, 15, 5, 15));
        dialog.add(scroll, BorderLayout.CENTER);

        // Panel inferior con conteo y botón cerrar
        JPanel panelSur = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        panelSur.setBackground(new Color(245, 245, 245));
        JLabel lblConteo = new JLabel("Total de errores: " + modelo.getRowCount());
        lblConteo.setFont(new Font("Segoe UI", Font.ITALIC, 12));
        JButton btnCerrar = new JButton("Cerrar");
        btnCerrar.setBackground(new Color(180, 220, 180));
        btnCerrar.setFont(new Font("Segoe UI", Font.BOLD, 12));
        btnCerrar.addActionListener(e -> dialog.dispose());
        panelSur.add(lblConteo);
        panelSur.add(btnCerrar);
        dialog.add(panelSur, BorderLayout.SOUTH);

        dialog.setVisible(true);
    }

    private void cleanConsole() {
        consoleTextArea.setText("CONSOLA  -  Codex Latinus \n\n");
    }

    public EditorPanel getEditorPanel() { return editorPanel; }
    public JTextArea getConsoleTextArea() { return consoleTextArea; }

    public boolean abrirArchivo() {
        JFileChooser filechooser = new JFileChooser();
        FileNameExtensionFilter fef = new FileNameExtensionFilter("Archivos Codex Latinus (.lat)", "lat");
        filechooser.setFileFilter(fef);

        if (filechooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            try {
                File file = filechooser.getSelectedFile();
                StringBuilder contenido = new StringBuilder();
                try (Scanner scanner = new Scanner(file)) {
                    while (scanner.hasNextLine()) {
                        contenido.append(scanner.nextLine()).append("\n");
                    }
                    editorPanel.setText(contenido.toString());
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error al leer el archivo: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
                return true;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al abrir el archivo", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        return false;
    }

    private void showTokens(){
        if (lastEjecucion == null || lastEjecucion.getTokens().isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "Primero ejecuta un programa para generar los tokens.",
                    "Reporte de tokens",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        JDialog dialog = new JDialog(this, "Reporte de Tokens", true);
        dialog.setSize(800, 500);
        dialog.setLocationRelativeTo(this);
        dialog.setLayout(new BorderLayout());

        String[] columnas = {"#", "Tipo", "Texto", "Línea", "Columna"};
        DefaultTableModel modelo = new DefaultTableModel(columnas, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        int indice = 0;
        for (Token tok : lastEjecucion.getTokens()) {
            if (tok.getType() == Token.EOF) {
                continue;
            }
            String tipo = CodexLatinusGrammarLexer.VOCABULARY.getSymbolicName(tok.getType());
            modelo.addRow(new Object[]{
                    indice++,
                    tipo != null ? tipo : String.valueOf(tok.getType()),
                    tok.getText(),
                    tok.getLine(),
                    tok.getCharPositionInLine()
            });
        }

        JTable tabla = new JTable(modelo);
        tabla.setFillsViewportHeight(true);
        tabla.setRowHeight(22);
        dialog.add(new JScrollPane(tabla), BorderLayout.CENTER);

        JPanel panelSur = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        panelSur.add(new JLabel("Total de tokens: " + modelo.getRowCount()));
        JButton btnCerrar = new JButton("Cerrar");
        btnCerrar.addActionListener(e -> dialog.dispose());
        panelSur.add(btnCerrar);
        dialog.add(panelSur, BorderLayout.SOUTH);

        dialog.setVisible(true);
    }

    private void mostrarArbolAST(){
        if (lastEjecucion == null || lastEjecucion.getAst() == null) {
            JOptionPane.showMessageDialog(this,
                    "Primero ejecuta un programa sin errores léxicos, sintácticos ni semánticos.",
                    "Árbol AST",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }


    }

    private static String tipoLegible(ErrorLatinus.Tipo tipo) {
        switch (tipo) {
            case LEXICO:     return "Lexico";
            case SINTACTICO: return "Sintactico";
            case SEMANTICO:  return "Semantico";
            default:         return tipo.toString();
        }
    }
}

