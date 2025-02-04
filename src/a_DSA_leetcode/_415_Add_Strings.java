package a_DSA_leetcode;

public class _415_Add_Strings {

	public static String addStrings(String num1, String num2) {

		int a = Integer.parseInt(num1);
		int b = Integer.parseInt(num2);

		
		int c =  a + b;
		
		String d =  String.valueOf(c);
		
		return d;

	}

	public static void main(String[] args) {
		String num1 = "11", num2 = "123";

		System.out.println(addStrings(num1, num2));
	}
}
