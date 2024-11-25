package a_DSA_leetcode;

public class _2769_Find_the_Maximum_Achievable_Number {
	
	
	 public static int theMaximumAchievableX(int num, int t) {

	     int a = 0;

	     a = (num + (t*2));

	    return a;
	    }
	 
	 
//	 Main
	 
	 public static void main(String[] args) {
		
		 int num =  3;
		 int t = 3;
		 
		 
		 System.out.println(theMaximumAchievableX(num, t));
	}
}
