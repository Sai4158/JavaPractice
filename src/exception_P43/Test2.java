package exception_P43;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

//this program will use PrintWriter to modify txt file


public class Test2 {
	public static void main(String[] args) throws IOException {
		//Scanner class test 
		Scanner scan = new Scanner(System.in);
		
		//will ask for the name 
		System.out.print("enter your name: ");
		String name = scan.nextLine();
		
		//will ask the for the age 
		System.out.print("enter your age: ");
		int age = scan.nextInt();
		System.out.printf("Hello %s, is your age %d right?", name,age);
		
		
		System.out.println("");
		
		
		
		//File creation using Print Writer
		//do this before we next call nextLine()
		scan.nextLine();

        // Prompt for the file content
        System.out.println("What do you want to type in your file: ");
        String write = scan.nextLine();

        // Writing to the file (Without Creating a file)
        PrintWriter writer = new PrintWriter("./hewfw.txt");
        writer.println(write);
        writer.close(); 

        // Confirmation message
        System.out.println("Successfully wrote to the file.");
		
	}
}
