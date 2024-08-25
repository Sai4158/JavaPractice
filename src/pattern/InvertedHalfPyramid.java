package pattern;
// inverted pyramid 
public class InvertedHalfPyramid {
	
	public static void main(String[] args) {
		for (int i = 7; i >=0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("1");
			}
			System.out.println();
		}
	}
}	


//1111111
//111111
//11111
//1111
//111
//11
//1
