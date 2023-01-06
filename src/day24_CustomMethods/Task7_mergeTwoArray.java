package day24_CustomMethods;

import java.util.Arrays;

public class Task7_mergeTwoArray {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6};
        System.out.println(Arrays.toString(merge(arr1,arr2)));
    }

    private static int[] merge(int[]arr1,int[]arr2) {
        int [] res=new int[arr1.length+arr2.length];
        int i=0;
        for (int each1 : arr1) {
            res[i++]=each1;
        }
        for (int each2 : arr2) {
            res[i++]=each2;
        }
        return res;


    }
}

/*
	7. Create a method named merge that passes two integer array parameters, the method can merge two integer arrays and return the new array

				Ex:
					arr1 = {1,2,3}
					arr2 = {4,5,6}

					merge(arr1, arr2) ====> {1,2,3,4,5,6}

*/