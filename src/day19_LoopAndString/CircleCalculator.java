package day19_LoopAndString;

import java.util.Scanner;

public class CircleCalculator {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        while( true){
        System.out.println("Enter the radius of the circle:");
        int r = scan.nextInt();
        double pi=3.14;
        double area=2*pi*r;
        double diameter=2*r;
        double perimeter=pi*diameter;

        if (r<=0){
            System.out.println("Invalid Entry for the radius of the circle");
            System.exit(0);
        }

            System.out.println("diameter = " + diameter);
            System.out.println("area = " + area);
            System.out.println("perimeter = " + perimeter);

            System.out.println("Would you like to calculate another circle?");
            String yN = scan.next().toLowerCase();
            while ( ! (yN.equals("yes") || yN.equals("no") )){
                System.out.println("Invalid entry,re-enter a valid entry");
                yN = scan.next().toLowerCase();
            }
            if (yN.equals("no")){
                System.out.println("Thank you for using Cydeo Circle Calculator APP");
                System.exit(0);
            }

        }
        /*
         Write a program that can calculate the area and perimeter of a circle:
			1. Ask the user "Enter the radius of the circle:"
				if user enters 0 or negative numbers, terminate the program after displaying the error message "Invalid Entry for the radius of the circle"

			2. Display:
					1. Diameter of circle
					2. Area of circle
					3. Perimeter of circle

			3. Ask the user "Would you like to calculate another circle?"
					If "yes" --> repeat the previous steps
					If "No" --> Print "Thank you for using Cydeo Circle Calculator APP"

				If user enters an invalid entry, ask the user to re-enter until user provides a valid entry

         */
    }
}
