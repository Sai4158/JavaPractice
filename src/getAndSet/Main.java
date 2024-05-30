package getAndSet;

public class Main {
	public static void main(String[] args) {
		
		Car benz = new Car();
		
		//for the model name
		benz.setmodelName("g63");
		
		//print the get method
		System.out.println(benz.getmodelName());
		
		//-----------
		
		//for doors 
		benz.setdoors(5);
		
		//print them out
		System.out.println(benz.getdoors());
		
		//-----------------
		
		
	}
}
