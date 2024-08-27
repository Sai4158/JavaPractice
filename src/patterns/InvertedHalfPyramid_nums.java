package patterns;

public class InvertedHalfPyramid_nums {
	
		public static void main(String[] args) {
			
			int n =10;
			
			for (int i = n; i>= 0; i--) {
				for (int j = 1; j <=i; j++) {
					System.out.print(j);
				}
				System.out.println();
			}
		}
}



//12345678910
//123456789
//12345678
//1234567
//123456
//12345
//1234
//123
//12
//1