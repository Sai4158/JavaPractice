package a_DSA;

public class Day6_Pattern_2 {
	public static void main(String[] args) {
		int n = 3;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 20 ; j++) {
				System.out.print("*");
				
				if(j!= n-1) {
					System.out.print("-");
				}				
				
			}
			System.out.println();

		}
	}
}


//*-*-**-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-
//*-*-**-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-
//*-*-**-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-