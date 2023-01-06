package day12_Scanner;

import java.util.Scanner;

public class StockMarked {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("How many total shares do you have");
        int share = scan.nextInt();
        if (share > 0) {
            System.out.println("How much your total value in the stock market");
            double value = scan.nextDouble();

            scan.nextLine();

            System.out.println("Enter the name of the company you have the most shares in ");
            String nameOfCompany = scan.nextLine();

            scan.close();

            System.out.println("Your total stock market holding is $" + value + " which is made up of "
                    + share + " shares. " + nameOfCompany + " is your company holdings");
        }


    }
}
