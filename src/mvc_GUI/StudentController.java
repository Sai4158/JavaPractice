package mvc_GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentController {

	//	variables
	private StudentModel model;
	private StudentView view;

	//	make a constructor then bring in the variables 
	public StudentController(StudentModel model, StudentView view) {
		this.model = model;
		this.view = view;

		this.view.addUpdateButtonListener(new UpdateButtonListener());
	}

	// ActionListener class for the update button
	class UpdateButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			
//			this is to set name 
			model.setName(view.getNameField().getText());

//			this is to set the roll
			model.setRollno(Integer.parseInt(view.getRollNoField().getText()));

//          this is to set the car yes or no
			model.setCar(view.getCarCheckBox().isSelected());
			
			
//			this will get all info, this is function in the view 
			view.displayStudentDetails(model.getName(), model.getRollno(), model.isCar());
		}
	}
}
