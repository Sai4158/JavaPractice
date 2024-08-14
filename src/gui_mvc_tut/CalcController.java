package gui_mvc_tut;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
			int firstNum, secondNum = 0;
			
			try {
				// Get the numbers from the view
				firstNum = Integer.parseInt(theView.getFirstNum().getText());
				secondNum = Integer.parseInt(theView.getSecondNum().getText());
				
				// Perform the calculation using the model
				theModel.addTwoNumbers(firstNum, secondNum);
				
				// Update the view with the result
				theView.setCalculationValue(theModel.getCalculationValue());
			} catch (NumberFormatException ex) {
				theView.displayErrorMessage("Please enter valid numbers.");
			}
		}
	}
}

