package varaibleP14;

public class Student{
	static int id = 101;
	String name = "Sai";
	
	public static void main (String[] args) {
		
		Student student = new Student();
		System.out.println(student.id);
		System.out.println(student.name);
		
		int height = 70;
		System.out.println(height);

		
	}
	public static void test1() {
		System.out.println(id);
	}
}
