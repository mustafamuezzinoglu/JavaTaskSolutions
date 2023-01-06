package day09_IfStatements;

public class Calculator {
    public static void main(String[] args) {
        double n1 = 17.5,
                n2 = 7.8;
        char mathOperator = ':';
        double result =0;

         if (mathOperator == '+'){
             result = n1+n2;
         }else if(mathOperator == '-') {
             result = n1 - n2;
         }  else if(mathOperator == '*') {
             result = n1 * n2;
         }else if(mathOperator == '/') {
             result = n1 / n2;
         }  else{
             System.out.println( "invalid operator");
         }
        System.out.println(result);

















    }
}
