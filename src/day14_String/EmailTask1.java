package day14_String;

import java.util.Scanner;

public class EmailTask1 {
    public static void main(String[] args) {
        /*Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName = scan.nextLine();
        System.out.println("Enter your last name");
        String lastName = scan.nextLine();
        System.out.println("Enter an email adress");
        String email = scan.nextLine();
        scan.close();
        if (email.startsWith(lastName) && email.length()+1==email.indexOf("_") && email.length()+2==firstName.charAt(0)){
            System.out.println(email);
        }else {
            System.out.println(lastName + "_" + firstName + "@" + "gmail.com");
*/
        String email = "mike_tyson@gmail.com";

        String firstName = email.substring(0, email.indexOf("_"));
        String lastName = email.substring(email.indexOf("_")+1 , email.indexOf("@"));
        String rest = email.substring(email.indexOf("@"));

        email = lastName + "_" + firstName + rest;

        System.out.println(email);





        }

    }




