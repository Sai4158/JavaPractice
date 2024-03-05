package string_p29;

public class Test3 {
	public static void main(String[] args) {

		String s1 = new String("     hello world    ");

		// will give u the charcter lenght
		System.out.println(s1.length());

		// will give u the charcter lenght and remove spaces
		//trim() - only remove front and end spaces (not middle)
		System.out.println(s1.trim().length());

		// to all upper case
		System.out.println(s1.toUpperCase());

		// to all lower case
		System.out.println(s1.toLowerCase());

		//fun - added all 
		System.out.println(s1.trim() + s1.toUpperCase() + s1.length() + s1.toLowerCase());

	}

}
