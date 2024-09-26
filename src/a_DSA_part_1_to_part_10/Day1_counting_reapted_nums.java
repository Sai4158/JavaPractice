package a_DSA_part_1_to_part_10;

public class Day1_counting_reapted_nums {
	
	public static void main(String[] args) {
		
		int number = 3;
		
//		counting all the matching elements in the array 
		
		int arr[] = {4,3,3,4,2,32,5,12,12,3,2,3};
		int count = 0;
		
		for (int i = 0; i < arr.length; i++) {
//			if num is 3 then make sure to increase the count 
			if(arr[i] == number) {

				count++;
				
			}
		}
//		make sure to print it outside of the loop 
		System.out.println("the count of " +number + "'s is: " + count);
	}
}
