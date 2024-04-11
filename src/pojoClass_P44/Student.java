package pojoClass_P44;

import java.io.Serializable;

public class Student implements Serializable {
	
	//must make the private
	private int id;
	private String name;
	private double grade;
	
	//this is a constructor 
	public Student(int id, String name) {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}
}
