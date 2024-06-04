package getAndSet;

public class BikeMain {
	public static void main(String[] args) {
		
		Bike b = new Bike("honda",5500,"black");
		
		//printing them 
		System.out.println(		b.getBikeCost());
		System.out.println(		b.getBikeModel());
		System.out.println(		b.getBikeColor());

	}
}
