package day20_Arrays;

import java.util.Arrays;

public class MoveAllZeroToTheEnd {
    public static void main(String[] args) {

        int[] array = {10, 0, 5, 0, 1, 0};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int [] descend= new int[array.length];

        for (int i = array.length - 1,j=0; i >= 0; i--,j++) {
            descend[j]=array[i];
        }
        System.out.println(Arrays.toString(descend));

        /*
        write a program that can move all the zeros to the end of the array
        Ex:
            array = {10, 0, 5, 0, 1, 0};

            output:
                 {10, 5, 1, 0, 0, 0}
         */
    }
}
