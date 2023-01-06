package day13_String;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a 5 letter word");
        String word = s.next();
        s.close();
        if (word.length() != 5) {
            if (word.length() > 5) {
                System.out.println("Too Long");
            } else {
                System.out.println("Too short");
            }
        }else{
                System.out.println(""+word.charAt(4)+word.charAt(3)+word.charAt(2)+word.charAt(1)+word.charAt(0));
            }

        }


    }

