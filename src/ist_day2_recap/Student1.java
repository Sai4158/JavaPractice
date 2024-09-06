package ist_day2_recap;

public class Student1 {
	
//	instance variables 
	private String name;
	private	double gpa;
	
//	constructors 
	public Student1(String name, double gpa) {
		this.name = name;
		this.gpa = gpa;
	}

	
	//	get methods 
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getGpa() {
		return gpa;
	}


	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	
//	to String 
	@Override
	public String toString() {
		return "name= " + name + ", gpa= " + gpa;
	}



	
	
}
