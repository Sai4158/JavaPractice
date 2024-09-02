package ist_prac_classes;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Actor abc = new Actor("Sai", " Rang");
		
		
		System.out.println(abc.getFirstName() + abc.getLastName());
		
		System.out.println();
		
		
		// Create an ArrayList to hold Actor objects
        ArrayList<Actor> actors = new ArrayList<Actor>();
     // Add the actor to the list from above
        actors.add(abc);  

        // Create a Movie object
        Movie aMovie = new Movie("Hello", "PG-13", 120, "Action", actors);

        // Print the movie details
        System.out.println(aMovie);
	}
}

//Sai Rang
