package inheritance;

public class Admin extends Developer{

	public void manage() {
		//must use super if u want refer to orginal class
		//f3 to check 
		super.read();
		write();
		System.out.println("manage code");
	}
	//if u dont use super. it will get u here after f3
	public void read() {
		System.out.println("did not use super class");

	}
}
