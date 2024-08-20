package a_Tricky_java;

import java.util.Iterator;
import java.util.Scanner;

public class Math_Tables_loops {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 0; i < 15; i++) {
			System.out.println(n + "x = " + n +i);
		}
	}
}
