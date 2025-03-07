package a_DSA_leetcode;

public class _2651_Calculate_Delayed_Arrival_Time {

	public static int findDelayedArrivalTime(int arrivalTime, int delayedTime) {

		int ans = arrivalTime + delayedTime;

		int a = ans;
		
		if(ans >= 24) {
			a =  ans - 24;
		}
		
		return a;
	}

	public static void main(String[] args) {
		int arrivalTime = 15, delayedTime = 5 ;
		System.out.println(findDelayedArrivalTime(arrivalTime, delayedTime));
	}
}
