import javax.swing.*;
import java.awt.*;

public class Task1 extends JPanel {

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Прямоугольник
        g.drawRect(50, 50, 100, 60);
        g.drawString("Rectangle", 60, 45);

        // Круг
        g.drawOval(200, 50, 80, 80);
        g.drawString("Circle", 210, 45);

        // Линия
        g.drawLine(50, 150, 200, 150);
        g.drawString("Line", 110, 140);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Task1");
        frame.add(new Task1());
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}