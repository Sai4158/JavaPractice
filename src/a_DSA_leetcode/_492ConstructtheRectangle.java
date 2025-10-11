package a_DSA_leetcode;

public class _492ConstructtheRectangle {
	
    public static int[] constructRectangle(int area) {
        
    	int wid = (int) Math.sqrt(area);
    	
    	while(area % wid != 0) {
    		wid--;
    	}
    	
    	int len = area / wid;
    	
    	return new int[] {len, wid};
    	
    }
	
	public static void main(String[] args) {
		
		 int area = 4;
		 System.out.println(constructRectangle(area));
		
	}
}
