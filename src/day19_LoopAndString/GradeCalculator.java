package day19_LoopAndString;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        while (true){
            System.out.println("Enter your score");
           int g = scan.nextInt();
            String res="";

            if (g<0 || g>100) {
                System.out.println("Invalid Entry");
                System.exit(0);
            }
                if (g>90 && g<=100) {
                    res = "A";
                } else if (g>80 && g<=90) {
                    res = "B";
                } else if (g>70 && g<=80) {
                    res = "C";
                } else if (g>60 && g<=70 ){
                    res = "D";
                } else {
                    res = "F";
                }



            System.out.println("res = " + res);

            System.out.println("Would you like to to continue?");
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
        Write a program for g calculator:
			1. Ask the user "Enter your score"
				If user enters invalid score, terminate the program after displaying the error message "Invalid Entry"

			 2. Display the g of the student.
			 		90 ~ 100 ==> A
			 		80 ~ 89 ==> B
			 		70 ~ 79 ==> C
			 		60 ~ 69 ==> D
			 		0 ~ 59 ==> F

			2. Ask the user would you like to continue
				If "yes" --> repeat the previous steps
				If "no" --> print "Thank you for using Cydeo g Calculator APP"

				If user enters an invalid entry, terminate the program after displaying the error message "Invalid Entry"
         */
    }
}
