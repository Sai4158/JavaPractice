package a_DSA_leetcode;

public class _2078_Two_Furthest_Houses_With_Different_Colors {
	
	 public static int maxDistance(int[] colors) {
	        

	        int n = colors.length;
	        int ans  = 0;

	        for(int i=0; i<n; i++){
	            for(int j=i+1; j<n; j++){

	                if(colors[i] != colors[j]) {
	                	ans = Math.max(ans,Math.abs(j-i));
	                }
	                
	            }
	        }
	        return ans;
	    }
	 
	 
//	 Main method 
	 
	 public static void main(String[] args) {
		int[] arr = {1,1,1,6,1,1,1};
	System.out.println(maxDistance(arr));	
	}
}
