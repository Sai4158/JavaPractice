package aa_prac1;

import java.util.Iterator;

//this program will only print even numbd

public class EvenNums {
	
	public static void main(String[] args) {
		
//		object creation
		EvenNums even =  new EvenNums();
		
		even.evennums();
		
		even.oddnums();
		
	}
	

//	this will print the even nums 
public void evennums() {
	int maxnums = 20;
	System.out.println("-----------------------");
	System.out.println("EVEN NUMBERS");
	System.out.println("-----------------------");
	for (int i = 0; i < maxnums; i++) {
		if(i % 2 == 0) {
			System.out.println(i);
		}
	}
}


// odd nums 
public void oddnums() {
	int maxnums = 20;
	System.out.println("-----------------------");
	System.out.println("ODD NUMBERS");
	System.out.println("-----------------------");
	for (int i = 0; i < maxnums; i++) {
		if( i % 2 != 0) {
			System.out.println(i);
		}
		
	}
}
}