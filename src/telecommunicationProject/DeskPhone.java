package telecommunicationProject;

public class DeskPhone implements Telephone{

	//Variables 
	private String myNumber;
	private boolean isRinging;
	
	//constructor 
	public DeskPhone(String myNumber) {
		this.myNumber = myNumber;
	}

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("Desk phone always has power");
	}

	@Override
	public void number( ) {
		// TODO Auto-generated method stub
		if(isRinging) {
			System.out.println("Now ringing " + myNumber + " on deskphone ");
			isRinging = false;
		}		
		else{
			System.err.println("Phone is not ringing");
		}
	}

	@Override
	public void phoneCall() {
		// TODO Auto-generated method stub
		if(isRinging) {
			System.out.println("Now ringing " + myNumber + " on deskphone ");
			isRinging = false;
		}		
		else{
			System.err.println("Phone is not ringing");
		}
	}

	@Override
	public void anotherPhgone() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ringing() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
    public boolean isRinging() {
        return false;
    }
}
