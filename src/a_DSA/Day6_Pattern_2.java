package a_DSA;

public class Day6_Pattern_2 {
	public static void main(String[] args) {
		
//		row - r
//		coloum - c
		int r= 3;
		int c= 20;
		
//		row
		for (int i = 0; i < r; i++) {
			
//			coloum
			for (int j = 0; j < c ; j++) {
				System.out.print("*");
				
				
//				c - 1  =  when  =  this will print last element as 
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