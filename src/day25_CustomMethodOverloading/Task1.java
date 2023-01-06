package day25_CustomMethodOverloading;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {5, 6, 7, 8};
       // int[] arr3 = merge(arr1, arr2);
        System.out.println(Arrays.toString(merge(arr1,arr2)));

    }


    public static int[] merge(int[] array1, int[] array2) {
        int i = 0;
        int[] result = new int[array1.length + array2.length];
        for (int each : array1) {
            result[i++] = each;
        }
        for (int each : array2) {
            result[i++] = each;
        }
    return result;
    }

}
/*
1. create a method that can merge two integer arrays.

	2. create a method that can merge two double arrays.

	3. create a method that can merge two char arrays.

	4. create a method that can merge two String arrays.

 */