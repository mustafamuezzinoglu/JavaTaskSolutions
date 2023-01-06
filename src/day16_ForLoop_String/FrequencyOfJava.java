package day16_ForLoop_String;

import java.util.Scanner;

public class FrequencyOfJava {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine().toLowerCase();
        String word="java";
        int count = 0;
        for (int i = 0; i < sentence.length()-3; i++) {
           String str= sentence.substring(i,i+4);

            if (str.equals(word)){
                count++;
            }

        }
        System.out.println(count);

    }
}
