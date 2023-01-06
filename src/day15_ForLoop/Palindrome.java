package day15_ForLoop;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        scan.close();
        String word2 = "";
        for (int i = word1.length() - 1; i >= 0; i--) {
            word2 += word1.charAt(i);
        }


        System.out.println(word1.equals(word2));


    }
}
