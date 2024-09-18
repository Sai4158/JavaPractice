package a_DSA;

public class Day5_DoubleForLoop1 {
	public static void main(String[] args) {
		
		int n = 5;
		int temp = 0;
		
		for (int i = 0; i < n; i++) {
			
			for (int j = 0; j < n; j++) {
				
				temp++;
			}
		}
		System.out.println(temp);
	}
}

// temp = 25

//because the first loop is running 5 times and then in the inside loop runs for the 5 times 
// so 5 x 5