package a_DSA_part_71_to_part_80;

public class Day79_BinaryNumberAlternatingBits {

	
	public static boolean hasAlternatingBits(int n) {

		String binary = Integer.toBinaryString(n);
		int size =  binary.length();
		
		for (int i = 1; i < size; i++) {
			
			if(binary.charAt(i ) == binary.charAt(i-1)) {
				return false;
			}
			
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		int n = 5;
		System.out.println(hasAlternatingBits(n));
	}
}
