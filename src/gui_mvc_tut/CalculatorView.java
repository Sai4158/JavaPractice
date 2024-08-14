package gui_mvc_tut;

import java.awt.event.ActionListener;

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
		
//		now add the stuff to the pannels
		
		calcPannel.add(firstNum);
		calcPannel.add(additionLabel);
		calcPannel.add(secondNum);
		calcPannel.add(sum);
		calcPannel.add(calcution);
		
		this.add(calcPannel); 
	}


	public JTextField getFirstNum() {
		return firstNum;
	}


	public void setFirstNum(JTextField firstNum) {
		this.firstNum = firstNum;
	}


	public JLabel getAdditionLabel() {
		return additionLabel;
	}


	public void setAdditionLabel(JLabel additionLabel) {
		this.additionLabel = additionLabel;
	}


	public JTextField getSecondNum() {
		return secondNum;
	}


	public void setSecondNum(JTextField secondNum) {
		this.secondNum = secondNum;
	}


	public JButton getSum() {
		return sum;
	}


	public void setSum(JButton sum) {
		this.sum = sum;
	}


	public JTextField getCalcution() {
		return calcution;
	}


	public void setCalcution(JTextField calcution) {
		this.calcution = calcution;
	}
	
	
	void addCalculationListener(ActionListener listenForCalcButton) {
		
		calcution.addActionListener(listenerForCalcButton);
	}
	
	

}
