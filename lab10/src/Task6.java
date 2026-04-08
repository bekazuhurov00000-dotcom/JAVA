import javax.swing.*;
import java.awt.*;

public class Task6 extends JFrame {

    public Task6() {
        setLayout(new FlowLayout());

        JTextField tf = new JTextField(10);
        JButton btn = new JButton("OK");
        JLabel label = new JLabel("");

        add(tf);
        add(btn);
        add(label);

        btn.addActionListener(e ->
            label.setText("Привет, " + tf.getText())
        );

        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Task6();
    }
}