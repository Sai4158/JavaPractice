package a_DSA_leetcode;

public class _693_Binary_Number_with_Alternating_Bits {


	public static boolean hasAlternatingBits(int n) {

		
//		Convert int to binary string
		String binary = Integer.toBinaryString(n);
		for (int i = 1; i < binary.length(); i++) {
			
//			Return false
			if (binary.charAt(i) == binary.charAt(i - 1)) {
				return false;
			}
		}

//		Return true
		return true;
	}

//	Main method 
	public static void main(String[] args) {

		int  n = 5;
		System.out.println(hasAlternatingBits(n));
	}
}
