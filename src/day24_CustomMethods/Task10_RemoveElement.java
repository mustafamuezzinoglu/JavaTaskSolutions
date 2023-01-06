package day24_CustomMethods;

import java.util.Arrays;

public class Task10_RemoveElement {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50, 60};
        int index = 5;
        int[] remove=removeElement(array, index);
        System.out.println(Arrays.toString(remove));
    }

    private static int[] removeElement(int[] array, int element) {
        int[] arr = new int[array.length - 1];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]== array[element]) {
                continue;
            }   else{
                    arr[j++] = array[i];
                }

            }


        return arr;
    }

}
/*

	10. create a method named removeElement that passes one integer array and one integer, the method removes the integer index from the integer array and returns the new array
			Ex:
				array = {10, 20, 30, 40, 50, 60}
				index = 2


				removeElement(array, index) ==== {10, 20, 40, 50, 60}
 */