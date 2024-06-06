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
	@Override
	public void damageGun1() {
		if(armour) {
			this.health -= 30;
		}
		if(this.health <=0) {
			this.health = 0;
			System.out.println("Armour is on. Got hit by gun 1. Health is reduced by 20, New health is " + this.health);
		}
		
		if(!armour) {
			this.health = 0;
			System.out.println("Armour is on. Got hit by gun 1. Health is reduced by 40, New health is " + this.health);		}
	}
	
}
