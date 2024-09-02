package ist_prac_Inheritance;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		
        Dog dog1 = new Dog("Duke", "German Shepherd");
        Dog dog2 = new Dog("Aston", "golden retriver");

		System.out.println(dog);
		System.out.println(dog.doTrick("sit"));
		System.out.println(dog.makeSound());
		
		ArrayList<Pet> pets = new ArrayList<Pet>();
		pets.add(dog1);
		pets.add(dog2);
	}
}

//Duke German Shepherd
//Duke did the trick sit
//woof
