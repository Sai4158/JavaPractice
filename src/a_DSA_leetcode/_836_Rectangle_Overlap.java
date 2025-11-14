package a_DSA_leetcode;

public class _836_Rectangle_Overlap {

    public static boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        
        // If one rectangle is completely on one side of the other → no overlap
        if (rec1[2] <= rec2[0] ||  // rec1 is to the left of rec2
            rec1[0] >= rec2[2] ||  // rec1 is to the right of rec2
            rec1[3] <= rec2[1] ||  // rec1 is below rec2
            rec1[1] >= rec2[3]) {  
            return false;
        }
        return true;

    }
    
    public static void main(String[] args) {
		
    	int rec1[] = {0,0,2,2}, rec2[] = {1,1,3,3};
    	System.out.println(isRectangleOverlap(rec1, rec2));
    	
	}
}
