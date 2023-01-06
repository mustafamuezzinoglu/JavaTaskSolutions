package day26_CustomMethodsPractice;

public class Task1_2_3_4 {
    public static void main(String[] args) {

        int a = 5;
        int b = 6;
        int result = sumOfNumbers(a,b);
        System.out.println("a+b = "+ result);

        double c = 5.5;
        double d = 6.5;
        double result1 = sumOfNumbers(c,d);
        System.out.println("c+d = "+ result1);
        System.out.println("------------------------");
        System.out.println("10-6= "+ substractOfNumbers(10,6));
        System.out.println("10.5-6.5= "+ substractOfNumbers(10.5,6.5));




    }

    public static int sumOfNumbers(int num1 ,int num2) {
        return num1+num2;
    }

    public static double sumOfNumbers(double num1 ,double num2) {
        return num1+num2;
    }

    public static int substractOfNumbers(int num1 ,int num2) {
        return num1-num2;
    }

    public static double substractOfNumbers(double num1 ,double num2) {
        return num1-num2;
    }

}
/*
2.1 Create a method that can return the sum of two integers
			2.2 Create a method that can return the sum of two decimal numbers
				2.3 Create a method that can return the subtraction of two integers
			2.4 Create a method that can return the subtraction of two decimals
 */