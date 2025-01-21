package a_DSA_leetcode;

public class _1539_Kth_Missing_Positive_Number {

    public static int findKthPositive(int[] arr, int k) {
        
    	int l = 0;
    	int n = arr.length;
    	
    	int r =  n -1;
    	
    	while(l <= r) {
    		int mid = l + (r-l)/2;
    		int missing =  arr[mid] - (mid +1);
    		
    		if(missing < k ) {
    			l = mid +1;
    		}else {
    			r = mid -1;
    		}
    		
    	}
		return l + k;    		
    }
	
	public static void main(String[] args) {
		int[] arr = {2, 3, 4, 7, 11};
        int k = 5;
        System.out.println(findKthPositive(arr, k)); 
	}
}
