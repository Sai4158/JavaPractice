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
	
	
	
//	this is the main method 
	
	public static void main(String[] args) {
		EncapsulationPrac h1 = new EncapsulationPrac();
		
		h1.setCar("BMW");
		h1.setCarColor("Gray");
		h1.setCarNumber(9999);
		
		System.out.println("this is the car model: " + 
		h1.car + ", this is the car color: " + 
				h1.carColor +" and this is car number "+ 
		h1.carNumber);
	}
	
	
}
