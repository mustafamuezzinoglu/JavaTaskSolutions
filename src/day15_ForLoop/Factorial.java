package day15_ForLoop;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
    int num = scan.nextInt();
        scan.close();
    int f = 1;
        for (int i = num; i >=1 ; i--) {
           f*=i;
        }
        System.out.print(f);
        }
}
