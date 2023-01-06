package day16_ForLoop_String;

import java.util.Scanner;

public class PositiveNegativeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter five numbers: ");
        int positive = 0;
        int negative = 0;
        for (int i = 1; i <= 5; i++) {
            int n = scan.nextInt();

            if (n< 0) {
                negative++;
            } else if (n > 0) {
                positive++;
            }

        }
        System.out.println(positive + " positive and " + negative + " negative");
        scan.close();
    }
}


