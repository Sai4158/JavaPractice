package simpleGame;

public class Main {
	public static void main(String[] args) {
//		parameter order matters
		
//		health is limited to  100
		Player1 player = new Player1("sai","sword",500);
		System.out.println("Health: "+player.getHealth());
		System.out.println("Name: "+player.getName());
		System.out.println("Weapon: "+player.getWeapon());
	}
}
