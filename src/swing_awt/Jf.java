package swing_awt;

import javax.swing.*;
import java.awt.event.*;

public class Jf extends JFrame {

    public Jf() {
        setTitle("Addition Example");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLayout(null);
        setVisible(true);

        JLabel j1  = new JLabel("Enter to 2 numbers to add");
        j1.setBounds(50, 25, 200, 10);
        add(j1);
        
        // Create JTextFields for input
        JTextField num1Field = new JTextField();
//        50 right, 50 down, 100 width and 30 tall 
        num1Field.setBounds(50, 50, 100, 25);
        add(num1Field);

        JTextField num2Field = new JTextField();
        num2Field.setBounds(50, 100, 100, 30);
        add(num2Field);

        // Create a JButton to perform addition
        JButton addButton = new JButton("Add");
        addButton.setBounds(50, 150, 100, 30);
        add(addButton);

        // Create a JLabel to display the result
        JLabel resultLabel = new JLabel("Result:");
        resultLabel.setBounds(50, 200, 200, 30);
        add(resultLabel);

        // Add ActionListener to the button
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Get numbers from text fields
                    int num1 = Integer.parseInt(num1Field.getText());
                    int num2 = Integer.parseInt(num2Field.getText());

                    // Calculate the sum
                    int sum = num1 + num2;

                    // Set the result to the label
                    resultLabel.setText("Result: " + sum);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Invalid input");
                }
            }
        });

    }

    
//    Main
    public static void main(String[] args) {
        new Jf();
    }
}
