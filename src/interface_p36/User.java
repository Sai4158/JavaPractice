package interface_p36;

public class User {
	public static void main(String[] args) {
		
		// make the object from the file name
		Lenovo lenovo = new Lenovo();
		//lenovo code 
		lenovo.copy();
		lenovo.paste();
		lenovo.camera();
		lenovo.security();
		
		
		System.out.println();
		
		//code from hp file 
		HP hp = new HP();
		hp.printing();
		
		System.out.println();
		
		//static 
		laptop.audio();
		
	}
}
