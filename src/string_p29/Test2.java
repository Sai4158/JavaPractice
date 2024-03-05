package string_p29;

public class Test2 {
	public static void main(String[] args) {
		
		String s1 = new String("hello");
		String s2 = new String("hello");
		
		
		//ignoreCase = will check no matter the CAPS
		// equalsIgnoreCase
		System.out.println(s1.equalsIgnoreCase(s2));
				
		//equals = has to be exact 
		System.out.println(s1.equals(s2));
		
		//contains = if it has this text anywhere 
		System.out.println(s1.contains("ello"));
		
		//endsWith - put in "" and will check that 
		System.out.println(s1.endsWith("lo"));
		
		//startsWith - put in "" and will check that 
		System.out.println(s1.startsWith("he"));
	}

}
