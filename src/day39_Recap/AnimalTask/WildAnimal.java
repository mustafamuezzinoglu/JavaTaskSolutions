package day39_Recap.AnimalTask;

public class WildAnimal extends Animal {

    public static boolean isWild = true,
                          isFriendly = false,
                        isPlayable = false;

    public WildAnimal(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    public void hunt() {
        System.out.println(getName() + " is hunting");
    }


}
