package day15_ForLoop;

public class Retive {
    public static void main(String[] args) {
        String word = "mn@#123Ab!";

        String letters = "",
                digits = "",
                specialChars = "";


        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (ch >= '0' && ch <= '9') {
                digits += ch;
            } else if (ch >= 'A' && ch <= 'Z') {
                letters += ch;
            } else if (ch >= 'a' && ch <= 'z') {
                letters += ch;
            } else {
               if(ch!=' '){
                   specialChars += ch;
               }
            }

        }
        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("specialChars = " + specialChars);
    }

}
