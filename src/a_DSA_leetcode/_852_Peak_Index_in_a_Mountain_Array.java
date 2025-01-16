package a_DSA_leetcode;

public class _852_Peak_Index_in_a_Mountain_Array {
	
	
    public static int peakIndexInMountainArray(int[] arr) {
        
    	int l = 0;
    	int r = arr.length - 1;
    	
    	while (l<r) {
    		int mid = l + (r-l)/2;
    		
    		if(arr[mid] < arr[mid +1]) {
    			l = mid +1;
    		}else if (arr[mid] > arr[mid +1]){
    			r = mid;
    		}
    	}
    	
    	return  l;
    }
    
    public static void main(String[] args) {
		
    	int arr[] = {0,2,1,0};
    	
    	System.out.println(peakIndexInMountainArray(arr));
    	
	}
}
