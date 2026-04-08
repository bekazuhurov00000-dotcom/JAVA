import javax.swing.*;
import java.awt.*;

public class Task7 extends JPanel {
    Color color = Color.BLACK;

    public Task7() {
        JButton red = new JButton("Red");
        JButton green = new JButton("Green");
        JButton blue = new JButton("Blue");

        add(red);
        add(green);
        add(blue);

        red.addActionListener(e -> { color = Color.RED; repaint(); });
        green.addActionListener(e -> { color = Color.GREEN; repaint(); });
        blue.addActionListener(e -> { color = Color.BLUE; repaint(); });
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(color);
        g.fillOval(100, 100, 80, 80);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame("Task7");
        f.add(new Task7());
        f.setSize(400, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}