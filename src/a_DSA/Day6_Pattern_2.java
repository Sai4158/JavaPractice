package a_DSA;

public class Day6_Pattern_2 {
	public static void main(String[] args) {
		
//		row - r
//		coloum - c
		
		int r= 20;
		int c= 3;
		
		for (int i = 0; i < c; i++) {
			for (int j = 0; j < r ; j++) {
				System.out.print("*");
				
				if(j!= c-1) {
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