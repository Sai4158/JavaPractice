package a_DSA_leetcode;

public class _492ConstructtheRectangle {
	

    public static int[] constructRectangle(int area) {
        
//    	width is the sqrt of the area
    	int wid = (int) Math.sqrt(area);
    	
//    	if the area is not equal 0 then decrease the width
    	while(area % wid != 0) {
    		wid--;
    	}
    	
//    	and the length is the = area/width
    	int len = area / wid;
    	
    	
    	// return the length and the width
    	return new int[] {len, wid};
    	
    }
	
	public static void main(String[] args) {
		
		 int area = 4;
		 System.out.println(constructRectangle(area));
		
	}
}
