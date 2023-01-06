package day15_ForLoop;

import java.util.Scanner;

public class SumOfAllNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scan.nextInt();
        int sum = 0;
        if(num<0){
            System.out.println( "Invalid number");
        }else{


        for (int i = 1; i <= num; i++) {
            sum += i;

        }
            System.out.println(sum);
        }



    }
}
