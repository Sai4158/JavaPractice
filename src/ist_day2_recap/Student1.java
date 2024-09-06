package ist_day2_recap;

// this is how you can add the comparable tyoe
public class Student1 implements Comparable<Student1>{

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

	//	add the unimplemented methods 
	@Override
	public int compareTo(Student1 o) {

		if (this.gpa < o.gpa) {
			return -1; // Current student has lower GPA
		} else if (this.gpa == o.gpa) {
			return 0;  // GPAs are equal
		} else {
			return 1;  // Current student has higher GPA
		}
	}





}
