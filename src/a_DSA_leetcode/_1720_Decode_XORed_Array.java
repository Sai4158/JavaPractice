package a_DSA_leetcode;

public class _1720_Decode_XORed_Array {
	
    public static int[] decode(int[] encoded, int first) {
        
    	int n =  encoded.length + 1;
    	int[] arr = new int[n];
    	arr[0] =  first;
    	
    	for (int i = 0; i < encoded.length; i++) {
			arr[i +  1] =  encoded[i] ^ arr[i];
		}
    	
    	
    	return arr;
    }
	
	
	public static void main(String[] args) {
		int  encoded[] = {1,2,3}, first = 1;
		System.out.println(decode(encoded, first));
	}
}
