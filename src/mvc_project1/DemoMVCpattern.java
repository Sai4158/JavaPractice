package mvc_project1;

public class DemoMVCpattern {
	
	public static void main(String[] args) {
		Student model = stu();
		StudentView view = new StudentView();
		StudentController controller = new StudentController(model, view);
		
//		this will update the data 
		controller.updateView();
		
//		add data using the set methods
		controller.setStudentName("audi");
		controller.setStudentRollNum("999");
		
//		then update it 
		System.out.println();
		controller.updateView();

	}
	
	private static Student stu() {
		Student student = new Student();
		student.setName("Sai");
		student.setRollno("4158");
		return student;
	}
}	
