package clickListenerProcject;

public class Main {
	public static void main(String[] args) {
		
		Button btnLogin = new Button();
		
		btnLogin.setOnClickListeners(new OnClickListener() {
			
			@Override
			public void onclick() {
				// TODO Auto-generated method stub
				System.out.println("User is logged in");
			}
		});
		
		
		
		//this is for the button logout 
		Button btnLogout = new Button();
		btnLogout.setOnClickListeners(new OnClickListener() {
			
			@Override
			public void onclick() {
				// TODO Auto-generated method stub
				System.out.println("User is logged  out");

			}
		});
	}
}
