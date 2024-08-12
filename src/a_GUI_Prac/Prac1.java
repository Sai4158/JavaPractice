package a_GUI_Prac;

import javax.swing.*;

public class Prac1 extends JFrame {
	
	public void build() {
//		setting up the window 
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400,300);
		
//		make a JPanel
		 JPanel panel = new JPanel();
//		 make sure to add the JPanel
		 add(panel);
		 
	     // Creating Username Label
	        JLabel userLabel = new JLabel("User:");
	        userLabel.setBounds(10, 20, 80, 25);
	        panel.add(userLabel);

	        // Creating Username Text Field
	        JTextField userText = new JTextField(20);
	        userText.setBounds(100, 20, 165, 25);
	        panel.add(userText);

	        // Creating Password Label
	        JLabel passwordLabel = new JLabel("Password:");
	        passwordLabel.setBounds(10, 50, 80, 25);
	        panel.add(passwordLabel);

	        // Creating Password Text Field
	        JPasswordField passwordText = new JPasswordField(20);
	        passwordText.setBounds(100, 50, 165, 25);
	        panel.add(passwordText);

	        // Creating Login Button
	        JButton loginButton = new JButton("Login");
	        loginButton.setBounds(10, 80, 80, 25);
	        panel.add(loginButton);
		 
	}
	
	public static void main(String[] args) {
		Prac1 abc = new Prac1();
		abc.build();
	}
}
