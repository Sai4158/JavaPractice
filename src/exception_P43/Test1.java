package exception_P43;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Test1 {
	public static void main(String[] args) {
		
		int abc[] = {32,232,43,23,423};
		//print using toString
		String str = Arrays.toString(abc);
		System.out.println(str);
		
		
		System.out.println("");

		
		//This will print this array in reverse
		int cba[] = {23,234,423,432,423};		
		for (int i = cba.length - 1; i >= 0; i--) {
			  System.out.print(cba[i] + ",");
		}
	}
}
