package gui_mvc_tut;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcController {
	
	private CalculatorView theView;
	private CalculatorModel theModel;
	
	public CalcController( CalculatorView theView, CalculatorModel theModel) {
		
		this.theModel = theModel;
		this.theView =  theView;
		
		
		this.theView.addCalculationListener(new calculatListener());
		
	}}
	


	class calculatListener implements ActionListener() {
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int firstnum =
	}}


