package simpleGame;

public class Player1 {
	private String name;
	private String weapon;
	private int health;

	// Generate constructors using fields
	public Player1(String name, String weapon, int health) {
		super();
		this.name = name;
		this.weapon = weapon;
		//if health is less than 0 or greater then 100 set the health to 100
		if(health < 0 || health > 100) {
			this.health = 100;
		} else {
			this.health = health;
		}
		

	}
	
	
	
	//damage by gun1 
	
	public void damageGun1() {
		this.health -= 30;

		//if else for health 
		if(this.health <=0) {
			this.health = 0;
		} 
		System.out.println("got hit by gun 1, Health is reduced by 30" + " new health is " + this.health);

		if(this.health == 0) {
			System.out.println(getName() + " is dead");
		}
	}
	
	
	
	

	public void damagebyGun2() {
		this.health -= 50;

		//if else for health 
		if(this.health <=0) {
			this.health = 0;
		} 
		System.out.println("got hit by gun 1, Health is reduced by 50" + " new health is " + this.health);

		if(this.health == 0) {
			System.out.println(getName() + " is dead");
		}

		//get and set 


	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWeapon() {
		return weapon;
	}
	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
}


