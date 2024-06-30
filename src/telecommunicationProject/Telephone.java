package telecommunicationProject;

public interface Telephone {
	//power on
	void powerOn();
	
	//dial a number 
	void dail(String PhoneNumber);
	
	//answer phone call 
	void answer();
	
	//call another phone
	//boolean -  true or false
	// this will take input of String PhoneNumber
	boolean CallPhone(String PhoneNumber);
	
	//is ringing 
	boolean isRinging();
}
