package a_DSA_part_21_to_part_30;

public class Day16_2DArrayRecap {
	public static void main(String[] args) {

		int arr[][] = {{4334,4433,4455},{4343,5654,6345},{4655,5346,6654}};

		int n = arr.length;
		
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println(arr[i][j]);
			}
		}

	}
}
