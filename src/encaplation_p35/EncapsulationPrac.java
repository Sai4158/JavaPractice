package encaplation_p35;

import java.util.Scanner;

public class EncapsulationPrac {

//	these are the variables 
	String car;
	int carNumber;
	String carColor;
	
	
//	setters and getters here  
	public String getCar() {
		return car;
	}
	public void setCar(String car) {
		this.car = car;
	}
	public int getCarNumber() {
		return carNumber;
	}
	public void setCarNumber(int carNumber) {
		this.carNumber = carNumber;
	}
	public String getCarColor() {
		return carColor;
	}
	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}
	
}
	
//	this is the main method 
	
	 class printer {
		Scanner scanner = new Scanner(System.in);
        EncapsulationPrac h1 = new EncapsulationPrac();

        System.out.print("Enter car model: ");
        h1.setCar(scanner.nextLine());

        System.out.print("Enter car color: ");
        h1.setCarColor(scanner.nextLine());

        System.out.print("Enter car number: ");
        h1.setCarNumber(scanner.nextInt());

        System.out.println("This is the car model: " + h1.getCar() + 
            ", this is the car color: " + h1.getCarColor() + 
            " and this is the car number: " + h1.getCarNumber());
        
        scanner.close();

	}
	
		
	public static void main(String[] args) {
		printer main = new printer();
		
		
	}
	
	

