package day13_String;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Do u wanna split or not");
        String split = scan.nextLine().toLowerCase();

        System.out.println("How many r u");
        int nop = scan.nextInt();

        System.out.println("Enter the AMOUNT");
        double amount = scan.nextDouble();

        System.out.println("How was the service quality");
        String qauality = scan.next().toLowerCase();

        scan.close();
        double tipRate = 0;
        if (qauality.equals("excellent")) {
            tipRate += 0.25;
        } else if (qauality.equals("great")) {
            tipRate += 0.20;
        } else if (qauality.equals("good")) {
            tipRate += 0.15;
        } else if (qauality.equals("fair")) {
            tipRate += 0.10;
        } else {
            tipRate += 0.05;
        }

        double totalTip = amount * tipRate;
        double totalToPay = amount + totalTip;

        if (split.equals("yes")) {
            System.out.println("Number of people entered: " + nop + "\nTotal to pay:" + totalToPay + "\nTotal Tip: " + totalTip +
                    "\nTotal per person: " + totalToPay / nop + "\nTip per person: " + totalTip / nop);
        } else {
            System.out.println("Number of people entered: " + nop + "\nTotal to pay:" + totalToPay + "\nTotal per person: " + totalToPay / nop);
        }


    }
}

