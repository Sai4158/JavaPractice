package telecommunicationProject;

public class Main {
	public static void main(String[] args) {
		
		DeskPhone phone  = new DeskPhone("123456789");
		
		//Print out the methods using the objects
		phone.powerOn();
		
		//this will take string as a number 
		phone.CallPhone("123456789");

		phone.answer();
		
		
//		This is for the mobile phone 
		
		System.out.println("----------------------------");
		System.out.println("This is for the phone class");
		
		
		//whatever is in the mobile class it needs to have the same num so it can call
		MobileClass mobile = new MobileClass("1255234");
		
		mobile.powerOn();
		mobile.callPhone("1255234");
		mobile.answer();
	}
}	



//Desk phone always has power
//Phone is ringing
//Now ringing 123456789 on deskphone 
//----------------------------
//This is for the phone class
//Phone Powered On
//Phone is ringing
//Answering the phone
