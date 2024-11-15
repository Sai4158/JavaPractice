package a_patterns;

public class PatternWordE {
	public static void main(String[] args) {
		 
		int n = 7;
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(j==0 ||i==0||i==3 || i==6) {
					System.out.print("^");
				}
			}
			System.out.println("");
			
		}
	}
}

//^^^^^^^
//^
//^
//^^^^^^^
//^
//^
//^^^^^^^