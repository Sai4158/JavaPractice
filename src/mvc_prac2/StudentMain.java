package mvc_prac2;

public class StudentMain {
	public static void main(String[] args) {
		
		StudentModel model = new StudentModel();
		StudentView view =  new StudentView();
		
		StudentController controller =  new StudentController(model, view);
		
	
//		Set the values 
		controller.setStudentName("Sai");
		controller.setStudentRollNo(4158);
		
		
//		make sure to update the view 
        controller.updateView();

	}
}

//Student: 
//Name : Sai
//Roll Num : 4158