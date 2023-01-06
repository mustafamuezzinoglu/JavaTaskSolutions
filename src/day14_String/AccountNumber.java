package day14_String;

import java.util.Scanner;

public class AccountNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an account number");
        String account = scan.next();
        scan.close();
        String res="Invalid";
        if (account.startsWith("2")) {
            if (account.length() == 7) {
                res="valid";
            }
        } else if (account.startsWith("5")) {
            if (account.length() == 10) {
                res="valid";
            }
        }
            System.out.println(res);
        }
    }
/*
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an account number");
        String account = scan.next();
        scan.close();
        String result = "Invalid";
        if(account.charAt(0) == '2'){
            if(account.length() == 7){
                result = "Valid";
            }
        }else if(account.charAt(0) == '5'){
            if(account.length() == 10){
                result = "Valid";
            }
        }
        System.out.println(result);
    }

}
*/