package abstraction_p37;

public abstract class ThirdParty implements Laptop {

	public void cameraa() {
		System.out.println("camera code");
		
	}
	
	//if u did not mention it in the interface class then u should mention
	// abstract here to make a it a abstract class 
	
	public abstract void mic();
}
