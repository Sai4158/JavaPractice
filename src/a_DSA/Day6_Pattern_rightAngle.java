package a_DSA;

public class Day6_Pattern_rightAngle {

    public static void main(String[] args) {

    	  int n = 4;
    	    for(int i = 0; i<n; i++){
    	        for(int j = 0; j<n-i-1; j++){
    	            System.out.print(" ");
    	        }
    	        for(int k = 0; k<n-1+i; k++){
    	            System.out.print("*");
    	        }
    	        System.out.println();
    	    }
    	  
    }
}


//	 ***
//	****
// *****
//******