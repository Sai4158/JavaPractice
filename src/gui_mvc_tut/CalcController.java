package gui_mvc_tut;

import java.awt.event.*;

public class CalcController {
	
	private CalculatorView theView;
	private CalculatorModel theModel;
	
	public CalcController(CalculatorView theView, CalculatorModel theModel) {
		this.theModel = theModel;
		this.theView = theView;
		
		// Add action listener for the calculate button
		this.theView.addCalculationListener(new CalculateListener());
	}
	
	class CalculateListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			// Get the numbers from the view
			int firstNum = theView.getFirstNum();
			int secondNum = theView.getSecondNum();
			
			// Perform the calculation using the model
			theModel.addTwoNumbers(firstNum, secondNum);
			
			// Update the view with the result
			theView.setCalculationValue(theModel.getCalculationValue());
		}
	}
}
