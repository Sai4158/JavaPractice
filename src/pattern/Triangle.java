package pattern;

public class Triangle {
	public static void main(String[] args) {

		//i for rows and j for columns
		int i;
		int j;
		int row = 6;

		//using for loop to print it 
		for (i=0; i<row; i++)   
		{  
			//inner loop work for space      
			for (j=2*(row-i); j>=0; j--)         
			{  
				//prints space between two stars      
				System.out.print(" ");   
			}   
			//inner loop for columns  
			for (j=0; j<=i; j++ )   
			{   
				//prints star      
				System.out.print("* ");   
			}   
			//throws the cursor in a new line after printing each line  
			System.out.println();   
		}   
	}   
 

}
