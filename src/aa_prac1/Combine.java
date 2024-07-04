package aa_prac1;

public class Combine implements Phone {

	@Override
	public void sim(int sim) {
		// TODO Auto-generated method stub
		System.out.println("This phone has "+sim + " sims.");

	}

	@Override
	public void speaker() {
		// TODO Auto-generated method stub
		System.out.println("This phone has " + " sims.");

	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("This phone has "+  " sims.");

	}

	@Override
	public void camera() {
		// TODO Auto-generated method stub
		System.out.println("This phone has "+ " sims.");

	}

	@Override
	public void flashLight(boolean flash) {
		// TODO Auto-generated method stub

		if(flash == true) {
			System.out.println("This phone has flash");

		} else {
			System.out.println("This phone has no flash");

		}

	}


}
