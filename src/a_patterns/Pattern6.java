package a_patterns;

public class Pattern6 {
	public static void main(String[] args) {

		int n =5;

		for (int i = 0; i < n; i++) {
			
			for (int j = i; j < n; j++) {
				System.out.print(" ");

			}
			
			for (int j = 0; j < i; j++) {
				System.out.print("1 ");

			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();


		num();
	}
	
	static void num() {
//		new triangle
	int t =5;
	for (int i = 0; i < t; i++) {
		
		for (int j = i; j < t; j++) {
			System.out.print(" ");

		}
		for (int j = 0; j < i; j++) {
			System.out.print("> ");

		}
		System.out.println();
	}
	
	
	}
	
}