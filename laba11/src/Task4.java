import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Task4 extends JFrame implements ActionListener {
    JTextField field1, field2, resultField;
    JButton addButton, subButton, mulButton, divButton;

    public Task4() {
        setTitle("Калькулятор");
        setSize(350, 250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2, 5, 5));

        add(new JLabel("Первое число:"));
        field1 = new JTextField();
        add(field1);

        add(new JLabel("Второе число:"));
        field2 = new JTextField();
        add(field2);

        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");

        add(addButton);
        add(subButton);
        add(mulButton);
        add(divButton);

        add(new JLabel("Результат:"));
        resultField = new JTextField();
        resultField.setEditable(false);
        add(resultField);

        addButton.addActionListener(this);
        subButton.addActionListener(this);
        mulButton.addActionListener(this);
        divButton.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            double a = Double.parseDouble(field1.getText());
            double b = Double.parseDouble(field2.getText());
            double result = 0;

            if (e.getSource() == addButton) result = a + b;
            if (e.getSource() == subButton) result = a - b;
            if (e.getSource() == mulButton) result = a * b;
            if (e.getSource() == divButton) {
                if (b == 0) {
                    resultField.setText("Ошибка");
                    return;
                }
                result = a / b;
            }

            resultField.setText(String.valueOf(result));
        } catch (Exception ex) {
            resultField.setText("Ошибка ввода");
        }
    }

    public static void main(String[] args) {
        new Task4();
    }
}