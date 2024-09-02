package ist_prac_classes;

public class Actor {

		private String firstName;
		private String lastName;
		
		
//		get and set methods to access the instanceVariable on the main class 
		public Actor(String firstName, String lastName) {
			
			this.firstName = firstName;
			this.lastName = lastName;
		}
		
		



		public String getFirstName() {
			return firstName;
		}



		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}



		public String getLastName() {
			return lastName;
		}



		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		

		public String Spacer() {
			return String.format("%s %s",firstName, lastName);
		}
}
