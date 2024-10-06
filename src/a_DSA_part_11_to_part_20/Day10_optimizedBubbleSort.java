package a_DSA_part_11_to_part_20;

public class Day10_optimizedBubbleSort {

    public static void main(String[] args) {

        // Sorted
         int n[] = {1, 2, 3, 4, 5, 6, 7};

        // Not Sorted
//        int n[] = {4, 1, 7, 2, 5, 2};

        boolean isSorted = true;  
        // First, check if the array is already sorted
        for (int i = 0; i < n.length - 1; i++) {
            if (n[i] > n[i + 1]) {
                isSorted = false;  
                break;
            }
        }

//        Check if Sort Is done
        // If the array is already sorted
        if (isSorted) {
            System.out.println("Already sorted.");
        } 
        
        
//        Else - SORT
        // If the array is not sorted, perform bubble sort
        else {
            System.out.println("Sorting the array...");

            // Bubble Sort to sort the array
            for (int i = 0; i < n.length - 1; i++) {
                for (int j = 0; j < n.length - 1 - i; j++) {
                    if (n[j] > n[j + 1]) {
                        int temp = n[j];
                        n[j] = n[j + 1];
                        n[j + 1] = temp;
                    }
                }
            }
            System.out.println("Just sorted.");
        }

        
        // Print 
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i] + " ");
        }
    }
}
