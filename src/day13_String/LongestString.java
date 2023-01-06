package day13_String;

import java.util.Scanner;

public class LongestString {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Enter a word");
        String word1=scan.next();

        System.out.println("Enter a word");
        String word2=scan.next();

        scan.close();


    if(word1.length()>word2.length()){
        System.out.println( word1+ " is the longest string");
    }else {
        System.out.println( word2+ " is the longest string");
    }



    }
}
