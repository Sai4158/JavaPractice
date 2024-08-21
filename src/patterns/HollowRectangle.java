package patterns;
// hallow rectangle
public class HollowRectangle {

	public static void main(String[] args) {

		int n =4;
		int m =5;


		for (int i = 1; i <=n; i++) {

			for (int j = 1; j <=m; j++) {
				
//				if its i =1 = start , then i = n end then also print
				if(i == 1|| j == 1 || i == n ||j == m) {
					System.out.print("^");
				}
//				if it doesn't match then print a empty space 
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}

//^^^^^
//^   ^
//^   ^
//^^^^^
