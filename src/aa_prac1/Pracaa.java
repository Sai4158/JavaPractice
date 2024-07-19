package aa_prac1;

public class Pracaa {
	static int number = 2;
	int im = 24;

	public static void main(String[] args) {
		
//		Revision 
		
		//this for the static variables 
		
	// this will print the class variables 
		System.out.println(number);
		
     //since this is non static you need to create a object to access it
		Pracaa ibm  = new Pracaa();
		System.out.println(ibm.im);
	}
}
