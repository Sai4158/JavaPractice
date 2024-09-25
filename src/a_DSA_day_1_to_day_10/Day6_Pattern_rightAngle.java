package a_DSA_day_1_to_day_10;

public class Day6_Pattern_rightAngle {

    public static void main(String[] args) {
//		Print 4 times	
    	  int n = 4;
    	  
//    	  first loop print 4 times
    	    for(int i = 0; i<n; i++){
    	    	
    	    	
//    	    	second loop: 4-i-1 -  for spacing
    	        for(int j = 0; j<n-i-1; j++){
    	            System.out.print(" ");
    	        }
    	        
//    	        third loop: n-1+i
    	        for(int k = 0; k<n-1+i; k++){
    	            System.out.print("*");
    	        }
    	        
//    	        space
    	        System.out.println();
    	    }
    	  
    }
}


//	 ***
//	****
// *****
//******