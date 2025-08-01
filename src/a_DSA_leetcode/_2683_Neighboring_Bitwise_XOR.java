package a_DSA_leetcode;

public class _2683_Neighboring_Bitwise_XOR {

	public static boolean doesValidArrayExist(int[] derived) {

//		Length of the nums
		int n =  derived.length;
		
// 		Set ans to  0
		int ans = 0;

//		Run for loop from i to n
		for (int i = 0; i < n; i++) {

//			Add all the XOR into ans
			ans ^= derived[i];

		}

//		if it the ans is 0 then true or false
		return ans == 0;


	}


	public static void main(String[] args) {
		int nums[] = {1,1,0};
		System.out.println(doesValidArrayExist(nums));
	}
}
