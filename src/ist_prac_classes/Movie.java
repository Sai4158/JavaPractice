package ist_prac_classes;

import java.util.ArrayList;

public class Movie {
    
    private String title;
    private String mpaaRating;
    private Integer length;
    private String genre;
    private ArrayList<Actor> actors;

    public Movie(String title, String mpaaRating, Integer length, String genre, ArrayList<Actor> actors) {
        this.title = title;
        this.mpaaRating = mpaaRating;
        
        // movie length needs to be more than 0, otherwise throw an illegal argument error
        if (length > 0) {
            this.length = length;
        } else {
            throw new IllegalArgumentException("The length needs to be more than 0");
        }
        
        this.genre = genre;
        this.actors = actors;
    }

    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMpaaRating() {
        return mpaaRating;
    }

    public void setMpaaRating(String mpaaRating) {
        this.mpaaRating = mpaaRating;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        if (length > 0) {
            this.length = length;
        } else {
            throw new IllegalArgumentException("The length needs to be more than 0");
        }
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public ArrayList<Actor> getActors() {
        return actors;
    }

    public void setActors(ArrayList<Actor> actors) {
        this.actors = actors;
    }

    @Override
    public String toString() {
        return "Movie [title=" + title + ", mpaaRating=" + mpaaRating + ", length=" + length + ", genre=" + genre
                + ", actors=" + actors + "]";
    }
}
