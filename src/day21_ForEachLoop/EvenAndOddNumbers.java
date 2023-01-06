package day21_ForEachLoop;

public class EvenAndOddNumbers {
    public static void main(String[] args) {

        int[] numbers ={1,2,3,4,5,6,7,8,-1,0};
int countEven=0;
int countOdd=0;

        for (int each : numbers) {
            if (each != 0) {
                if (each % 2 == 0) {
                    countEven++;
                } else {
                    countOdd++;
                }
            }
        }
        System.out.println("countOdd = " + countOdd);
        System.out.println("countEven = " + countEven);





     /*
     Write a program that can count the even and odd number from an array of integers

			Note: MUST use for each loop
      */
    }
}
