package a_DSA_part_11_to_part_20;

public class Day8_BIG_O {
	
//	This is o(n)
	public int sumArray(int[] arr) {
	    int sum = 0;
	    for (int i = 0; i < arr.length; i++) {
	        sum += arr[i];
	    }
	    return sum;
	}


//	--------------------------
	
//	This is  O(2^n)
	public int fibonacci(int n) {
	    if (n <= 1) {
	        return n;
	    }
	    return fibonacci(n - 1) + fibonacci(n - 2);
	}

//	--------------------------
	

//	This is O(n^2)
	public void printPairs(int[] arr) {
	    for (int i = 0; i < arr.length; i++) {
	        for (int j = 0; j < arr.length; j++) {
	            System.out.println(arr[i] + ", " + arr[j]);
	        }
	    }
	}


//	--------------------------

//	This is O(n)
	public int findTarget(int[] arr, int target) {
	    for (int i = 0; i < arr.length; i++) {
	        if (arr[i] == target) {
	            return i;
	        }
	    }
	    return -1;
	}
//	--------------------------


	
}
