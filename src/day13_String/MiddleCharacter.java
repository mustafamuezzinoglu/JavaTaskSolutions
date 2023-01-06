package day13_String;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class MiddleCharacter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (int i = 1; i < 5; i++) {
            System.out.println("Enter a three letter word");
            String word = scan.nextLine();
            String res = "";

            if (word.length() == 3) {
                if (word.charAt(1) == 'a') {
                    res = "Cool word";

                } else {
                    res = "Okay word";
                }
            }else{
                    if (word.length() < 3) {
                        res = "Word is too short";
                    }else{
                        res = "Word is too long";
                    }

                }
                System.out.println(res);

            }
        scan.close();
        }
    }
