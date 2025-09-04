package Ejercicio1;
import javax.swing.*;
import java.awt.*;

public class Ejercicio1GridBagLayout {
    private JPanel panel1;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JButton button1;
    private JButton button2;

    public Ejercicio1GridBagLayout() {
        panel1 = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        gbc.gridx = 0; gbc.gridy = 0;
        panel1.add(new JLabel("Nombres"), gbc);
        gbc.gridx = 1;
        textField1 = new JTextField(10);
        panel1.add(textField1, gbc);

        gbc.gridx = 0; gbc.gridy = 1;
        panel1.add(new JLabel("Primer Apellido"), gbc);
        gbc.gridx = 1;
        textField2 = new JTextField(10);
        panel1.add(textField2, gbc);

        gbc.gridx = 0; gbc.gridy = 2;
        panel1.add(new JLabel("Segundo Apellido"), gbc);
        gbc.gridx = 1;
        textField3 = new JTextField(10);
        panel1.add(textField3, gbc);

        gbc.gridx = 0; gbc.gridy = 3; gbc.gridwidth = 2;
        JPanel buttonsPanel = new JPanel(new FlowLayout());
        button1 = new JButton("Guardar");
        button2 = new JButton("Cancelar");
        buttonsPanel.add(button1);
        buttonsPanel.add(button2);
        panel1.add(buttonsPanel, gbc);
    }

    public JPanel getPanel1() {
        return panel1;
    }
}