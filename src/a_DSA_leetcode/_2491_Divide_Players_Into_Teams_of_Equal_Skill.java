package a_DSA_leetcode;

import java.util.Arrays;

public class _2491_Divide_Players_Into_Teams_of_Equal_Skill {
	
	
	   public static long dividePlayers(int[] skill) {
	        
	        int n =  skill.length;
	    	int l = 0;
	    	int r =  n -1;
	    	long count = 0;

	            Arrays.sort(skill);
	            int target =  skill[l] + skill[r];

	        while(l<r){

	            if(skill[l] + skill[r] != target){
	                return -1;
	            }

	            count+= skill[l] * skill[r];
	            l++;
	            r--;
	        }
	        return count;
	    }
	
	public static void main(String[] args) {
		
		int skill[] = {3,2,5,1,3,4};
		System.out.println(dividePlayers(skill));
		
	}
}
