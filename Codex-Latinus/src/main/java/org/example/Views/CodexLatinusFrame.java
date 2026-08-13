package org.example.Views;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.StringReader;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;


public class CodexLatinusFrame  extends JFrame {

    private final EditorPanel editorPanel;
    private final JTextArea consoleTextArea;

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
        menuBar.onASTTree(e -> mostrarArbolAST());
        menuBar.onAbout(e -> JOptionPane.showMessageDialog(
                this,
                "Codex Latinus\nVersión 1.0.0\nOLC2",
                "Acerca de",
                JOptionPane.INFORMATION_MESSAGE));
    }

    private String preprocesar(String codigo) {
        String[] lineas = codigo.split("\n", -1);
        StringBuilder sb = new StringBuilder();
        // Regex: línea (con espacios opcionales) que es IDENTIFICADOR seguido de ( ... ) ;
        // No debe estar precedida de := = fmt. return var etc.
        java.util.regex.Pattern patronLlamada = java.util.regex.Pattern.compile(
                "^(\\s*)([a-zA-Z_][a-zA-Z0-9_]*)(\\s*\\(.*\\)\\s*;?\\s*)$"
        );
        for (String linea : lineas) {
            String trimmed = linea.trim();
            // Saltar líneas vacías, comentarios, palabras clave de control, fmt.Println, declaraciones
           //modificar
            if (trimmed.isEmpty() || trimmed.startsWith("//")
                    || trimmed.startsWith("fmt.")
                    || trimmed.startsWith("func ")
                    || trimmed.startsWith("return ")
                    || trimmed.startsWith("var ")
                    || trimmed.startsWith("if ")
                    || trimmed.startsWith("for ")
                    || trimmed.startsWith("switch ")
                    || trimmed.startsWith("struct ")
                    || trimmed.contains(":=")
                    || trimmed.contains(" = ")
                    || trimmed.startsWith("break")
                    || trimmed.startsWith("continue")
                    || trimmed.startsWith("}")) {
                sb.append(linea).append("\n");
                continue;
            }
            java.util.regex.Matcher m = patronLlamada.matcher(linea);
            if (m.matches()) {
                // Es una llamada de función como sentencia: convertir a "_ := nombre(args)"
                String indent = m.group(1);
                String nombre = m.group(2);
                String resto = m.group(3).trim();
                // Asegurarse de que termina con ;
                if (!resto.endsWith(";")) resto = resto + ";";
                sb.append(indent).append("_ := ").append(nombre).append(resto).append("\n");
            } else {
                sb.append(linea).append("\n");
            }
        }
        return sb.toString();
    }

    private void run() {
        String contenido = editorPanel.getText();
        if (contenido.trim().isEmpty()) {
            cleanConsole();
            consoleTextArea.append("Campo Vacio \n");
            return;
        }/*
        try {
            String codigoPreprocesado = preprocesar(editorPanel.getText());
            lexer = new Lexer(new BufferedReader(new StringReader(codigoPreprocesado)));
            parser = new Parser(lexer);

            ASTNode ast = (ASTNode) parser.parse().value;

            if (ast == null) {
                cleanConsole();
                consoleTextArea.append("No hay texto \n");
                return;
            }

            interpreter = new InterpreterVisitor();
            interpreter.Visit(ast);

            cleanConsole();
            consoleTextArea.append(interpreter.output);
        } catch (Exception e) {
            consoleTextArea.append("Error: " + e.getMessage() + "\n");
        }*/
        consoleTextArea.setCaretPosition(consoleTextArea.getDocument().getLength());
        editorPanel.getTextArea().requestFocus();
    }

    private void errors() {
       /* if (lexer == null || parser == null || interpreter == null) {
            JOptionPane.showMessageDialog(this,
                    "Primero ejecuta el código.",
                    "Aviso",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }*/

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
/*
        // Agregar errores léxicos
        for (GoLiteError error : lexer.errors) {
            modelo.addRow(new Object[]{
                    error.getType(),
                    error.getDescription(),
                    error.getLine(),
                    error.getColumn()
            });
        }

        // Agregar errores sintácticos
        for (GoLiteError error : parser.errors) {
            modelo.addRow(new Object[]{
                    error.getType(),
                    error.getDescription(),
                    error.getLine(),
                    error.getColumn()
            });
        }

        // Agregar errores semánticos
        for (GoLiteError error : interpreter.errors) {
            modelo.addRow(new Object[]{
                    error.getType(),
                    error.getDescription(),
                    error.getLine(),
                    error.getColumn()
            });
        }
*/
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

    private void showTokens(){}

    private void mostrarArbolAST(){}


}

