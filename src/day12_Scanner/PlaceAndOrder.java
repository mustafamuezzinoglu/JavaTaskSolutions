package day12_Scanner;

import java.util.Scanner;

public class PlaceAndOrder {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Enter your product name ");
        String productName=scan.nextLine();

        System.out.println("Enter the price");
        double price=scan.nextDouble();

        System.out.println("Enter the quantity");
        int quantity=scan.nextInt();

        System.out.println("Enter your first name");
        String firstName=scan.next();

        scan.close();

        System.out.println(firstName+ ", your order for "+ quantity+" "+productName+" has been places. Your total is "+quantity*price+".");



    }
}
