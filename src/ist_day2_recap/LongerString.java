package ist_day2_recap;


public class LongerString{
	
//	private instance variables
	private String str1;
	private String str2;
	
//	Constructor
	public LongerString(String str1, String str2) {
		this.str1 = str1;
		this.str2 =  str2;
	}
	
	public String findLonger() {
		if(str1.length() < str2.length()) {
			return str2;
		} else {
			 return str1;
		}
	}
	
//	toString
	@Override
	public String toString() {
		return "(" +  str1 +  ", " +  str2 + ")";
	}
	
	
//	main method
public static void main(String[] args) {
	LongerString str =  new LongerString("BMW", "tesla");
	
//		Printing 
	System.out.println(str.findLonger());
		
	}
}