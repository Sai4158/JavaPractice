package aa_prac1;

import java.util.Iterator;

//this program will only print even numbers

public class EvenNums {
	
	
	public static void main(String[] args) {
		
		int maxnums = 100;
		for (int i = 0; i < maxnums; i++) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
		}
	}
}	
