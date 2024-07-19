package aa_prac1;

public class Nums implements NumTest {

	private String two;
	public void  a() {
		System.out.println("this is for a");
	}
	public void  b() {
		System.out.println("this is for b");

	}
	public void  c() {
		System.out.println("this is for c");

	}
	public void  d() {
		System.out.println("this is for d");

	}
	
//	this is adding methods from the interface
	public void Abc(String two) {
		this.two =  two;
		// TODO Auto-generated method stub
		System.out.println("hello" + two);
	}
	@Override
	public void nums() {
		// TODO Auto-generated method stub
		System.out.println("1 2 3 4 5");

	}
	@Override
	public void cars() {
		// TODO Auto-generated method stub
		System.out.println("audi");

	}
}
