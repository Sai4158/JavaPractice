package string_p29;

import java.util.Arrays;

public class Test4 {
	public static void main(String[] args) {
		
		String s1 = "Hello world my name is sai";
		
		
		//index Of = enter word not number
		System.out.println(s1.indexOf("o"));
		
		// last index of 
		System.out.println(s1.lastIndexOf("o"));
		
		//sub string == will start from here 4 to 11
		System.out.println(s1.substring(0,14));
		
		//spilt must use Arrays.toString when using SPLIT
		System.out.println(Arrays.toString(s1.split(" ")));
		
		//Char = u give number it will give word of it. 
		System.out.println(s1.charAt(12));
		
		
	}

}
