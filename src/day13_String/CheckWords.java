package day13_String;

import java.util.Scanner;

public class CheckWords {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a word");
       String word1 = scan.nextLine();
        System.out.println("Enter a word");
        String word2 = scan.nextLine();
        System.out.println("Enter a word");
        String word3 = scan.nextLine();
        scan.close();
        if(word1.length()==word2.length()&& word1.length()==word3.length()){
            System.out.println("All words are same lenght");
        }else if(word1.length()!=word2.length()&& word1.length()==word3.length()){
            System.out.println("Not same nor Different Lengths");
        }else if (word1.length()==word2.length()&& word1.length()!=word3.length()){
            System.out.println("Not same nor Different Lengths");
        }else if(word1.length()!=word2.length()&& word2.length()==word3.length()){
            System.out.println("Not same nor Different Lengths");
        }else{
            System.out.println("All different length");
        }





    }
}
