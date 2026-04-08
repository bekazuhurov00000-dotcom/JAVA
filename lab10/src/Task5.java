import javax.swing.*;
import java.awt.*;

public class Task5 extends JFrame {
    int count = 0;
    JLabel label;

    public Task5() {
        setLayout(new FlowLayout());

        JButton btn = new JButton("Click");
        label = new JLabel("0");

        add(btn);
        add(label);

        btn.addActionListener(e -> {
            count++;
            label.setText("Clicks: " + count);
        });

        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Task5();
    }
}