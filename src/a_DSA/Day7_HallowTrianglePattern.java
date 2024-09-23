package a_DSA;

public class Day7_HallowTrianglePattern {
	public static void main(String[] args) {
		
//		Hollow
		
		int n = 5;
		
		for (int i = 0; i < n; i++) {
			
//			Spaces
			for (int k = 0; k < n-i-1; k++) {
				System.out.print(" ");

			}
			for (int j = 0; j <2*i+1; j++) {
				
				if(i==n-1 || j==0 || j==2*i ) {
				System.out.print("*");

				}else {
					System.out.print(" ");

				}

			}
			System.out.println();
		}
	}
}
