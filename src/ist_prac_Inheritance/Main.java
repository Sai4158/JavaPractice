Apackage ist_prac_Inheritance;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
	public static void main(String[] args) {
		
        Dog dog1 = new Dog("Duke", "German Shepherd");
        Dog dog2 = new Dog("Aston", "golden retriver");

		
		ArrayList<Pet> pets = new ArrayList<Pet>();
		pets.add(dog1);
		pets.add(dog2);
		
		
		for (int i = 0; i < pets.size(); i++) {
			System.out.println(pets.get(i));
			System.out.println(pets.get(i).doTrick("sit"));
			System.out.println(pets.get(i).makeSound());
			
			System.out.println("----------------");

		}
	}
}

//Duke German Shepherd
//Duke did the trick sit
//woof
//----------------
//Aston golden retriver
//Aston did the trick sit
//woof
