package string_p29;

public class Test1 {
	public static void main(String[] args) {
		
		//this is normal string
		String s1 = "hello";
		String s2 = "hello";
		
		//this is creating string thru object
		String s3 = new String("hello");
		String s4 = new String("hello");
		
		//== will only compare the addresses
		System.out.println(s1 == s2);
		
		//Can not compare the string to a object
		System.out.println(s1 == s3);

		
		//will compare the data between two of these
		System.out.println(s3.equals(s4));
		
		//must use .equals to compare string to a object
		System.out.println(s1.equals(s3));

	}

}
