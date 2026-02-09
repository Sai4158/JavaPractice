package _B_OOPS;


 class owner{
	String name =  "Sai";
}

 class Shop extends owner{
	 
}

 class room extends Shop{
	
	 int roomNo = 3;
	 int noOfChairs = 2;
}

public class Part5 {

	public static void main(String[] args) {
		room r = new room();
		System.out.println(r.noOfChairs);
		System.out.println(r.name);
	}
	
}