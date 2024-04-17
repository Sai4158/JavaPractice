package interface_p36;

public interface laptop {
	
	//what to do 
	public  void copy();
	
	public  void paste();
	
	public void sub();
	
	public  void cut();
	
	public  void keyboard();
	
	default void security() {
		System.out.println("Please implent");
	}
	
	static void audio() {
		System.out.println("Laptop code");
		sound();
	}
	
	//make sure it is static so u can use it in this is file 
	private static void sound(){
		System.out.println("good audio");
	}
	
	
}
