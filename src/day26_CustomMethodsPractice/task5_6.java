package day26_CustomMethodsPractice;

public class task5_6 {
    public static void main(String[] args) {
       int num1= 17;
       int num2= 18;

     int result=   multiplication(num1,num2);
        System.out.println(result);

        System.out.println(multiplication(9.9,9.9));

    }

    public static int multiplication(int num1 ,int num2) {
        return num1*num2;
    }

    public static double multiplication(double num1 ,double num2) {
        return num1*num2;
    }

}
/*
2.5 Creata a method that can return the multiplication of two integers
			2.6 Creata a method that can return the multiplication of two decimals
 */