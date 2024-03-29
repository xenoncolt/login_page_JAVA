import javax.swing.*;
import java.awt.*;

public class gui {
    private JFrame frame;
    private JPanel panel;
    private JButton btn;

    public gui() {
        frame = new JFrame();
        frame.setSize(600, 800);
        frame.setVisible(true);
        frame.setTitle("Login Page");
        

        panel = new JPanel();
        panel.setBackground(Color.ORANGE);
        

        frame.add(panel);

        
    }
}
