import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculadora {
    private JFrame frame;
    private JTextField textField;

    public Calculadora() {
        frame = new JFrame("Calculadora");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 400);

        textField = new JTextField();
        textField.setBounds(10, 10, 260, 40);
        frame.add(textField);

        JPanel panel = new JPanel();
        panel.setBounds(10, 60, 260, 300);
        panel.setLayout(new GridLayout(4, 4));

        String[] buttonLabels = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+"
        };

        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.addActionListener(new ButtonClickListener());
            panel.add(button);
        }

        frame.add(panel);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    private class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            JButton source = (JButton) event.getSource();
            String buttonText = source.getText();
            String currentText = textField.getText();

            if (buttonText.equals("=")) {
                // Calcular o resultado
                try {
                    double result = evaluateExpression(currentText);
                    textField.setText(Double.toString(result));
                } catch (Exception e) {
                    textField.setText("Erro na expressão");
                }
            } else {
                // Acrescentar o texto do botão ao campo de texto
                textField.setText(currentText + buttonText);
            }
        }

        private double evaluateExpression(String expression) {
            // Avaliar e calcular a expressão matemática
            return new Object() {
                int pos = -1, ch;

                void nextChar() {
                    ch = (++pos < expression.length()) ? expression.charAt(pos) : -1;
                }

                boolean eat(int charToEat) {
                    while (Character.isWhitespace(ch))
                        nextChar();
                    if (ch == charToEat) {
                        nextChar();
                        return true;
                    }
                    return false;
                }

                double parse() {
                    nextChar();
                    double x = parseExpression();
                    if (pos < expression.length())
                        throw new RuntimeException("Caractere inesperado: " + (char) ch);
                    return x;
                }

                double parseExpression() {
                    double x = parseTerm();
                    for (;;) {
                        if (eat('+'))
                            x += parseTerm();
                        else if (eat('-'))
                            x -= parseTerm();
                        else
                            return x;
                    }
                }

                double parseTerm() {
                    double x = parseFactor();
                    for (;;) {
                        if (eat('*'))
                            x *= parseFactor();
                        else if (eat('/'))
                            x /= parseFactor();
                        else
                            return x;
                    }
                }

                double parseFactor() {
                    if (eat('+'))
                        return parseFactor();
                    if (eat('-'))
                        return -parseFactor();

                    double x;
                    int startPos = this.pos;
                    if (eat('(')) {
                        x = parseExpression();
                        eat(')');
                    } else if ((ch >= '0' && ch <= '9') || ch == '.') {
                        while ((ch >= '0' && ch <= '9') || ch == '.')
                            nextChar();
                        x = Double.parseDouble(expression.substring(startPos, this.pos));
                    } else {
                        throw new RuntimeException("Número esperado");
                    }
                    return x;
                }
            }.parse();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Calculadora();
            }
        });
    }
}



