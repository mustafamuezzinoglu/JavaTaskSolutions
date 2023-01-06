package day26_CustomMethodsPractice;

public class Task8_9 {
    public static void main(String[] args) {
        int num1=15;
       boolean a= isEvenNumber(num1);
        System.out.println(a);
    }

    private static boolean isEvenNumber(int num) {
        return num%2==0;
    }
    private static boolean isOddNumber(int num) {
        return num%2!=0;
    }
}
/*
2.8 Create a method that can check if an integer is even number
			2.9 Create a method that can check if an integer is odd number

 */