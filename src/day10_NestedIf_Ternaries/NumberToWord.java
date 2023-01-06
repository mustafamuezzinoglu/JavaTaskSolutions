package day11_SwitchScanner;

import jdk.swing.interop.SwingInterOpUtils;

public class NumberToWord {
    public static void main(String[] args) {
        /*int num = 10;
        String word;
        if (num>=0 && num<=9){
        if(num==0){
            word = "zero";
        }else if (num == 1) {
            word = "one";
        } else if (num == 2) {
            word = "two";
        } else if (num == 3) {
            word = "three";
        } else if (num == 4) {
            word = "four";
        } else if (num == 5) {
            word = "five";
        } else if (num == 6) {
            word = "six";
        } else if (num == 7) {
            word = "seven";
        } else if (num == 8) {
            word = "eight";
        } else {
            word = "nine";
        }
        }else {
            word = "invalid number";
        }
        System.out.println(word);
        System.out.println("------------------------------------" );
        */

        /*int num = 1;
       String word =  (num>=1 && num<=9)? (num == 0)? "zero" :(num==1)? "one" :(num==3)? "three":(num==3)?"four"
        :(num == 5)? "five" :(num==6)? "six" :(num==7)? "seven" :(num==8)? "eight": "nine" :"Invalid number";
        System.out.println(word);
*/
        int num = 5;

        switch (num){
            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            case 5:
                System.out.println("five");
                break;
            case 6:
                System.out.println("six");
                break;
            case 7:
                System.out.println("seven");
                break;
            case 8:
                System.out.println("eight");
                break;
            case 9:
                System.out.println("nine");
                break;

            default:
                System.out.println("Invalid");
                break;



        }






    }
}

