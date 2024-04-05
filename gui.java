import javax.swing.*;
import java.awt.*;

public class gui {
    private JFrame frame;
    private JPanel panel;
    private JButton login;
    private JTextField username;
    private JPasswordField password;
    private ImageIcon ear_img;

    public gui() {
        frame = new JFrame();
        frame.setSize(600, 800);
        frame.setTitle("Login Page");
        
        ear_img = new ImageIcon("./img/ear.png");
        JLabel label_upper_left = new JLabel(ear_img);


        panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBackground(Color.ORANGE);
        
        username = new JTextField();
        username.setMaximumSize(username.getPreferredSize());
        username.setAlignmentX(Component.CENTER_ALIGNMENT);

        password = new JPasswordField(20);
        password.setMaximumSize(password.getPreferredSize());
        password.setAlignmentX(Component.CENTER_ALIGNMENT);

        login = new JButton();
        login.setBackground(Color.decode("#243946"));

        panel.add(label_upper_left, BorderLayout.WEST);
        panel.add(Box.createHorizontalGlue());
        panel.add(username);
        panel.add(password);
        panel.add(login);
        panel.add(Box.createHorizontalGlue());

        frame.add(panel);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);     // Click to the cross icon will close terminal
    }
}
