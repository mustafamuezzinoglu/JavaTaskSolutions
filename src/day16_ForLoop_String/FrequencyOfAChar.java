package day16_ForLoop_String;

import java.util.Scanner;

public class FrequencyOfAChar {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string");
        String word = scan.nextLine();
        System.out.println("Enter a char");
        char ch = scan.next().charAt(0);
        int countChar = 0;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (c==ch){
                countChar++;
            }

        }
        System.out.println(countChar);
        scan.close();

    }

}
