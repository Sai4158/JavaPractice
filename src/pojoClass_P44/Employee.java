package pojoClass_P44;

public class Employee {

	//instance variables
	private int id;
	public String name;
	protected double salary;
	
	public Employee(int id) {
		this.id = id;
	}
	
	//parameter less constructor
	public Employee() {
		System.out.println("No args const is called");
	}

	//this is a setter
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
}
