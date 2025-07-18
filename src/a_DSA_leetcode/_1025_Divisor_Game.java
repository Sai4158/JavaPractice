package a_DSA_leetcode;

public class _1025_Divisor_Game {
	
    public static boolean divisorGame(int n) {
        return n % 2 == 0;  
      }
	
	public static void main(String[] args) {
		
		int  n = 4;
		
		System.out.println(divisorGame(n));
		
	}
}
