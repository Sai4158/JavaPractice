package a_patterns;

public class Pattern4 {
	public static void main(String[] args) {
		
		int n = 10;
		
		for (int i = 1; i <= n; i++) {
			
			for (int j = n; j >= i; j--) {
			System.out.print("a ");
			}	
		System.out.println("");
		}
	}
}

//a a a a a a a a a a 
//a a a a a a a a a 
//a a a a a a a a 
//a a a a a a a 
//a a a a a a 
//a a a a a 
//a a a a 
//a a a 
//a a 
//a 
