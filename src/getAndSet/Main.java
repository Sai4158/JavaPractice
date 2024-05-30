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

		//for doors 
		benz.Gears(7);

		//print them out
		System.out.println(benz.getgears());

		//-----------------

		//for doors 
		benz.setColor("Red");

		//print them out
		System.out.println(benz.getColor());

		//---------------
		//Printing it right
		System.out.println("this is a " + benz.getmodelName() + ", it has " + benz.getdoors() + " doors and it is a " + benz.getColor() + " colored car.");

	}
}
