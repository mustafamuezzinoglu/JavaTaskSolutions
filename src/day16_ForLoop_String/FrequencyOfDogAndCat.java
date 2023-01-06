package day16_ForLoop_String;

import java.util.Scanner;

public class FrequencyOfDogAndCat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence = "caT dog dogG cAt";

        int count1 = 0,
                count2 = 0;
        for (int i = 0; i < sentence.length() - 2; i++) {
            String str = sentence.substring(i, i + 3);

            if (str.equalsIgnoreCase("cat")) {
                count1++;
            } else if (str.equalsIgnoreCase("dog")) {
                count2++;
            }
        }
            System.out.println(count1 == count2);


    }
}