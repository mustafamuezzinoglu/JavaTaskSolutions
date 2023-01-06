package day17_While_DoWhileLoop;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int n1 = scan.nextInt();
        System.out.println("Enter a number");
        int n2 = scan.nextInt();
        System.out.println("Enter a math operator");
        char ch = scan.next().charAt(0);

        while (!(ch == '+' || ch == '-' || ch == '*' || ch == '/')) {
            System.out.println("Invalid math operator, please re-enter");
            ch = scan.next().charAt(0);
        }

            double res = 0;
            if (ch == '+') {
                res = n1 + n2;
            } else if (ch == '-') {
                res = n1 - n2;
            } else if (ch == '*') {
                res = n1 * n2;
            } else {
                res = n1 / n2;
            }
            System.out.println(res);
            scan.close();
        }
    }

