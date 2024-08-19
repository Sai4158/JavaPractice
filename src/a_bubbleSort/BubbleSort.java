package a_bubbleSort;

public class BubbleSort {
	
    // Method to print the array
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); // Move to the next line after printing the array
    }

    // Main method
    public static void main(String[] args) {
        int arr[] = {7, 8, 3, 1, 2};

        // Bubble Sort
        for (int i = 0; i < arr.length - 1; i++) {
        	
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Print the sorted array
        printArray(arr);
    }
}
