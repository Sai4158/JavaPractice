package ist_prac_Inheritance;

public class Main {
	public static void main(String[] args) {
		
        Dog dog = new Dog("Duke", "German Sheperad");
		
		System.out.println(dog);
		System.out.println(dog.doTrick("sit"));
		System.out.println(dog.makeSound());
	}
}

