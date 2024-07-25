package mvc_project1;

public class DemoMVCpattern {
	
	public static void main(String[] args) {
		Student model = stu();
		StudentView view = new StudentView();
		StudentController controller = new StudentController(model, view);
		
//		call the methods 
		controller.updateView();
	}
	
	private static Student stu() {
		Student student = new Student();
		student.setName("Sai");
		student.setRollno("4158");
		return student;
	}
}	
