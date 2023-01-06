package day14_String;

import java.util.Scanner;

public class WithOutFirst {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two word with . between them");
        String word = scan.next();
        System.out.println(word.substring(1, (word.indexOf("."))) + word.substring(word.indexOf(".") + 2));

        scan.close();


    }
}
