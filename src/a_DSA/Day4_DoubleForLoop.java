package a_DSA;

public class Day4_DoubleForLoop {
	public static void main(String[] args) {
		
		for (int i = 0; i < 3; i++) {
			System.out.println(i);
			
			
			for (int j = 0; j < 3; j++) {
				System.out.println(i+" "+j);
				
				if(j ==2) {
					break;
				}
			}
		}
	}
}
