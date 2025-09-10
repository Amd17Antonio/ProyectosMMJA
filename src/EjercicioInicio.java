import javax.swing.*;
import java.awt.*;

public class EjercicioInicio {
    private JPanel panel1;
    private JTextField JTextField1;
    private JPasswordField JPasswordField;
    private JCheckBox JCheckBox;
    private JButton JButton;
    private JLabel Icon;
    private JLabel JLabelT;

    public EjercicioInicio() {

        if (Icon == null) {
            Icon = new JLabel();
            panel1.add(Icon);
        }

        // Escalar la imagen del JLabel
        if (Icon.getIcon() != null) {
         ImageIcon original = (ImageIcon) Icon.getIcon();
         Image img = original.getImage();
         Image scaled = img.getScaledInstance(80, 80, Image.SCALE_SMOOTH);
          Icon.setIcon(new ImageIcon(scaled));
        } else {
          Icon.setText("ICONO");
          Icon.setHorizontalAlignment(SwingConstants.CENTER);
          Icon.setVerticalAlignment(SwingConstants.CENTER);
        }

        // Posiciones fijas de los componentes
        Icon.setBounds(160, 20, 80, 80);
        if (JLabelT != null) JLabelT.setBounds(100, 120, 80, 25);
        if (JTextField1 != null) JTextField1.setBounds(180, 120, 150, 25);
        if (JPasswordField != null) JPasswordField.setBounds(180, 160, 150, 25);
        if (JCheckBox != null) JCheckBox.setBounds(180, 200, 150, 25);
        if (JButton != null) JButton.setBounds(180, 240, 100, 30);

        JTextField1.setMaximumSize(JTextField1.getPreferredSize());
        JTextField1.setMinimumSize(JTextField1.getPreferredSize());

        JPasswordField.setMaximumSize(JPasswordField.getPreferredSize());
        JPasswordField.setMinimumSize(JPasswordField.getPreferredSize());

        JCheckBox.setMaximumSize(JCheckBox.getPreferredSize());
        JCheckBox.setMinimumSize(JCheckBox.getPreferredSize());

        JButton.setMaximumSize(JButton.getPreferredSize());
        JButton.setMinimumSize(JButton.getPreferredSize());

    }

    public JPanel getPanel1() {
        return panel1;
    }
}

class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Inicio");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 300);
            frame.setLocationRelativeTo(null);
            frame.setMinimumSize(new Dimension(400, 300)); // evita que se haga más pequeña

            EjercicioInicio ui = new EjercicioInicio();
            frame.setContentPane(ui.getPanel1());

            frame.setVisible(true);
        });
    }
}
