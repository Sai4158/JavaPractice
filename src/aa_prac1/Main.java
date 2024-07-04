package aa_prac1;

public class Main {
	public static void main(String[] args) {
		
		Combine phone  = new Combine();
		
		//this phone has 7 sim cards
		phone.sim(2+5);
		
		//this is for the speaker
		phone.speaker();
		
		//this is for the display
		phone.display();
		
		//this is for the camera
		phone.camera();
		
	
		//this will take a true of false 
		phone.flashLight(true);
		
	}
}
