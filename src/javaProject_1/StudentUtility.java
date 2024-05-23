package javaProject_1;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class StudentUtility {
	Scanner sc = new Scanner(System.in);

	//1 Add students 
	
	//obj from the student class 
	public static Student addStudent() {
		
		Scanner sc = new Scanner(System.in);
		Student s  = new Student();
		
		System.out.print("please enter student id: ");
		//will store the id from the scanner 
		s.setsID(sc.nextInt());
		
		System.out.print("please enter Student name: ");
		s.setSname(sc.next());
		
		System.out.print("please enter age: ");
		s.setAge(sc.nextInt());
		
		//return the obj (s)
		return s;
	}
	
	//2 Update the student 
	
	//3 Display the student
	public static void DispayAllStudent(List<Student> student) {
		Iterator<Student> iterator = student.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next().toString());
			
		}
	}
	
	//4 Delete the student
	
}
