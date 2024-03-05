package arrays_p27;

public class Test1 {
	public static void main(String[] args) {
		
		int [][]arr = new int [3][];
		arr[0] = new int[2];
		arr[1] = new int[3];
		arr[2] = new int[1];
		
		arr[0][0]= 1;
		arr[0][1]= 2;
		
		arr[1][0]= 10;
		arr[1][1]= 20;
		arr[1][2]= 10;
		
		arr[2][0]= 1;
		
		
		for (int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				// make sure it is print not ln
				System.out.print(arr[i][j] + " ");
				
				//give space for new line
			}System.out.println();
		}
		
	}

}