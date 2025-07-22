package a_DSA_leetcode;

public class _1491_Average_Salary_Excluding_the_Minimum_and_Maximum_Salary {

	public static double average(int[] salary) {

		int min =  Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int ans = 0;

		for(int s : salary) {

			ans += s;

            if (s < min) min = s;
            if (s > max) max = s;

		}
		
        ans = ans - min - max;

		
        return (double) ans / (salary.length - 2);
	}

	public static void main(String[] args) {
		int Salary[] = {4000,3000,1000,2000};
		System.out.println(average(Salary));
	}
}
