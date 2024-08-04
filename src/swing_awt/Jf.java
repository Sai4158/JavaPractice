package swing_awt;

import javax.swing.*;

import java.awt.Color;
import java.awt.event.*;

public class Jf extends JFrame {

    public Jf() {     

        setTitle("Adding 2 nums");

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(700, 600);
        setLayout(null);
        setVisible(true);
        
        // Set background color on the content pane
        getContentPane().setBackground(Color.gray);
        
        JLabel j1  = new JLabel("Enter to 2 numbers to add");
//      50 right, 50 down, 100 width and 30 tall 
        j1.setBounds(50, 25, 200, 10);
        add(j1);
        
        //for input 1
        JTextField num1Field = new JTextField();
        num1Field.setBounds(50, 50, 100, 25);
        add(num1Field);

        //for input 2
        JTextField num2Field = new JTextField();
        num2Field.setBounds(50, 100, 100, 30);
        add(num2Field);

        //button to add
        JButton addButton = new JButton("Add");
        addButton.setBounds(50, 150, 100, 30);
        add(addButton);

        //to show results
        JLabel resultLabel = new JLabel("Total:");
        resultLabel.setBounds(50, 200, 200, 30);
        add(resultLabel);

        // Add ActionListener to the button
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	int num1 = Integer.parseInt(num1Field.getText());
                int num2 = Integer.parseInt(num2Field.getText());

                // Calculate the sum
                int sum = num1 + num2;

                // Set the result to the label
                resultLabel.setText("Result: " + sum);
            }
        });
    }

    
//    Main
    public static void main(String[] args) {
        new Jf();
    }
}
