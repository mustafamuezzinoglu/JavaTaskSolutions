package day16_ForLoop_String;

import java.util.Scanner;

public class MultiplyTwoNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two positive numbers");
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int sum = 0;
        for (int i = 1; i <= n2; i++) {
            sum += n1;
        }
        System.out.println(sum);

    }
}
