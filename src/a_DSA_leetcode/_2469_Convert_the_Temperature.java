package a_DSA_leetcode;

public class _2469_Convert_the_Temperature {
	
    public static double[] convertTemperature(double celsius) {
        
    	double kel = 0;
    	double fah = 0;
    	
    	kel =  celsius + 273.15;
    	fah = celsius * 1.80 + 32.00;
    	
    	
    	return new double[]{kel, fah};
    }
	
	public static void main(String[] args) {
		double celsius = 36.50;		
		System.out.println(convertTemperature(celsius));
	}
}
