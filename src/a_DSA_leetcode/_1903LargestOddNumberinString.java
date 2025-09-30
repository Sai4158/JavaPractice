package a_DSA_leetcode;


public class _1903LargestOddNumberinString {

	public static String largestOddNumber(String num) {

		int n =  num.length();
		String arr[] =  new String[n+1];

		for (int i = 0; i < n; i++) {
            arr[i] = num.substring(0, i + 1);  
		}

        String maxOdd = "";


		for (int i = 0; i < n; i++) {

			String curr = arr[i];
			int lastDigit =  curr.charAt(curr.length() - 1) - '0';
				
			if(Integer.parseInt(arr[i]) % 2 == 1) {
				maxOdd =  curr;
			}
		}

		return maxOdd;  

	}

	public static void main(String[] args) {

		String num = "52";
		System.out.println(largestOddNumber(num));

	}
}
