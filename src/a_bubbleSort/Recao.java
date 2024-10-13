package a_bubbleSort;

public class Recao {
	public static void main(String[] args) {
		
		int arr[] = {45,4,6452,3,5,6,7,2345,4};
		
		
		for (int i = 0; i < arr.length-1; i++) {
			
			
			for (int j = 0; j < arr.length-1; j++) {
				if(arr[j]>arr[j+1]) {
					int temp =  arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
//		Printing 
		for (int i = 0; i < arr.length; i++) {
		System.out.println(arr[i] + ",");	
		}
	}
}
