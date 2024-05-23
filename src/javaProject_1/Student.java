package javaProject_1;

public class Student {
	// Variables
	private int sID;
	private String sname;
	private int age;

	//non parameter constructor
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	//constructor 
	public Student(int sID, String sname, int age) {
		super();
		this.sID = sID;
		this.sname = sname;
		this.age = age;
	}

	//set and get
	public int getsID() {
		return sID;
	}

	public void setsID(int sID) {
		this.sID = sID;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	//to string
	@Override
	public String toString() {
		return "Student [sID=" + sID + ", sname=" + sname + ", age=" + age + "]";
	}

}
