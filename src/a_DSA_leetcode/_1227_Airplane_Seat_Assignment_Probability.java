package a_DSA_leetcode;

public class _1227_Airplane_Seat_Assignment_Probability {
	
	
    public static double nthPersonGetsNthSeat(int n) {
        
        return n == 1 ? 1.0 : 0.5;
    }
	
	public static void main(String[] args) {
		
		int n = 5;
		System.out.println(nthPersonGetsNthSeat(n));
	}
}
