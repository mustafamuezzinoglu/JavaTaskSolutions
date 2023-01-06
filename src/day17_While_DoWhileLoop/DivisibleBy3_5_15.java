package day17_While_DoWhileLoop;

public class DivisibleBy3_5_15 {
    public static void main(String[] args) {
        String divisibleBy15="",
                divisibleBy5="",
                divisibleBy3="";
        int n=100;
        for (int i = 1; i <=n ; i++) {

            if(i%3==0 && i%5==0 && i%15==0){
                divisibleBy15+=i+" ";
            }else if (i%5==0){
                divisibleBy5+=i+" ";
            }else if (i%3==0){
                divisibleBy3+=i+" ";
            }else{

            }

        }
        System.out.println("divisibleBy15 = " + divisibleBy15);
        System.out.println("divisibleBy5 = " + divisibleBy5);
        System.out.println("divisibleBy3 = " + divisibleBy3);
    }
}
