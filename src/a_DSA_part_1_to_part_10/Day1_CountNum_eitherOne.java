package a_DSA_part_1_to_part_10;

public class Day1_CountNum_eitherOne {
	public static void main(String[] args) {
		
		int arr[] = {55,34,5,345,53,5};
		int temp = 0;
		
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i] % 5 ==0 || arr[i] % 2 ==0) {
				temp++;
			}
		}
		System.out.println(temp);
 	}
}
