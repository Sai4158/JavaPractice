package a_DSA_part_11_to_part_20;

public class Day10_bubbleSort1 {
	public static void main(String[] args) {
		
int n[] = {5,4,54,34,24,6345,5};
		
		for (int i = 0; i < n.length-1; i++) {
			for (int j = 0; j < n.length-1; j++) {
				if(n[j] > n[j+1]) {
					int temp = n[j];
					n[j] = n[j+1];
					
					n[j+1] =  temp;
				}
			}
		}
		
//		Print
		for (int i = 0; i < n.length; i++) {
			System.out.println(n[i] + ",");
		}
	}
}
