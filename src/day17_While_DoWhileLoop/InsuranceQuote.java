package day17_While_DoWhileLoop;

import java.util.Scanner;

public class InsuranceQuote {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Please enter your name");
        String name = scan.nextLine();

        System.out.println("Please enter your gender");
        String gender = scan.next().toLowerCase();

        while (!(gender.equals("male") || gender.equals("female"))) {
            System.err.println("Invalid entry please enter male or female");
            gender = scan.next();
        }

            System.out.println("Are you married?");
        String isMarried = scan.next().toLowerCase();

        while (!(isMarried.equals("yes") || isMarried.equals("no"))) {
            System.err.println("Invalid entry please enter yes or no");
            isMarried = scan.next().toLowerCase();
        }

            System.out.println("Please enter your age");
        int age = scan.nextInt();

        while (!(age >= 0 || age <= 120)) {
            System.err.println("Invalid entry please enter your age");
            age = scan.nextInt();
        }

            System.out.println("How many miles you drive");
        int mileage = scan.nextInt();

        while (!(mileage >= 5)) {
            System.err.println("Invalid entry please enter a number grater then 5");
            mileage = scan.nextInt();
        }

        scan.nextLine();

            System.out.println("Do you want full coverage or liability insurance");
        String insu = scan.nextLine().toLowerCase();

        System.out.println("Have you had any accidents or claims in past 5 years? (yes/no)");
        String accident = scan.next().toLowerCase();

        while (!(accident.equals("yes") || accident.equals("no"))) {
            System.err.println("Invalid entry please enter yes or no");
            accident = scan.next().toLowerCase();
        }

            System.out.println("Does your car an anti-theft device? (yes/no)");
        String antiTheft = scan.next().toLowerCase();

        while (!(antiTheft.equals("yes") || antiTheft.equals("no"))) {
            System.err.println("Invalid entry please enter yes or no");
            antiTheft = scan.next().toLowerCase();
        }
            System.out.println("Thanks for your answer");

        double cost = 0;
        if (insu.equals("liability insurance")) {
            if (age < 25) {
                cost += 90;
            } else {
                cost += 50;
            }
            if (mileage <= 10) {
                cost += 10;
            } else if (mileage > 10 && mileage <= 50) {
                cost += 30;
            } else {
                cost += 50;
            }
        } else {
            if (age < 25) {
                cost += 160;
            } else {
                cost += 120;
            }
            if (mileage <= 10) {
                cost += 20;
            } else if (mileage > 10 && mileage <= 50) {
                cost += 40;
            } else {
                cost += 70;
            }
        }
        double dr=1;
//        at = 0, ac=0, im = 0;

        if (antiTheft.equals("yes")){
            dr-= 0.05;}
        if(isMarried.equals("yes")){
            dr-= 0.05;
        }
        if(accident.equals("no")){
            dr-= 0.1;
        }else{
            dr +=0.15;
        }

        double totalCost=cost*dr;
        System.out.println("Your insurance price is "+totalCost);
scan.close();
    }

}