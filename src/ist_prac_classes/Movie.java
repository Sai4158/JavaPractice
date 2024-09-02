package ist_prac_classes;

import java.util.ArrayList;

public class Movie {
	
	private String  title;
	private String  mpaaRating;
	private Integer  lenght;
	private String  genre;
//	 Arraylist then put the class inside that you want 
	private ArrayList<Actor> actor;
	
	
	public Movie(String title , String  mpaaRating, Integer lenght, String genre, ArrayList<Actor> actor) {
		
		this.title  = title;
		this.mpaaRating =  mpaaRating;
		this.lenght = lenght;
		
		
//		movie length needs to more than 0 otherwise throw illegal error
		
		if(lenght >0) {
			this.lenght = lenght;
		}else {
			throw new IllegalArgumentException("The lenght need to more that 0");
		}
		
	}
}
