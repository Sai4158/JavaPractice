package patterns;
//inverted half pyramid
public class Inverted_Half_pyramid {
	public static void main(String[] args) {
		 
//		make the i 5 then print till 1 then decrement to print in reverse
		for (int i = 5; i >=1; i--) {
			for (int j = 0; j <i; j++) {
				System.out.print("4");
			}
			System.out.println();
		}
	}
}
