package a_DSA_leetcode;

public class _338_Counting_Bits {
	
	public static int[] countBits(int n) {

	    String[] binary = new String[n + 1];
	    int[] ans = new int[n + 1];

	    for (int i = 0; i <= n; i++) {
	        binary[i] = Integer.toBinaryString(i);
	    }

	    for (int i = 0; i <= n; i++) {

	        int count = 0;

	        for (int j = 0; j < binary[i].length(); j++) {
	            if (binary[i].charAt(j) == '1') {
	                count++;
	            }
	        }

	        ans[i] = count;
	    }

	    return ans;
	}

	
	public static void main(String[] args) {
		int num = 5;
		System.out.println(countBits(num));
	}
}
