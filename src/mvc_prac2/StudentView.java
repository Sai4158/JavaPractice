package mvc_prac2;

public class StudentView {
	
	public void printStudent(String Studentname, int StudentROll, boolean car) {
		
        System.out.println("Student: ");
		System.out.println("Name : " + Studentname);
		System.out.println("Roll Num : " + StudentROll);
		
		System.out.println();
		System.out.println("Car yes or no? ");
		System.err.println("Answer: " + car);
	}
}
