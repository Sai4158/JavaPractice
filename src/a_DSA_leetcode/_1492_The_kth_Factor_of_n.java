package a_DSA_leetcode;

import java.util.ArrayList;

public class _1492_The_kth_Factor_of_n {
	
	
	   public static int kthFactor(int n, int k) {
	       
		   
		   
		   ArrayList<Integer> al = new ArrayList<Integer>();
		   
		   for (int i = 1; i <= n; i++) {
			
			   if(n % i ==0) {
				   al.add(i);
			   }
			   
		}
		   
		if(k<= al.size()) {
		 return al.get(k-1);
		}
		
		return -1;   
	    }
	
	public static void main(String[] args) {
		 System.out.println(kthFactor(1, 1));
	}
}
