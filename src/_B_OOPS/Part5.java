package _B_OOPS;


 class owner{
	String name =  "Sai";
}

 class room extends Shop{
	
	 int roomNo = 3;
	 int noOfChairs = 2;
}
 
 interface supplierName{
	 String supplierName = "Sai";
	  
 }
 
 class Shop implements supplierName{
	 
}

public class Part5 {

	public static void main(String[] args) {
		room r = new room();
		System.out.println(r.noOfChairs);
	}
	
}