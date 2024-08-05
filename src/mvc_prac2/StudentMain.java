package mvc_prac2;

public class StudentMain {
	public static void main(String[] args) {
		
		StudentModel model = new StudentModel();
		StudentView view =  new StudentView();
		
		StudentController controller =  new StudentController(model, view);
		
//	
		controller.setModel("ed");
		
	}
}
