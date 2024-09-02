package ist_prac_Inheritance;

public abstract class Pet {

    private String name;
    private String breed;

    public Pet(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return String.format("%s %s", name, breed);
    }

    // Abstract methods
    public abstract String makeSound();
    public abstract String doTrick(String command);
}
