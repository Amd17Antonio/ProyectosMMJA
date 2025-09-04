package Main;

import Ejercicio1.Ejercicio1;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Formulario Ejercicio 1");
            frame.setContentPane(new Ejercicio1().getPanel1());
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setLocationRelativeTo(null); // Centra la ventana
            frame.setVisible(true);
        });
    }
}
