package ist_prac;

import java.util.ArrayList;

import javax.naming.spi.DirStateFactory.Result;



public class Methods {
	
//	int because I am returning the int
	public static int multiplyIntegers(ArrayList<Integer> list) {
		
		int result =1;
		
		for (int i = 0; i < list.size(); i++) {
			result =  result * list.get(i);	
		}
		return result;
	}
	
	public static int multiplyIntegers(int first) {
		return first*1;

	}
	
	public static int multiplyIntegers(int first, int second) {
		return first* second;

	}
	public static void main(String[] args) {
		int ab =  3;
		int cd = 3;
		
		System.out.println(multiplyIntegers(ab, cd));
		
	}
}
