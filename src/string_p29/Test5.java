package string_p29;

public class Test5 {
	public static void main(String[] args) {
		
		String s1 = "Hello i Am Sai and i like this";
		
		//value from string to int
		String s2 = "2133";
		String s3 = " ";
		
				
	
		//replace hello with Yooo
		System.out.println(s1.replace("Hello", "Yooo"));
		
		//replace All "I"
		System.out.println(s1.replaceAll("i","we"));
		
		//Value of 
		System.out.println(Integer.valueOf(s2));
		
		
		//IsEmpty - anything or flase
		System.out.println(s3.isEmpty());
		
		//IsBlank - will check if it has any data
		System.out.println(s3.isBlank());
	}
}
