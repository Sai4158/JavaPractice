package a_DSA_leetcode;

public class _2595_Number_of_Even_and_Odd_Bits {

	public static int[] evenOddBit(int n) {

		int[] ans = new int[2];

		String bit = Integer.toBinaryString(n);
		int even = 0;
		int odd = 0;


		for (int i = 0; i < bit.length(); i++) {

			
			if(bit.charAt(bit.length() - 1 - i)  == '1') {
			
				if(i%2==0) {
					even++;
				}else {
					odd++;
				}
				
			}

		}

		ans[0] = even;
		ans[1] = odd;

		return ans;

	}


	public static void main(String[] args) {
		int n = 50; 
		System.out.println(evenOddBit(n));
	}
}
