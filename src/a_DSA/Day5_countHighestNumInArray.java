package a_DSA;

public class Day5_countHighestNumInArray {
	public static void main(String[] args) {
		
		int arr[] = {5, 8 ,10, 11, 50, 15, 20, 25};
		
		int ans = 0;
		
		for (int i = 0; i < arr.length; i++) {
		ans = 	Math.max(ans, arr[i]);

		}
		
		System.out.println(ans);

	}
}


//50 -  is the highest number in the array 