package mvc_project1;
// this is controller class 

public class StudentController {
// so the whole point of the controller is to control view and model objects 
	
//	model object 
//	view object
	
	private  Student model;
	private  StudentView view;
	
//	this is a student controller class
	public StudentController(Student model,StudentView view ) {
		this.model = model;
		this.view =  view;
	}
	
//	these are sets and gets 
	public void setStudentName(String name) {
		model.setName("sai");
	}
	public void setstudentRollNum(String rollno) {
		model.setRollno("123");
	}
}
