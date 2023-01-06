package day13_String;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your full name:");
        String firstName = scan.nextLine();

        scan.close();


        String second= (firstName.substring(firstName.indexOf(" ")+1, firstName.indexOf(" ")+2)).toUpperCase();
        firstName= (firstName.substring(0,1)).toUpperCase();
        System.out.println(firstName+ "."+ second);




    }
}
