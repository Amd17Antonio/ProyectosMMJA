package Ejercicio1;
import javax.swing.*;
import java.awt.*;

public class Ejercicio1CardLayout {
    private JPanel panel1;
    private JPanel card1;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JButton button1;
    private JButton button2;

    public Ejercicio1CardLayout() {
        panel1 = new JPanel(new CardLayout());
        card1 = new JPanel(new GridLayout(4, 2, 5, 5));

        card1.add(new JLabel("Nombres"));
        textField1 = new JTextField(10);
        card1.add(textField1);

        card1.add(new JLabel("Primer Apellido"));
        textField2 = new JTextField(10);
        card1.add(textField2);

        card1.add(new JLabel("Segundo Apellido"));
        textField3 = new JTextField(10);
        card1.add(textField3);

        button1 = new JButton("Guardar");
        button2 = new JButton("Cancelar");
        card1.add(button1);
        card1.add(button2);

        panel1.add(card1, "form1");
        ((CardLayout) panel1.getLayout()).show(panel1, "form1");
    }

    public JPanel getPanel1() {
        return panel1;
    }
}