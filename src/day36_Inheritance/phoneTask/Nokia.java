package day36_Inheritance.phoneTask;

import java.util.ArrayList;

public class Nokia extends Phone {

    public Nokia(String model, String size, double price, String color) {
        super("Nokia", model, size, price, color);
    }

    public void selfDefence() {
        System.out.println(brand + " " + model + "can be used for self defence");
    }
}
