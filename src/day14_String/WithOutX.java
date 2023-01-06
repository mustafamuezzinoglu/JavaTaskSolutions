package day14_String;

import java.util.Scanner;

public class WithOutX {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String withOutX = scan.next();
       if (withOutX.startsWith("x") || withOutX.startsWith("X")) {
            //if(withOutX.charAt(0)=='x'|| withOutX.charAt(0)=='X'){
            System.out.println(withOutX.substring(1));
            //    System.out.println(withOutX.replaceFirst("substring(1));
        } else {
            System.out.println(withOutX);

        }
        scan.close();
    }
}