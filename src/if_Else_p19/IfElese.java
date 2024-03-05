package if_Else_p19;

public class IfElese {
	public static void main(String[] args) {
		
		String i = "pass";
		
		//nested if 
		
		if (i  == "pass") {
			System.out.println("wow");
		
			String i1 = "pass";
			if (i1.equals("pass")) {
				System.out.println("very good");
				}
			else{
				System.out.println("try again");
				}
		}
		// end nested if 
		
		// if first if fails 
		else{
			System.out.println("try again");
	}

}
}
