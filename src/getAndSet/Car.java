package getAndSet;

public class Car {
	private int doors;
	private int gears;
	private String modelName;
	private String Color;
	
	//lets make a method
	//this is a set
	public void setmodelName(String modelName) {
		this.modelName = modelName;
	}
	
	//this is a get
	//return the string
	public String getmodelName() {
		return this.modelName;
	}
	
	
	//this for the set doors 
	public void setdoors(int doors) {
		this.doors = doors;
	}
	
	//this is for the get doors 
	public int getdoors() {
		return this.doors;
	}

	
	//for others ones- auto generated
	public int getGears() {
		return gears;
	}

	public void setGears(int gears) {
		this.gears = gears;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}
	
	
}
