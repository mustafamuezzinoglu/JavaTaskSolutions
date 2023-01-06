package day25_CustomMethodOverloading;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[] arr = {21,2,3,14,5,6,-4};
        int[]reverse = reverse(arr);
        System.out.println(Arrays.toString(reverse));
    }
    public static int[] reverse(int[]array){
        int [] reverse = new int[array.length];
        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            reverse[j++]=array[i];
        }
          return reverse;
        }

}
/*
1. Create a method that can reverse an integer array

	2. Create a method that can reverse a double array

	3. Create a method that can reverse a char array

	4. Create a method that can reverse a String array
 */