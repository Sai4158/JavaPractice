package Q1;

public class _Concatenation_of_Array {

	public static int[] getConcatenation(int[] nums) {

		int  n =  nums.length;
		int[] ans = new int[2 * n];


		for (int i = 0; i < n; i++) {

			ans[i] = nums[i]; 
			
			ans[i + n] =  nums[i];
		}

		
		return ans;
	}

	public static int[] getConcatenation1(int[] nums) {
		
		int  n =  nums.length;
		int ans[] = new int[n*2];
		
		for (int i = 0; i < n; i++) {
			
			ans[i] = nums[i];
			ans[n+i] =  nums[i];
			
		}
		
		return ans;
		
	}

	public static void main(String[] args) {
		int nums[] = {1,2,1};
		System.out.println(getConcatenation(nums));
		
		System.out.println(getConcatenation1(nums));
	}
}
