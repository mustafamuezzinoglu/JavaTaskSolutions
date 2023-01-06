package day36_Inheritance.phoneTask;

public class PhoneObjects {
    public static void main(String[] args) {
        Iphone iphone = new Iphone("13Pro", "Max", 1300, "Red");
        Samsung samsung = new Samsung("Galaxy", "Max", 900, "Purple");
        Nokia nokia = new Nokia("3310", "Little", 200, "Black");

        iphone.call(05053664677);
        samsung.freeze();
        nokia.selfDefence();
        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(nokia);


    }
}
