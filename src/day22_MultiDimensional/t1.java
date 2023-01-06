package day22_MultiDimensional;

import java.util.Arrays;

public class t1 {
    public static void main(String[] args) {
                        //   0          1
        int[][] array = {{1, 2, 3}, {4, 5, 6}}; //
                        //0  1  2    0  1  2
        int[][] reverse = new int[array.length][array[0].length];

        for (int i = array.length - 1, z = 0; i >= 0; i--, z++) {

            for (int j = array[i].length - 1, k = 0; j >= 0; j--, k++) {

                reverse[z][k] = array[i][j];

            }

        }

        System.out.println(Arrays.deepToString(reverse));

       /*
       Write a program that can reverse a two dimensional array (return new array)
		Ex:
			array = { {1,2,3}, {4,5,6}};

		output:
			reverse = { {6,5,4}, {3,2,1},};
        */
    }
}
