
public class math_java {
	public static void main(String[] args) {
		
		//this is where I will write in the math code 
		
		double a = 5.434;
		
		int[] numbers = {5, 2, 9, 1, 7};

        int min = numbers[0];
        int max = numbers[0];
	        
//		this rounded will print 5
		System.out.println("Round: "+Math.round(a));
		
//		this is will remove the decimals points 
		System.out.println("Floor: "+Math.floor(a));
		
//		this is will change to next decimal if there is decimal point
		System.out.println("Ceil: "+Math.ceil(a));
		
		
//		this loop print max and min in java
		for (int i = 1; i < numbers.length; i++) {
            min = Math.min(min, numbers[i]);
            max = Math.max(max, numbers[i]);
        }

        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
	}
}
