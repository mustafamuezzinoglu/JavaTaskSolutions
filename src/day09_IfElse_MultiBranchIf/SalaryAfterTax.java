package day09_IfElse_MultiBranchIf;

public class SalaryAfterTax {
    public static void main(String[] args) {
        double salary = 25000;
        boolean isMarried= true;
        double taxRate= 0;

        if (salary >= 130000) {//false : salary<130000;
            taxRate = 0.35;
        }else if (salary >=100000 ){ //false : salary <100000
         taxRate=0.30;
        }else if (salary>=80000) { //false : salary <80000
            taxRate = 0.25;
        }else {
            taxRate = 0.2;
        }
         if (isMarried) { //if the person is married
             taxRate -= 0.05; //substracting 5% from the orijinal tax rate
         }

        double salaryAfterTax = salary - (salary * taxRate);
         System.out.println(salaryAfterTax);

    }
}
