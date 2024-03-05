package looping_p28;

public class Test3 {
	public static void main(String[] args) {
		
		//This is muliti dimentional array 
		int[][] arr = {
				//Single dimentional array inside mutlti
				{2,3,4}, 
				{4,2,4}, 
				{7,6,4}
		};
		
		for(int[] i : arr) {
			int sum = 0;
			int noOfElements=0;
			for(int[] singleDimArray:arr) {
				for(int value:singleDimArray)
					sum += value;
				noOfElements++;
				
			}
		System.out.println(sum);
		System.out.println(sum/noOfElements);
		}
		
	}

}
