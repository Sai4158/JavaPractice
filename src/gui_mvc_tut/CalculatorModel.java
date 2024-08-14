package gui_mvc_tut;

public class CalculatorModel {
	
	private int calculationValue;
	
	public void  addTwoNumbers(int firstNum, int secondNum) {
		
		calculationValue = firstNum + secondNum;
	}

	
//	get and set 
	
	public int getCalculationValue() {
		return calculationValue;
	}
	
}
