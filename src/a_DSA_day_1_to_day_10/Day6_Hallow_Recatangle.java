package a_DSA_day_1_to_day_10;

public class Day6_Hallow_Recatangle {
	public static void main(String[] args) {
		
		
		int r = 5;

		int c = 20;
		
		for (int i = 0; i < r; i++) {
			
			for (int j = 0; j <c; j++) {
				
				if(i == 0 || j == 0||i==r-1 ||j==c-1) {
					System.out.print("^");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}

//^^^^^^^^^^^^^^^^^^^^
//^                  ^
//^                  ^
//^                  ^
//^^^^^^^^^^^^^^^^^^^^