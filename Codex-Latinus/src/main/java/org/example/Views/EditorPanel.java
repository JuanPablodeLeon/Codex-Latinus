package org.example.Views;

import org.example.MatchColors.AntlrTokenMaker;
import org.fife.ui.rsyntaxtextarea.*;
import org.fife.ui.rtextarea.RTextScrollPane;

import javax.swing.*;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import java.awt.*;

public class EditorPanel extends JPanel {
    private final RSyntaxTextArea textArea;
    private final JLabel statusLabel;

    public EditorPanel() {
        setLayout(new BorderLayout());

        textArea = new RSyntaxTextArea();
        //textArea.setSyntaxEditingStyle(SyntaxConstants.SYNTAX_STYLE_GO);
        try {
           /*AbstractTokenMakerFactory atmf = (AbstractTokenMakerFactory) TokenMakerFactory.getDefaultInstance();
            atmf.putMapping("text/mylenguaje", AntlrTokenMaker.class.getName());
            textArea.setSyntaxEditingStyle("text/mylenguaje");*/
            AbstractTokenMakerFactory atmf = (AbstractTokenMakerFactory) TokenMakerFactory.getDefaultInstance();
            atmf.putMapping("text/myLanguage", "org.example.MatchColors.ColorsLenguaje");
            textArea.setSyntaxEditingStyle("text/myLanguage");
        }catch (RuntimeException e){

        }
        SyntaxScheme ss = textArea.getSyntaxScheme();
        //Comentarios
        ss.getStyle(Token.COMMENT_MULTILINE).foreground = Color.decode("#949494");
        ss.getStyle(Token.COMMENT_EOL).foreground = Color.decode("#949494");
        //
        ss.getStyle(Token.RESERVED_WORD).foreground = Color.decode("#8F2613");
        //
        ss.getStyle(Token.DATA_TYPE).foreground = Color.decode("#CF8427");
        //
        ss.getStyle(Token.LITERAL_BOOLEAN).foreground = Color.decode("#FF6347"); //Tomato
        //
        ss.getStyle(Token.FUNCTION).foreground = Color.decode("#4B4BBD");
        //
        ss.getStyle(Token.LITERAL_STRING_DOUBLE_QUOTE).foreground = Color.decode("#388F38");
        //
        ss.getStyle(Token.LITERAL_CHAR).foreground = Color.decode("#006400"); //Verde
        //
        ss.getStyle(Token.LITERAL_NUMBER_DECIMAL_INT).foreground = Color.decode("#bc1018"); //Rojo
        //
        ss.getStyle(Token.LITERAL_NUMBER_FLOAT).foreground = Color.decode("#ce2b11"); //Rojo
        //
        ss.getStyle(Token.OPERATOR).foreground = Color.decode("#3bbcea"); // Celeste
        //
        ss.getStyle(Token.SEPARATOR).foreground = Color.decode("#a53bea"); //Morado
        //
        ss.getStyle(Token.IDENTIFIER).foreground = Color.decode("#0000FF"); //Blue

        textArea.setCodeFoldingEnabled(true);
        textArea.setAntiAliasingEnabled(true);
        textArea.setAutoIndentEnabled(true);
        textArea.setTabSize(4);

        RTextScrollPane scrollPane = new RTextScrollPane(textArea);
        add(scrollPane, BorderLayout.CENTER);

        statusLabel = new JLabel("Lín: 1, Col: 1");
        JPanel statusBar = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        statusBar.setBorder(BorderFactory.createEtchedBorder());
        statusBar.add(statusLabel);
        add(statusBar, BorderLayout.SOUTH);

        textArea.addCaretListener(new CaretListener() {
            @Override
            public void caretUpdate(CaretEvent e) {
                try {
                    int line = textArea.getCaretLineNumber() + 1;
                    int offset = textArea.getCaretPosition();
                    int lineStart = textArea.getLineStartOffset(line - 1);
                    int col = offset - lineStart + 1;
                    statusLabel.setText("Lín: " + line + ", Col: " + col);
                } catch (Exception ex) {
                    statusLabel.setText("Lín: --, Col: --");
                }
            }
        });
    }

    public RSyntaxTextArea getTextArea() {
        return textArea;
    }

    public String getText() {
        return textArea.getText();
    }

    public void setText(String text) {
        textArea.setText(text);
    }

}
