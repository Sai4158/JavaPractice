package ist_day2_recap;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class TesterClass {
	public static void main(String[] args) {		
		ArrayList<Student1> students =  new ArrayList<Student1>();
		students.add(new Student1("Sai",3.97));
		students.add(new Student1("wqd",4.04));
		students.add(new Student1("vds",2.65));
		
		System.out.println(students);
		
		Collections.sort(students);
		
		System.out.println(students);

	}
}

//[name= Sai, gpa= 3.97, name= wqd, gpa= 4.04, name= vds, gpa= 2.65]
//[name= vds, gpa= 2.65, name= Sai, gpa= 3.97, name= wqd, gpa= 4.04]