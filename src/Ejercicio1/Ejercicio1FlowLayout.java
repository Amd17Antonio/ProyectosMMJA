package Ejercicio1;
import javax.swing.*;
import java.awt.*;

public class Ejercicio1FlowLayout {
    private JPanel panel1;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JButton button1;
    private JButton button2;

    public Ejercicio1FlowLayout() {
        panel1 = new JPanel(new FlowLayout(FlowLayout.LEFT));

        panel1.add(new JLabel("Nombres"));
        textField1 = new JTextField(10);
        panel1.add(textField1);

        panel1.add(new JLabel("Primer Apellido"));
        textField2 = new JTextField(10);
        panel1.add(textField2);

        panel1.add(new JLabel("Segundo Apellido"));
        textField3 = new JTextField(10);
        panel1.add(textField3);

        button1 = new JButton("Guardar");
        button2 = new JButton("Cancelar");
        panel1.add(button1);
        panel1.add(button2);
    }

    public JPanel getPanel1() {
        return panel1;
    }
}