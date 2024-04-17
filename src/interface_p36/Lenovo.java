package interface_p36;

//use implements for interface not extends
public class Lenovo implements laptop{

	@Override
	public void copy() {
		System.out.println("Lenovo Copy code");
		
	}

	@Override
	public void paste() {
		System.out.println("Lenovo paste code");
		
	}

	@Override
	public void cut() {
		System.out.println("Lenovo cut code");
		
	}

	@Override
	public void keyboard() {
		System.out.println("Lenovo keyboard code");
	}		
	
	public void camera() {
	System.out.println("Lenovo camera code");
	
	}
	
	public void security() {
			System.out.println("Please implent1 ");
	}
	
	
	

	public void sub() {
		System.out.println("Lenvo sub");
		
	}
}
