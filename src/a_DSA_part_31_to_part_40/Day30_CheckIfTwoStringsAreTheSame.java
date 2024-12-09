package a_DSA_part_31_to_part_40;

public class Day30_CheckIfTwoStringsAreTheSame {

	public static boolean Check(int a[], int b[]) {

		
		for (int i = 0; i < a.length; i++) {

			if (a[i] == b[i]) {

				return true;

		}		
	}
		return false;
	}


	public static void main(String[] args) {

		int arr[] = {1,2,3,4,5};
		int arr1[] = {1,2,3,4,5};
		
		
		System.out.println(	Check(arr,arr1));
	}
}
