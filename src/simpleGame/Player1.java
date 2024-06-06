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
		this.health = health;

	}
	public void damageGun1() {
		this.health -= 30;

		//if else for health 
		if(this.health <=0) {
			this.health = 0;
		} 
		System.out.println("got hit by gun 1, Health is reducdeed by 30" + " new health is" + this.health);

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
		System.out.println("got hit by gun 1, Health is reducdeed by 50" + " new health is" + this.health);

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


