package day13_String;

import java.util.Scanner;

public class FirstLastCharSame {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Enter a word");
        String word=scan.next();
        scan.close();

        if(word.charAt(0)== word.charAt(word.length()-1)){
            System.out.println("same");
        }else{
            System.out.println("Not same");
        }

    }
}
