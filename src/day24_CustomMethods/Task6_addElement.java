package day24_CustomMethods;

import java.util.Arrays;

public class Task6_addElement {

    public static void main(String[] args) {

        int[] arr ={1,2,3};
        int[] res= addElement(arr,4);
        System.out.println(Arrays.toString(res));
    }

    private static int[] addElement(int[]array,int element) {
        int[] res=new int[array.length+1];
        int i=0;
        for (int each : array) {
            res[i++]=each;
        }
        res[i]=element;
        return res;
    }


}

/*
    6. create a method named addElement that takes one integer array and one integer, the method can add the Integer number after the  last index of the integer array and returns the new array

    			Ex:
    				arr ={1,2,3};
    				num = 4;

    				addElement(arr, num) ==> {1,2,3,4}

*/