package encaplation_p35;

public class Hw1 {
	
	//Instance variables
	private int age;
	String name;
	
	//first get and set
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	
	public String getName() {
		return name;
	}
	
	//use void when not returning a value
	public void setName(String name) {
		this.name = name;
	}
	
	
	public static void main(String[] args) {
		Hw1 h1 = new Hw1();
		//set the data 
		h1.setAge(19);
		h1.setName("Sai Rangineeni");
		
		//get the data and print it out
		System.out.println("He is: " + h1.getAge() + " yrs old and his name is: " + h1.getName());
		
	}
}
