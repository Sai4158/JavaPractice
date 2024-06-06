package simpleGame;

public class Main {
	public static void main(String[] args) {
//		parameter order matters
		
//		health is limited to  100
		Player1 player = new Player1("nxnwx","sword",500);
		
		
//		System.out.println("Health: "+player.getHealth());
//		System.out.println("Name: "+player.getName());
//		System.out.println("Weapon: "+player.getWeapon());
		
		//player 1 got hit gun1 by 3 times
		player.damageGun1();
		player.damageGun1();
		player.heal();
		player.damageGun1();

//	----it will print 
//		got hit by gun 1, Health is reduced by 30 new health is 70
//		got hit by gun 1, Health is reduced by 30 new health is 40
//		got hit by gun 1, Health is reduced by 30 new health is 10
	
		
		//payer1 got hit by gun2
		player.damagebyGun2();
		//nxnwx is dead
		//since there is no health it will print this
		//this is getting the from the constroutor above
	
		
		System.out.println("--------------------");
		System.out.println("Player 2");
		//--------------
		//now player2
		
//		the true is for armour, which descrese the damage
		Player2 player2 =  new Player2("nxnwx","sword",100, true);
		
		player2.damageGun1();;
		player2.damagebyGun2();;
		
		player2.heal();

		
//		Player 2
//		Armour is on. Got hit by gun 1. Health is reduced by 20, New health is 80
//		Armour is on. Got hit by gun 1. Health is reduced by 40, New health is 40
//		Health is 100
	}
}
