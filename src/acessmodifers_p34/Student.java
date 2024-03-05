package acessmodifers_p34;

public class Student {
		//u can access private varibles in this class only
		// public u can access it everywhere
	public int rollno = 100;
	public  Student() {
		rollno = 105;
	}
	public void printRollNumber() {
		System.out.println(rollno);
	}
}
