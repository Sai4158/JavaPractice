package a_DSA_leetcode;

public class _2798_Number_of_Employees_Who_Met_the_Target {

	public static int numberOfEmployeesWhoMetTarget(int[] hours, int target) {


		int n = hours.length;

		int count = 0;

		for (int i = 0; i < n; i++) {
			if(hours[i] >= target) {
				count++;
			}
		}

		return count;

	}


	public static void main(String[] args) {

		int hours[] = {0,1,2,3,4};

		int target = 2;

		System.out.println(numberOfEmployeesWhoMetTarget(hours, target));
	}
}
