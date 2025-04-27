package a_DSA_part_61_to_part_70;

public class Day66_MaxOddBinary {

	public static String maximumOddBinaryNumber(String s) {

		int countOne = 0;
		int countZeros = 0;
		String ans = "";

		for (int i = 0; i < s.length(); i++) {

			if(s.charAt(i) == '1') {
				countOne ++;
			}else {
				countZeros ++;
			}
		}
		
		for (int j = 0; j < countOne-1; j++) {
			ans += '1';
		}

		for (int j = 0; j <countZeros ; j++) {
			ans += '0';

		}
		ans += '1';

		return ans;
	}

	public static void main(String[] args) {
		String s = "010";
		System.out.println(maximumOddBinaryNumber(s));
	}
}
