package gui_mvc_tut;

import javax.swing.*;


public class CalculatorView extends JFrame{
	
//	make a input box to enter the text
	private JTextField firstNum = new JTextField(10);
	
	private JLabel additionLabel =  new JLabel("+");
	
	private JTextField secondNum = new JTextField(10);
	
	private JButton sum = new JButton("Calculate");
	
	private JTextField calcution = new JTextField(10);
	
	
	CalculatorView() {
		JPanel calcPannel = new JPanel();
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(600,200);
		this.setVisible(true);
		this.setLayout(null);
		
		
	}
	
	

}
