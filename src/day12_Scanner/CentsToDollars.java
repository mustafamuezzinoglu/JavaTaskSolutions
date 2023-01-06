package day12_Scanner;

import java.util.Scanner;

public class CentsToDollars {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("How many cents do you have?");
        int cents= scan.nextInt();
        scan.close();
        int dollar=cents/100;
        cents -= dollar * 100;
        //int remainCent= cents%100;
        System.out.println(dollar+ " dollars and "+ cents+ " cents");
        //cents+ " cents equal to: "+




    }
}
