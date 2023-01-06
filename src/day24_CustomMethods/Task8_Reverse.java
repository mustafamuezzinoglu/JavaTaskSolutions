package day24_CustomMethods;

import java.util.Arrays;

public class Task8_Reverse {
    public static void main(String[] args) {
        int [] arr = {10, 20, 30, 40};
        System.out.println(Arrays.toString(reverse(arr)));


    }

    private static int[] reverse(int[]array) {
        int [] result=new int[array.length];
        int a=0;
        for (int i = array.length - 1; i >= 0; i--) {
            result[a++]=array[i];
        }
        return result;
    }


}

/*
	8. Create method named reverse that passes an integer array parameter, the method can return the reversed array

				Ex:
					arr = {10, 20, 30, 40};

					reverse(arr) ==> {40, 30, 20, 10}
*/