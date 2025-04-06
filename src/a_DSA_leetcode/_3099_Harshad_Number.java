package a_DSA_leetcode;

public class _3099_Harshad_Number {

	public static int sumOfTheDigitsOfHarshadNumber(int x) {

		int sum = 0;
		

			String s =  Integer.toString(x);

			for (char ch : s.toCharArray()) {

				sum += ch - '0';
			}

	
		
		if(x % sum == 0){
			return sum;
		}
		return -1;
	}


	public static void main(String[] args) {
		int x = 18;
		
		System.out.println(sumOfTheDigitsOfHarshadNumber(x));
	}
}	
