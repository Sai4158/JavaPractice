package a_DSA_part_1_to_part_10;

public class Day3_arrayFunctions {
	
	public static int[] fun(int n) {
		int arr[]  = {4,34,5,34,5};
		
		return arr;
	}
	
	public static String func(String lastName, String FirstName) {
	
		String all =  FirstName +" "+ lastName;
		
		System.out.println(all);
		return all;
	}
	
	public static void main(String[] args) {
		
//		This function takes a first and last name then  add a space 
		func("RAN", "Sai");
		
		int vignesh[] = fun(4);
		for (int i = 0; i < vignesh.length; i++) {
			System.out.println(vignesh[i]);
		}
	}
}

//4
//34
//5
//34
//5 