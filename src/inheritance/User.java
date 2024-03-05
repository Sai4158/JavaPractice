package inheritance;

public class User implements Iadmin {

	public static void main(String[] args) {

		// u need to create object to access them
		
		//can name any
		Guest guest = new Guest();
		guest.read();
		
		//dev
		Developer Developer = new Developer();
		Developer.read();
		
		//Admin
		Admin admin = new Admin();
		admin.read();

	}

}
