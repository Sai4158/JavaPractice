package mvc_prac2;

public class StudentController {

	//	get the class names 
	private StudentModel model;
	private StudentView view;


	//	then add a constructor 
	public StudentController(StudentModel model, StudentView view) {
		this.model = model;
		this.view =  view;
		
	}

	
//	set and get
	public StudentModel getModel() {
		return model;
	}


	public void setModel(StudentModel model) {
		this.model = model;
	}


	public StudentView getView() {
		return view;
	}


	public void setView(StudentView view) {
		this.view = view;
	}

	
}
