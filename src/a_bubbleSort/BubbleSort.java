package a_bubbleSort;

public class BubbleSort {

    // Main method
    public static void main(String[] args) {
//    	array of nums
        int arr[] = {7, 8, 3, 1, 7,6,2};

        // Bubble Sort
        
        //outerLoop
        for (int i = 0; i < arr.length - 1; i++) {
        	
        	//innerLoop
            for (int j = 0; j < arr.length - i - 1; j++) {
            	
//            	 checks if the current element is greater than the next element.
                if (arr[j] > arr[j + 1]) {
                	
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    
                }
            }
        }
        
        // Method to print the array

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }
}
