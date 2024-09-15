package a_DSA;



public class Day3_absoluteValue {
	public static void main(String[] args) {
		
		int a =2-5;
		System.out.println(a);
//		-3
		
		
//--------------------------------
//		Absolute value 
//		using if else to multiply with a negative number to get a positive value 
		
		if(a<0) {
			a  = a * -1;
		}else {
			a =  a;
		}
		
		System.out.println(a);
//3 
		
		
//		-------------------------
//		just use Math.abs
		int ab = -3333;
		System.out.println(Math.abs(ab));
//		3333
	}
}
