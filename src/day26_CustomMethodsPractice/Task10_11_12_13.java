package day26_CustomMethodsPractice;

public class Task10_11_12_13 {
    public static void main(String[] args) {
        int a = 50;
        int b = 100;
        int result = maximumNumber(a, b);
        System.out.println(result);
        System.out.println(maximumNumber(25.1, 25.2));

        System.out.println(minimumNumber(a, b));
        System.out.println(minimumNumber(25.5, 35.5));

    }
    //
    private static int maximumNumber(int num1, int num2) {

        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
  /*  int max=0;
        if(num1>num2)
   max=num1;*/

    }

    private static double maximumNumber(double num1, double num2) {

        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
  /*  double max=0;
        if(num1>num2)
   max=num1;*/

    }


    public static int minimumNumber(int num1, int num2) {

        if (num1 < num2) {
            return num1;
        } else {
            return num2;
        }
  /*  int max=0;
        if(num1<num2)
   max=num1;*/

    }
    private static double minimumNumber(double num1, double num2) {

        if (num1 < num2) {
            return num1;
        } else {
            return num2;
        }
  /*  double max=0;
        if(num1<num2)
   max=num1;*/

    }


}
/*
2.10 Create a method that can return the maximum number between two integers
			2.11 Create a method that can return the maximum number between two decimal numbers

 */