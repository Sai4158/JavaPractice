package simpleGame;

public class Main {
	public static void main(String[] args) {
//		parameter order matters
		
//		health is limited to  100
		Player1 player = new Player1("nxnwx","sword",500);
		Player2 player2 =  new Player2("nxnwx","sword",500, false);
		
		
//		System.out.println("Health: "+player.getHealth());
//		System.out.println("Name: "+player.getName());
//		System.out.println("Weapon: "+player.getWeapon());
		
		//player 1 got hit gun1 by 3 times
		player.damageGun1();
		player.damageGun1();
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
		
		
		//--------------
		//now player2
	}
}
