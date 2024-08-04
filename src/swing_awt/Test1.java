package swing_awt;

import java.awt.TextField;

import javax.swing.*;

public class Test1 extends JFrame {
	
	public void sw() {
		setVisible(true);
		setSize(600,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("practice window");
		
		
//		jLabel 
		JLabel JL = new JLabel("Enter text here");
		add(JL);
//		x, y 
		JL.setBounds(15, 5, 200, 5);
		
		
//		textFlied 
		TextField tt = new TextField();
		add(tt);
		tt.setBounds(15, 35, 200, 5);

		
		JLabel JL1 = new JLabel("Enter text here");
		add(JL1);
		JL1.setBounds(15, 45, 200, 5);

		
//		textFlied 
		TextField tt1 = new TextField();
		add(tt1);
		tt1.setBounds(15, 55, 200, 5);

		
	}
	
	public static void main(String[] args) {
		Test1 abc = new Test1();
		abc.sw();
	}
}
