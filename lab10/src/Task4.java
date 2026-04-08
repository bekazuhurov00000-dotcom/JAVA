import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Task4 extends JFrame {
    JLabel label;

    public Task4() {
        setLayout(new FlowLayout());

        JButton btn = new JButton("Click");
        label = new JLabel("");

        add(btn);
        add(label);

        btn.addActionListener(e -> label.setText("Button clicked!"));

        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Task4();
    }
}