package day09_IfStatements;

public class CharacterIdentity {
    public static void main(String[] args) {
        char ch ='c';
        String result;

        if(ch>='0' && ch<='9'){
            result = "Digit Number";
        }else if(ch>='A' && ch<='Z' || ch>='a' && ch<='z' ){
            result = "Alphabetic Character";
        }else{
            result = "Special Character";
        }

        System.out.println(result);


    }
}
