package arrays_p27;

public class Test2 {
	public static void main(String[] args) {
		// another method for jagged array
		int[][] arr = {
				{0,1},{2,2},{4,5,342, 324,23456,4653}
		};
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
				
			}
			System.out.println();
		}
	}

}
