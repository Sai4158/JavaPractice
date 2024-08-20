package a_bubbleSort;

public class BubbleSort_1 {
	public static void main(String[] args) {
		
		int AbcArr[] = {4,5,7,4,3,7,1};

		for (int i = 0; i < AbcArr.length -1; i++) {
			
			for (int j = 0; j < AbcArr.length - i -1; j++) {
				if(AbcArr[j] > AbcArr[j+1]) {
					
					int temp = AbcArr[j];	
					AbcArr[j] = AbcArr[j + 1];
					AbcArr[j + 1] = temp;
				}
			}
		}
		
//		This is for loop is for printing
		for (int i = 0; i < AbcArr.length; i++) {
			System.out.print(AbcArr[i] + "");
		}
		System.out.println();
	}
}
