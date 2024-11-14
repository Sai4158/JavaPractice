package a_patterns;

public class HallowSqaurePattern {
	public static void main(String[] args) {
		
		int i, j; 
        int rows = 5;
		for (i = 1; i <= rows ; i++) 
        { 
            if (i == 1 || i == rows) 
                for (j = 1; j <= rows; j++) 
                    System.out.print("*"); 
      
            else
                for (j = 1; j <= rows; j++) 
                    if (j == 1 || j == rows) 
                        System.out.print("*"); 
                    else
                        System.out.print(" "); 
      
            System.out.println(" "); 
        }
	}
}
