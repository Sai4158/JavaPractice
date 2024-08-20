package a_Tricky_java;

public class BubbleSort {
	public static void main(String[] args) {
		int n[] = {5,3,7,2,1};
		
		for (int i = 0; i < n.length-1; i++) {
			
			for (int j = 0; j < n.length-i-1; j++) {
				if(n[j]>n[j+1]) {
					int temp = n[j];
					n[j] = n[j+1];
					n[j+1] =  temp;
					
				}
			}
		}
		
		for (int i = 0; i < n.length; i++) {
			System.out.print(n[i] + ",");
		}
		System.out.println();
	}
}
