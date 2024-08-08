package mvc_GUI;

public class Main {
	public static void main(String[] args) {
		
//		import all the classes here so they work
		 StudentModel model = new StudentModel();
		 StudentView view = new StudentView();
		 StudentController controller = new StudentController(model, view);
		
	}
}
