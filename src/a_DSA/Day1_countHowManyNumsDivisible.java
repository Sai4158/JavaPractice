package a_DSA;

public class Day1_countHowManyNumsDivisible {
	public static void main(String[] args) {
		
		int arr[] = {3,54,2,5,65,12,9, 6};
		int count  = 0;
		
		for (int i = 0; i < arr.length; i++) {
			int temp = arr[i];
			
//			For loop
			if(temp % 3 == 0) {
				count++;
			}
		}
		System.out.println("There are "+count+" numbers divisible by 3");
	}
}

//There are 5 numbers divisible by 3
