package p24_looping;

import java.util.Iterator;

public class Final {
	public static void main(String[] args) {
		
		for(int i = 200; i < 500; i++ ) {
			if(i % 5 == 0) {
				System.out.println("the number is " + i);
			}
		}
		
		for(int j = 0;  j<500; j++) {
			if(j%5 ==0) {
				System.out.println(j);
			}
		}
	
	}

}
