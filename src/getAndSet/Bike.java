package getAndSet;

public class Bike {
	
	private String bikeModel;
	private int bikeCost;
	private String bikeColor;
	
	//constructor
	public Bike(String bikeModel, int bikeCost, String bikeColor) {
		this.bikeColor = bikeColor;
		this.bikeCost = bikeCost;
		this.bikeModel = bikeModel;
	}

	//get and set
	public String getBikeModel() {
		return bikeModel;
	}

	public void setBikeModel(String bikeModel) {
		this.bikeModel = bikeModel;
	}

	public int getBikeCost() {
		return bikeCost;
	}

	public void setBikeCost(int bikeCost) {
		this.bikeCost = bikeCost;
	}

	public String getBikeColor() {
		return bikeColor;
	}

	public void setBikeColor(String bikeColor) {
		this.bikeColor = bikeColor;
	}
	

	
}
