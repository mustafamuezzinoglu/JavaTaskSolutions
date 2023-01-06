package day13_String;

import java.util.Scanner;

public class StringWithThreeCharacters {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        for (int i = 1; i < 4; i++) {

            System.out.println("Enter a word");
            String word = scan.nextLine();

            if (word.isEmpty()) {
                System.out.println("string is empty");
            } else if (word.length() > 3) {
                System.out.println(word.substring(word.length() - 3, word.length()));
            } else {
                System.out.println(word);

            }
        }
    }

}
