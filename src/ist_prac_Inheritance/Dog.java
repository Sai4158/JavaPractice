package ist_prac_Inheritance;

public class Dog extends Pet {
//	make sure to declacre a variable here
	private String breed;
	
	public Dog(String name, String breed) {
		super(name);
		this.breed =  breed;
	}

	public  String DoTrick(String Command) {
		if (Command.compareTo("sit")==0 || Command.compareTo("speak")==0) {
			return String.format("%s did the trick %s", this.getName(), Command);
		} else {
			return String.format("%s stares at you ", this.getName());
		}
	}
	
//	set and gets 
	
	public String makeSound() {
		return "woof";
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	
}
