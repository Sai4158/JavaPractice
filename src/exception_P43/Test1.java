package exception_P43;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Test1 {
	public static void main(String[] args) {
		
	
		//print using toString
		int abc[] = {32,232,43,23,423};
		String str = Arrays.toString(abc);
		System.out.print(str);
		
		
		System.out.println("");
		
		
		//printing normal array using for loop
		int ab[] = {3,2,23,232,332,432,999};
		for (int i = 0; i < ab.length; i++) {
		System.out.print(ab[i] + ",");
		}
		
		System.out.println("");
		
		
		//This will print in reverse
		int cba[] = {23,234,423,432,423};		
		for (int i1 = cba.length - 1; i1 >= 0; i1--) {
			  System.out.print(cba[i1] + ",");
		}
		
		
		System.out.println("");
		
		
		//This will print in reverse
		int cv[] = {99,88,77,66,55};
		for (int j = cv.length - 1; j > 0; j--) {
				System.out.print(cv[j] + ",");
			}
			
		
		System.out.println("");
		
		
		//This will print in reverse
		int cvv[] = {23,34,45,56,67};
			for (int j11 = cvv.length -1; j11>0; j11--){
			System.out.print(cvv[j11] + ",");
					}
					
				}
		}

		


