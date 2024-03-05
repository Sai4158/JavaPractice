package if_Else_p19;

import java.util.Scanner;

public class HW2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter your grade: ");

		int grade = scan.nextInt();

		if (grade < 35) {
            System.out.println("Student is failed");
        } else if (grade == 35) {
            System.out.println("Student passed");
        } else if (grade <= 70) {
            System.out.println("Student secured third class");
        } else if (grade <= 85) {
            System.out.println("Student secured second class");
        } else {
            System.out.println("Student secured first class");
        }
        
        scan.close();
    }
}

