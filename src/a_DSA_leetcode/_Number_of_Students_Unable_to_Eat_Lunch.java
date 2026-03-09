package a_DSA_leetcode;import java.util.concurrent.CountDownLatch;

public class _Number_of_Students_Unable_to_Eat_Lunch {

    public static int countStudents(int[] students, int[] sandwiches) {
     
    	int count0 = 0;
    	int count1 = 0;
    	
        for (int s : students) {
            if (s == 0) count0++;
            else count1++;
        }

        for (int sand : sandwiches) {
            if (sand == 0) {
                if (count0 == 0) break; // nobody wants 0
                count0--;
            } else {
                if (count1 == 0) break; // nobody wants 1
                count1--;
            }
        }

        return count0 + count1; // students left
    }
    
    public static void main(String[] args) {
		
    	int students [] = {1,1,0,0};
    	int sandwiches [] = {0,1,0,1};
    	
    	System.out.println(countStudents(students, sandwiches));
    	
	}
	
}
