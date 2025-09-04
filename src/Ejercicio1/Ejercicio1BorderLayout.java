package Ejercicio1;
import javax.swing.*;
import java.awt.*;

public class Ejercicio1BorderLayout {
    private JPanel panel1;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JButton button1;
    private JButton button2;

    public Ejercicio1BorderLayout() {
        panel1 = new JPanel(new BorderLayout());

        JPanel formPanel = new JPanel(new GridLayout(3, 2, 5, 5));
        formPanel.add(new JLabel("Nombres"));
        textField1 = new JTextField(10);
        formPanel.add(textField1);

        formPanel.add(new JLabel("Primer Apellido"));
        textField2 = new JTextField(10);
        formPanel.add(textField2);

        formPanel.add(new JLabel("Segundo Apellido"));
        textField3 = new JTextField(10);
        formPanel.add(textField3);

        panel1.add(formPanel, BorderLayout.CENTER);

        JPanel buttonsPanel = new JPanel(new FlowLayout());
        button1 = new JButton("Guardar");
        button2 = new JButton("Cancelar");
        buttonsPanel.add(button1);
        buttonsPanel.add(button2);

        panel1.add(buttonsPanel, BorderLayout.SOUTH);
    }

    public JPanel getPanel1() {
        return panel1;
    }
}