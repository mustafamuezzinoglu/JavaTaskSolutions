package day39_Recap.AnimalTask;

public class Cat extends FriendlyAnimal{

    public Cat(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName()+ " is eating cat food");
    }


    public  void scratch(){
        System.out.println(getName()+ " is scratching");
    }

    public void meow(){
        System.out.println(getName()+ " is meowing");
    }
}
