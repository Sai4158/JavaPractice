package javaProject_1;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

import switch_p20.Switch;

public class StudentTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Student> StudentList = new ArrayList<Student>();
		
		while (true) {
			System.out.println("Student project management");
			System.out.println("==============");

			// \n = new line
			System.out.println("1.Add Student\n2.Update Student\n3.Display all strings\n4.Delete Student\n5.Exit\n");

			System.out.println("please select operations: ");
			int option = sc.nextInt();


			//switch for particular operation 
			switch (option) {
			case 1: {

				//add values
				Student  student = StudentUtility.addStudent();
				StudentList.add(student);
				System.out.println("Student added Successfully");
				break;
			}
			case 2: {

				//update Students 
				
			}
			case 3: {

				//display students 
				StudentUtility.DispayAllStudent(StudentList);
				break;
			}
			case 4: {

				//Delete Students
			}
			case 5: {

				//Stop the program Students
				System.exit(0);
				break;
			}

			default:
				System.err.println("please enter correct options");
				
			}
		}
	}
}
