package a_DSA_leetcode;

import java.util.Iterator;

public class _Number_of_Students_Unable_to_Eat_Lunch_1 {

    public static int countStudents(int[] students, int[] sandwiches) {

    	
    	int count1 = 0;
    	int count2 = 0;
    	
    	
    	for (int i = 0; i < sandwiches.length; i++) {
			
    		
    		if(students[i] == 0) {
    			count1++;
    		}
    		
		}
    	
    	for (int i = 0; i < sandwiches.length; i++) {
			
    		if(sandwiches[i] == 0) {
    			if(count1 == 0) {
        			count1--;
        		}
    		}
    		
    		else {
                if (count2 == 0) break;
                count2--;
            }
    		
		}
    	
    	 return count1 + count2;
    }
    
    
    public static void main(String[] args) {
		
    	int students[] = {1,1,0,0};
    	int sandwiches[] = {0,1,0,1};
    	System.out.println(countStudents(students, sandwiches));
    	
	}
	
}
