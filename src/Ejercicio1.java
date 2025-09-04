package Ejercicio1;

import javax.swing.*;
import java.awt.*;

public class Ejercicio1 {
    private JPanel panel1;
    private JLabel label1;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;  // 🔹 agregado porque en tu .form aparece "Segundo Apellido"
    private JButton button1;
    private JButton button2;
    private JLabel label2;
    private JLabel label3;

    public JPanel getPanel1() {
        return panel1;
    }

    public Ejercicio1() {
        // Cambiar fuente y color del JLabel
        label1.setFont(new Font("Arial", Font.PLAIN, 12));
        label1.setForeground(Color.RED);

        // Placeholder en textField1 (Nombre)
        String placeholder1 = "Ingresa nombre";
        configurarPlaceholder(textField1, placeholder1);

        // Placeholder en textField2 (Primer Apellido)
        String placeholder2 = "Ingresa primer apellido";
        configurarPlaceholder(textField2, placeholder2);

        // Placeholder en textField3 (Segundo Apellido)
        String placeholder3 = "Ingresa segundo apellido";
        configurarPlaceholder(textField3, placeholder3);

        // Acción para button1 (Guardar)
        button1.addActionListener(e ->
                JOptionPane.showMessageDialog(panel1,
                        "Hola " + textField1.getText() + " " +
                                textField2.getText() + " " +
                                textField3.getText()));

        // Acción para button2 (Cancelar)
        button2.addActionListener(e -> {
            int confirm = JOptionPane.showConfirmDialog(
                    panel1,
                    "¿Seguro que deseas cancelar?",
                    "Confirmación",
                    JOptionPane.YES_NO_OPTION
            );
            if (confirm == JOptionPane.YES_OPTION) {
                System.exit(0);
            }
        });
    }

    // Método auxiliar para placeholders
    private void configurarPlaceholder(JTextField textField, String placeholder) {
        textField.setText(placeholder);
        textField.setForeground(Color.GRAY);

        textField.addFocusListener(new java.awt.event.FocusAdapter() {
            @Override
            public void focusGained(java.awt.event.FocusEvent e) {
                if (textField.getText().equals(placeholder)) {
                    textField.setText("");
                    textField.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(java.awt.event.FocusEvent e) {
                if (textField.getText().isEmpty()) {
                    textField.setForeground(Color.GRAY);
                    textField.setText(placeholder);
                }
            }
        });
    }
}
