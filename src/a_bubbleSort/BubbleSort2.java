package a_bubbleSort;

public class BubbleSort2 {

	public static int[] bubble(int nums[]) {
	
		int n =  nums.length;
		
		for (int i = 0; i < n-1; i++) {
			for (int j = 0; j < n-1; j++) {
				if(nums[i] > nums[j+1]) {
					int temp = nums[j];
					nums[j] =  nums[j+1];
					nums[j+1] =  temp;

				}
			}
		}
		
		return nums;
	}

	public static void main(String[] args) {
        int arr[] = {7, 8, 3, 1, 7,6,2};
        
        for (int num : bubble(arr)) {
            System.out.print(num + " ");
        }
	}
}
