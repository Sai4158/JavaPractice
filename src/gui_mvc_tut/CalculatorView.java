package gui_mvc_tut;

import java.awt.event.ActionListener;

import javax.swing.*;


public class CalculatorView extends JFrame {
	
	private JTextField firstNum = new JTextField(10);
	private JLabel additionLabel = new JLabel("+");
	private JTextField secondNum = new JTextField(10);
	private JButton sumButton = new JButton("Calculate");
	private JTextField calculationResult = new JTextField(10);
	
	public CalculatorView() {
		JPanel calcPanel = new JPanel();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600, 200);
		this.setVisible(true);
		this.setLayout(null);
		
		// Add components to the panel
		calcPanel.add(firstNum);
		calcPanel.add(additionLabel);
		calcPanel.add(secondNum);
		calcPanel.add(sumButton);
		calcPanel.add(calculationResult);
		
		this.add(calcPanel); 
	}
	
	public int getFirstNum() {
		return Integer.parseInt(firstNum.getText());
	}
	
	public int getSecondNum() {
		return Integer.parseInt(secondNum.getText());
	}
	
	public int getCalculationValue() {
		return Integer.parseInt(calculationResult.getText());
	}
	
	public void setCalculationValue(int value) {
		calculationResult.setText(Integer.toString(value));
	}
	
	public void addCalculationListener(ActionListener listenForCalcButton) {
		sumButton.addActionListener(listenForCalcButton);
	}
	
	public void displayErrorMessage(String errorMessage) {
		JOptionPane.showMessageDialog(this, errorMessage);
	}
}