package a_DSA_leetcode;

import java.util.Arrays;

public class _1491_AverageSalarayExcludingMinimumandMaximumSalary {
	
	public static double average(int[] salary) {
		
		Arrays.sort(salary);
		
		int ans = 0;
		
		for (int i = 1; i < salary.length-1; i++) {
			
			ans  += salary[i];
			
		}
		
		
		return (double) ans / (salary.length - 2);
	}
	
	public static void main(String[] args) {
		int Salary[] = {4000,3000,1000,2000};
		System.out.println(average(Salary));
	}
}
