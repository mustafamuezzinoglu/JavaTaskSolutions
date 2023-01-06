package day14_String;

import java.util.Scanner;

public class AddTwoWords {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String word1 = scan.nextLine();
        System.out.println("Enter a word");
        String word2 = scan.next();
scan.close();

        if(word1.charAt(word1.length()-1)==word2.charAt(0)){
           word2= word2.substring(1) ;
        }else{

        }
        System.out.println(word1+word2);
    }
}
