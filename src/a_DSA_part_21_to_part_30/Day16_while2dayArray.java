package a_DSA_part_21_to_part_30;

public class Day16_while2dayArray {
	public static void main(String[] args) {
		int arr[][] = {{11,23,34,56},{45,11,67,78},{43,89,11,89}};

		
		int r = arr.length;
		int c = arr[0].length;
		
		int i = 0;
		int j = 0;
		
		boolean check = true;
		
		
		
		while(i<r  && i<c) {
			System.out.println(arr[i][j]);
			
			
//			Will compare the first num to all
			int temp =  arr[i][j];
			
			if(arr[i][i]!=temp) {
				check = false;
			}
			 
			i++;
			j++;
		}
		
		System.out.println(check);
	}
}
