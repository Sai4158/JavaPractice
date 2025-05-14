package a_DSA_part_61_to_part_70;

public class Day70_BitwiseOperator {
	
	public static void main(String[] args) {
		
		int n = 9;
		int m = 10;
		String binary  = Integer.toBinaryString(n);
	
		System.out.println(binary);
		
		System.out.println(n | m);
		System.out.println(n & m);
		System.out.println(n ^ m);
		System.out.println(n >> m);
		System.out.println(n << m);
		
	}
}
