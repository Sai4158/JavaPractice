package a_DSA_leetcode;import java.util.concurrent.CountDownLatch;

public class _1876_Substrings_of_Size_Three_with_Distinct_Characters {
	
	 public static int countGoodSubstrings(String s) {
	      	
		 	int n = s.length()-2;
		 	int count = 0;
		 	
		 	
		 	for (int i = 0; i < n; i++) {
				
		 	char a = s.charAt(i);
		 	char b = s.charAt(i+1);
		 	char c = s.charAt(i+2);
		 		
		 	
	        if(a!=b && b!=c && a!=c){
		 		count++;
		 		}
			}
		 	return count;
	        
	    }
	 
	 
	 
//	 Main Method
	 public static void main(String[] args) {
		
		 String  s = "xyzzaz";
		 
		 System.out.println(countGoodSubstrings(s));
	}
	
	
}	
