package a_Tricky_java;

import java.util.Scanner;

public class Button_listener {
	public static void main(String[] args) {
		
		Scanner sc  =  new Scanner(System.in);
		
		int button =  sc.nextInt();
		
		if(button == 1) {
			System.out.println("Button 1 pressed for help");
		}if(button == 2) {
			System.out.println("Button 2 pressed for laptop parts");
		} if(button == 3) {
			System.out.println("Button 3 pressed for laptop repair");
		}else {
			System.out.println("Invalid input");
		}
	}
}
