package methodOverloading;

//method overloading 
public class Calc {
	public static void main(String[] args) {
		//obj creation
		demo obj = new demo();
		
		// create int and add using obj. class name
		int n = obj.add(1,1);
		System.out.println(n);
	}
}

class demo{
	//make sure to define the param type
	
	//method that takes 2
	public int add(int n1, int n2) {
		return n1+ n2;
	}
	
	//method that takes 3 =  METHOD OVERLOADING PARAM	
	//this will be used if I give 3 number or else it will use the above one
	public int add(int n1, int n2, int n3) {
		return n1 + n2 + n3;
	}
}
