package day18_NestedLoop;

import java.util.Scanner;

public class CalculateTwoNumbers {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        while (true){
            System.out.println("enter the first number");
            int n1=scan.nextInt();
            System.out.println("enter a math operator (+,-,/,*)");
            char op=scan.next().charAt(0);
            while ( ! (op=='+' || op=='-' || op=='/' || op=='*' )){

                System.err.println("Invalid operator. Please re enter");
                op = scan.next().charAt(0);
            }
            System.out.println("enter the second number");
            int n2=scan.nextInt();
            if (op=='+'){
                System.out.println(n1+n2);
            } else if (op=='-'){
                System.out.println(n1-n2);
            } else if (op=='/'){
                System.out.println(n1/n2);
            } else if (op=='*'){
                System.out.println(n1*n2);
            }
            System.out.println("Do you want to continue");
            String yN=scan.next();

            while( !( yN.equals("yes") || yN.equals("no") ) ){ // while the answer is not valid answer
                System.err.println("Invalid Entry, please enter yes or no");
                System.out.println("Do you want to continue");
                yN = scan.next().toLowerCase();
            }
            if(yN.equals("no")){
                System.out.println("Thanks for using Cydeo calculator!");
                System.exit(0);
            }

        }






        /*
         Write a program that can calculate two numbers.
			1. Ask user to enter the first number
			2. Ask user to enter a math operator (+,-,/,*)
				(if user enters any invalid operator, repeat this step until user provides a valid operator)
			3. Ask user to enter the second number
			4. Display the result
			5. Ask user if they want to continue? (yes/no)
				if yes ==> repeat the entire steps
				if no ==> print "Thanks for using Cydeo calculator!"
				If user enters any invalid entry,  ask the user to re-enter until user provides a valid entry

         */
    }
}
