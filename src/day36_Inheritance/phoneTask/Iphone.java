package day36_Inheritance.phoneTask;

public class Iphone extends Phone {

    public Iphone(String model, String size, double price, String color) {
        super("Iphone", model, size, price, color);
    }

    public void faceTime(long phoneNumber) {
        System.out.println(brand + " " + model + " has facetime with " + phoneNumber);
    }

    public void facetime(String eMail) {
        System.out.println(brand + " " + model + " facetime with " + eMail);
    }

}
