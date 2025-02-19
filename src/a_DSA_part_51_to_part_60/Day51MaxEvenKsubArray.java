package a_DSA_part_51_to_part_60;

public class Day51MaxEvenKsubArray {

	public static int subk(int arr[],int k) {

		int n =  arr.length;
		int l = 0;
		int temp = 0;
		int ans = 0;

		for (int r = 0; r < n; r++) {

			if(arr[r] % 2 != 1) {
				temp++;
			}


			while(temp>k) {
				if(arr[l] % 2 != 1) {
					temp-=arr[l];
				}
				l++;
			}
			
			ans = Math.max(ans, r-l+1);

		}
		return ans;
	}

	public static void main(String[] args) {
		int k = 2;
		int arr[] = {2,2,2,3};
		System.out.println(subk(arr, k));
	}
}
