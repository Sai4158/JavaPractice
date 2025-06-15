package a_DSA_part_61_to_part_70;

public class Day70_countTriplets {
	
    public static int countTriplets(int[] arr) {
    	
    	int n = arr.length;
    	int count = 0;
    	
    	for (int i = 0; i < n; i++) {
			
    		int xor =  arr[i];
    		
    		
    		for (int j = i+1; j < n; j++) {
				
    			xor ^=  arr[j];
    			
    			if(xor == 0) {
    				
    				count += (j-i);
    			}
    			
			}
		}
    	return count;
    }
    
	
	public static void main(String[] args) {
		int arr[] = {2,3,1,6,7};
		System.out.println(countTriplets(arr));
	}
}
