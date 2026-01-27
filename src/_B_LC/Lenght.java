package _B_LC;

public class Lenght {
	
	public static int Lenghtt(String ss) {
		
		
		int ans  = 0;
		
		for (int i = 0; i < ss.length(); i++) {
			
			char c =  ss.charAt(i);
			
//			If b is found, delete it because always ends B
			if(c == 'B' && ans > 0) {
				ans --;
			}
			
//			 else found, add it
			else {
				ans++;
			}
		}
		
		return ans;
		
	}
	
	public static void main(String[] args) {
		
		String s = "AB";
		System.out.println(Lenghtt(s));
				
		
	}
}
