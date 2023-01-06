package day19_LoopAndString;

import java.util.Scanner;

public class RectangleCalculator {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        while (true){
            System.out.println("Enter the length of the Rectangle:");
            double l = scan.nextDouble();
            if (l<=0){
                System.out.println("Invalid Entry for the side of the square");
                System.exit(0);
            }
            System.out.println("Enter the width of the Rectangle:");
            double  w = scan.nextDouble();
            if (w<=0){
                System.err.println("Invalid Entry for the side of the square");
                System.exit(0);
            }
            double area =l*w;
            double peri=(l+w)*2;
            System.out.println("area = " + area);
            System.out.println("peri = " + peri);
            System.out.println("Would you like to calculate another Rectangle?");
            String a= scan.next().toLowerCase();
            while( ! ( a.equals("yes") || a.equals("no") ) ){
                System.err.println("Invalid entry,  to re-enter a valid entry");
                a= scan.next().toLowerCase();

            }
            if(a.equals("no")){
                System.out.println("Thank you for using Cydeo Square Calculator APP");
                break;
            }

        }







        /*
        Write a program that can calculate the area and perimeter of a Rectangle:
			1. Ask the user "Enter the length of the Rectangle:"
				if user enters 0 or negative numbers, terminate the program after displaying the error message "Invalid Entry for the length of the rectangle"

			2. Ask the user "Enter the width of the Rectangle:"
				if user enters 0 or negative numbers, terminate the program after displaying the error message "Invalid Entry for the width of the rectangle"

			3. Display:
					1. Area of rectangle
					2. Perimeter of rectangle

			4. Ask the user "Would you like to calculate another Rectangle?"
					If "yes" --> repeat the previous steps
					If "No" --> Print "Thank you for using Cydeo Rectangle Calculator APP"

				If user enters an invalid entry, ask the user to re-enter until user provides a valid entry


         */
    }
}
