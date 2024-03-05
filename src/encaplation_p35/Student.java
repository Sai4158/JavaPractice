package encaplation_p35;

public class Student {
	int rollno;
	String name;
	boolean isAttended;
	
	public Student(int rollno) {
		this.rollno = rollno;
		System.out.println(rollno);
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isAttended() {
		
		return isAttended;
	}

	public void setAttended(boolean isAttended) {
		if(!isAttended)
			isAttended = isAttended;
			System.out.println("done");
		
		
		
	}
	
	
}
