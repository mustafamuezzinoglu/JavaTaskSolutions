package day17_While_DoWhileLoop;

public class DivideTwoNumbers {
    public static void main(String[] args) {

        int n1 = 99;
        int n2 = 9;
        int n1dividen2=0;
        for (int i = n1; i>n1%n2; i -=n2) {
            n1dividen2++;

        }
        System.out.println("n1dividen2 = " + n1dividen2);
        System.out.println("-----------------------");
        int num1 = 50;
        int num2 = 9;
        int res=0;
        while( num1 >= num2 ){
            num1 -= num2;
            res++;
        }
        System.out.println("res = " + res);
        System.out.println("----------------");
        int a = 20;
        int b = 6;

        int count = 0;

        while (a >= b) {
            a -= b;
            count++;
        }

        System.out.println(count+" with a remainder of "+a);

    }
}
