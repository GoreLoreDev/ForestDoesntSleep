import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener {

    JFrame frame;
    JTextField t1, t2, result;
    JButton add, sub, mul, div;

    Calculator() {
        frame = new JFrame("Simple Calculator");

        // Text fields
        t1 = new JTextField();
        t2 = new JTextField();
        result = new JTextField();
        result.setEditable(false);

        // Buttons
        add = new JButton("+");
        sub = new JButton("-");
        mul = new JButton("*");
        div = new JButton("/");

        // Set bounds
        t1.setBounds(50, 30, 150, 30);
        t2.setBounds(50, 70, 150, 30);
        result.setBounds(50, 110, 150, 30);

        add.setBounds(220, 30, 50, 30);
        sub.setBounds(220, 70, 50, 30);
        mul.setBounds(280, 30, 50, 30);
        div.setBounds(280, 70, 50, 30);

        // Add components
        frame.add(t1); frame.add(t2); frame.add(result);
        frame.add(add); frame.add(sub);
        frame.add(mul); frame.add(div);

        // Add action listeners
        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);

        frame.setSize(400, 250);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            double num1 = Double.parseDouble(t1.getText());
            double num2 = Double.parseDouble(t2.getText());
            double res = 0;

            if (e.getSource() == add)
                res = num1 + num2;
            else if (e.getSource() == sub)
                res = num1 - num2;
            else if (e.getSource() == mul)
                res = num1 * num2;
            else if (e.getSource() == div)
                res = num1 / num2;

            result.setText(String.valueOf(res));
        } catch (Exception ex) {
            result.setText("Error");
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}