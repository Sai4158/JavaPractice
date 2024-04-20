package arrayCreation;

public class Array {
	public static void main(String[] args) {
		int num[] = {1,2,3,4,5};
		
		//this is how you print a array
		for(int i= 0; i<num.length; i++) {
			System.out.print(num[i]);
		}
		System.out.println();
		
		
		//this will print number at the index 2 
		System.out.println(num[2]);
		
		
		System.out.println();
		
		
		//arrays 
		int num1[] =  new int[5];
		
		num1[0] = 32;
		num1[1] = 23;
		num1[2] = 342;
		num1[3] = 23;
		num1[4] = 453;
		
		for (int j = 0; j < num1.length; j++) {
			System.out.print(num1[j] + ",");
		}
	}

}
