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
	 public void setStudentName(String name) {
	        model.setName(name);
	    }

	    public String getStudentName() {
	        return model.getName();
	    }

	    public void setStudentRollNo(int rollNo) {
	        model.setRollNo(rollNo);
	    }

	    public int getStudentRollNo() {
	        return model.getRollNo();
	    }
	    
	    public boolean isCar() {
			return model.isCar();
		}
		public void setCar(boolean car) {
		 model.setCar(car);
		
		}
	    
//	    this will update the view
	    public void updateView() {
	        view.printStudent(model.getName(), model.getRollNo(), model.isCar());
	    }

	
}
