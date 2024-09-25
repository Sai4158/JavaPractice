package a_DSA_day_1_to_day_10;

public class Day6_Pattern_BikeStand {
	public static void main(String[] args) {
		
		int n =5;
		
//		a loop tha runs 5 times 
		for (int i = 0; i < n; i++) {
		
//			print 5 spaces then decrease as the loop runs 5-1, 5-2, 5-3, 5-4 = 1;
			for (int j = 0; j < n-i; j++) {
				System.out.print(" ");
			}
			
//			this one will print right after the space above 
			for (int j = 0; j <n; j++) {
				System.out.print("*");
			}
			
//			for every loop it will create a new line
			System.out.println(" ");
		}
	}
}

//    ***** 
//   ***** 
//  ***** 
// ***** 
//***** 
