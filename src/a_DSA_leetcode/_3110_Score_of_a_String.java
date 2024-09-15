package a_DSA_leetcode;

public class _3110_Score_of_a_String {
	
//	leetcode 
	public static int scoreOfString(String s) {

		int ans = 0;

		// write a for loop make sure length()-1 
		for(int i =0; i<s.length()-1; i++){

			// get a index at 1 then i + 1
			int a = s.charAt(i);
			int b = s.charAt(i+1);

			int temp = Math.abs(a - b);

			// Store in the ans varible
			ans =  ans + temp;


		}
		return ans;
	}
	
//	main method

	public static void main(String[] args) {
		System.out.println(scoreOfString("hello"));
//		13
		
	}
}
