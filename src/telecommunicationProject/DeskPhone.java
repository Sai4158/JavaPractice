package telecommunicationProject;

public class DeskPhone implements Telephone{

	//Variables 
	private String myNumber;
	private boolean isRinging;
	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("Desk phone always has power");

	}
	@Override
	public void dail(String PhoneNumber) {
		// TODO Auto-generated method stub
		if(isRinging) {
			System.out.println("Now ringing " + PhoneNumber + " on deskphone ");
			isRinging = false;
		}		
		else{
			System.err.println("Phone is not ringing");
		}
	}
	
	@Override
	public void answer() {
		// TODO Auto-generated method stub
		if(isRinging) {
			System.out.println("Now ringing " + myNumber + " on deskphone ");
			isRinging = false;
		}		
		else{
			System.err.println("Phone is not ringing");
		}
	}
	
	
	
//	since this is boolean it must have return type of false or true
	
	@Override
	public boolean CallPhone(String PhoneNumber) {
		// TODO Auto-generated method stub
		if(PhoneNumber == myNumber) {
			System.out.println("Phone is ringing");
		}else {
			System.out.println("");
			isRinging = false;
		}
		return false;
	}
	
	
	
	@Override
	public boolean isRinging() {
		// TODO Auto-generated method stub
		return false;
	}
	

	
}
		