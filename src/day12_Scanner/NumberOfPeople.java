package day12_Scanner;

import java.util.Scanner;

public class NumberOfPeople {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        String res="";
        System.out.println("How many people do you live with?");
        int people= scan.nextInt();
        scan.close();
        if (people<3){
            res="Live with less than 3 people";
        }else if (people<=6){
     res="Live with 3 - 6 people";
        }else{
            res="Live with more than 6 people";
        }
          System.out.println(res);
    }
}
