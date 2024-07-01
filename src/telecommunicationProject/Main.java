package telecommunicationProject;

public class Main {
	public static void main(String[] args) {
		
		DeskPhone phone  = new DeskPhone("23432434");
		
		//Print out the methods using the objects
		phone.powerOn();
		
		//this will take string as a number 
		phone.CallPhone("123456789");

		phone.answer();
	}
}	
