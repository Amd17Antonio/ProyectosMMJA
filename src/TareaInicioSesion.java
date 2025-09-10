import javax.swing.*;

public class TareaInicioSesion extends JFrame {
    private JPanel PanelPrincipal;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JCheckBox checkBox1;
    private JButton button1;
    private JPanel PanelCentral;
    private JLabel JLabel;
    private JLabel labelUsuario;

    public TareaInicioSesion() {
        setTitle("Inicio de Sesión");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 300);
        setLocationRelativeTo(null);

        PanelPrincipal = new JPanel();
        PanelPrincipal.setLayout(null); // Layout nulo

        // Componentes
        labelUsuario = new JLabel("Usuario:");
        textField1 = new JTextField();
        passwordField1 = new JPasswordField();
        checkBox1 = new JCheckBox("Recordar usuario");
        button1 = new JButton("Ingresar");

        // Posiciones y tamaños fijos (x, y, ancho, alto)
        labelUsuario.setBounds(50, 50, 80, 25);
        textField1.setBounds(140, 50, 150, 25);
        passwordField1.setBounds(140, 90, 150, 25);
        checkBox1.setBounds(140, 130, 150, 25);
        button1.setBounds(140, 170, 100, 30);

        // Agregar componentes
        PanelPrincipal.add(labelUsuario);
        PanelPrincipal.add(textField1);
        PanelPrincipal.add(passwordField1);
        PanelPrincipal.add(checkBox1);
        PanelPrincipal.add(button1);

        setContentPane(PanelPrincipal);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TareaInicioSesion());
    }
}
