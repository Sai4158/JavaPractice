package a_DSA_leetcode;

public class _1512_Number_of_Good_Pairs {
    public static int numIdenticalPairs(int[] nums) {
        
        int n =  nums.length;
        int count =0;
        for(int i =0; i<n; i++){
            for(int j =i+1; j<n; j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }   
        }

        return count;
    }
    public static void main(String[] args) {
		int arr[] = {2,24,55,2,33,24,55};
		System.out.println(numIdenticalPairs(arr) + " Pairs");
	}
}
