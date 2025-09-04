package Main;

import Ejercicio1.Ejercicio1;
import Ejercicio1.*;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Formulario Ejercicio 1");

            // Ejercicios con los diferentes tipos de Layout y descomentar
            //frame.setContentPane(new Ejercicio1BorderLayout().getPanel1());
            //frame.setContentPane(new Ejercicio1CardLayout().getPanel1());
            //frame.setContentPane(new Ejercicio1FlowLayout().getPanel1());
            //frame.setContentPane(new Ejercicio1FormLayout().getPanel1());
            //frame.setContentPane(new Ejercicio1GridBagLayout().getPanel1());
            //frame.setContentPane(new Ejercicio1GridLayout().getPanel1());

            // Ejercicio de clase
            frame.setContentPane(new Ejercicio1().getPanel1());
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}
