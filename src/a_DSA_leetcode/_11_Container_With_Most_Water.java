package a_DSA_leetcode;

public class _11_Container_With_Most_Water {
	
    public static int maxArea(int[] height) {
        
    	int n = height.length;
    	int l = 0;
    	int r = n-1;
    	int ans = 0;
    	
    	while(l<r) {
    		
    		int MinH = Math.min(height[l], height[r]);
    		int water =  (r-l);
    		int area = MinH * water;
    		
    		ans =  Math.max(ans, area);
    		
    		if(height[l] < height[r]) {
    			l++;
    		}else {
    			r--;
    		}
    		
    	}
    	
    	return ans;
    }
	
	public static void main(String[] args) {
		int  height[] = {1,1};
		
		System.out.println(maxArea(height));
	}
}
