package a_patterns;

public class Pattern2 {
	public static void main(String[] args) {
		
//		this is pattern 2
		int n = 5;
		
//		make sure this is <= "="
		for (int i = 1; i <= n; i++) {
		    for (int j = 1; j <= i; j++) {
		        System.out.print("* ");
		    }
		    
		    System.out.println("");
		}

	}
}

//
//* 
//* * 
//* * * 
//* * * * 
//* * * * * 