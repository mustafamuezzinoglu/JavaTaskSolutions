package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class task6 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(50, 2, 3, 10, 5));
        int min = numbers.get(0);
        for (Integer each : numbers) {
            if (each < min) {
                min = each;
            }
        }
        System.out.println(min);
    }
}
/*

6. Write a program that can find the minimum number from an ArrayList of integers
		Ex:
			list = [1,2,3,4,5];
			output:
				1
 */