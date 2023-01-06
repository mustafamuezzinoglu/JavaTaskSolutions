package day17_While_DoWhileLoop;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sum = 0;
        while (true) {
            System.out.println("Enter a num");
            int num = scan.nextInt();
            if (num < 0)
                break;
            sum += num;
        }
        System.out.println(sum);
        scan.close();
    }

}

