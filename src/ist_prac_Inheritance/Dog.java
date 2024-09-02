package ist_prac_Inheritance;

public class Dog extends Pet {
	
//	Constructor
    public Dog(String name, String breed) {
        super(name, breed);  
    }

//    method 1 
    public String doTrick(String command) {
        if ("sit".equals(command) || "speak".equals(command)) {
            return String.format("%s did the trick %s", this.getName(), command);
        } else {
            return String.format("%s stares at you", this.getName());
        }
    }

//  method 2
    public String makeSound() {
        return "woof";
    }
}
