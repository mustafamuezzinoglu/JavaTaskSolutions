package day21_ForEachLoop;

import java.util.Arrays;

public class  SortingArrayInDescendingOrder {
    public static void main(String[] args) {

        int [] arr={1,2,3,4,5,6,7,8,9};
        int [] descend= new int[arr.length];

       // Arrays.sort(arr); if array is not ascending form

        for (int i = arr.length - 1, k=0; i >= 0; i--,k++) {
            descend[k]=arr[i];
        }

        System.out.println(Arrays.toString(descend));

        /*
        Write a program that sort the array of integer in descending order
         */
    }
}
