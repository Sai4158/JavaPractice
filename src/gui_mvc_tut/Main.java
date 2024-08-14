package gui_mvc_tut;

public class Main {	
	public static void main(String[] args) {
		
		CalculatorView theView = new CalculatorView();
		CalculatorModel theModel = new CalculatorModel();
		CalcController theController = new CalcController(theView, theModel);
		
		
	}
}
