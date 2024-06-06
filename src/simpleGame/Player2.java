package simpleGame;

//extends all the properties from the player1
public class Player2 extends Player1 {
	
	private int health;
	private boolean armour;
	
	public Player2(String name, String weapon, int health, boolean armour) {
		super(name, weapon, health);
		
		this.health = health;
		this.armour = armour;
	}

	//override method
//	gun1 settings
	@Override
	public void damageGun1() {
		if(armour) {
			this.health -= 20;
		}
		if(this.health <=0) {
			this.health = 0;
			System.out.println("Armour is on. Got hit by gun 1. Health is reduced by 20, New health is " + this.health);
		}
		
		if(!armour) {
			this.health -= 30;
			this.health = 0;
			System.out.println("Armour is on. Got hit by gun 1. Health is reduced by 30, New health is " + this.health);

		}
		if(this.health ==0) {
			System.out.println(getName() + " is dead");
		}
	}

//	@Override method 
//	increase the power since this is gun2
	
	@Override
	public void damagebyGun2() {
		if(armour) {
			this.health -= 40;
		}
		if(this.health <=0) {
			this.health = 0;
			System.out.println("Armour is on. Got hit by gun 1. Health is reduced by 40, New health is " + this.health);
		}
		
		if(!armour) {
			this.health -= 50;
			this.health = 0;
			System.out.println("Armour is on. Got hit by gun 1. Health is reduced by 50, New health is " + this.health);

		}
		if(this.health ==0) {
			System.out.println(getName() + " is dead");
		}
	}
		
}
