package day39_Recap.AnimalTask;

public class Zoo {

    public static void main(String[] args) {

        Dog dog =new Dog("Bony","Husky",'F',3, "Medium","White");
        System.out.println(dog);
        dog.bark();
        dog.eat();
        dog.play();
        dog.pet();
        final boolean isWild = dog.isWild;
        System.out.println(isWild);


    }





}
