package _B_OOPS;

public class Part1_OOPS {

	public static void main(String[] args) {

		String name1 = "cat";
		int price1  = 5;

        ToyStore branch1 = new ToyStore(name1, price1);

		System.out.println(branch1);
		
		branch1.fun();

	}
}

	class  ToyStore{
		String name;
		int price;

		public ToyStore(String name, int price) {

			name =  this.name;
			price  =  this.price;
		}
		
		
		public void fun() {
			System.out.println("Im a function");
		}

	}

