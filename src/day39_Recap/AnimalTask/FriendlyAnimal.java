package day39_Recap.AnimalTask;

public class FriendlyAnimal extends Animal {

    public static boolean isWild = false,
                          isFriendly = true,
                          isPlayable = true;

    public FriendlyAnimal(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    public void play() {
        System.out.println(getName()+ " is playing");
    }


    public void pet() {
        System.out.println(getName()+ " likes being petted");
    }




}
