package day39_Recap.AnimalTask;

public class Dog extends FriendlyAnimal{

    public Dog(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName()+ " is eating dog food");
    }

    public void bark(){
        System.out.println(getName()+ " is barking");
    }

}
