package looping_p28;

import javax.xml.validation.Validator;

public class Test2 {
	public static void main(String[] args) {
		
		int[]arr = {213,123,123};
		
		//this is FOR EACH looping statement (Easy)
		//this only for i++ not for i-- (Can not write it backwords)
		int sum = 0;
		for(int value:arr) {
			sum += value;
		
	}
		//this is print the sum 
		System.out.println("Sum:" + sum);
		
	//this is will print the average 
		System.out.println("Average: " + sum/arr.length);
	}
	
}
