package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class task7 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.addAll(Arrays.asList(8,1,8, 4, 4, 5, 6, 7, 7));

        ArrayList<Integer> result = new ArrayList<>();
        int count = 0;
        int first = 0;
        for (Integer each : numbers) {

            for (Integer each1 : numbers) {
                if (each == each1) {
                    count++;
                }
            }
            if (count>1) {
                first = each;
                break;
            }
        }
        System.out.println(first);
    }
}
/*
7. Write a program that can return the first duplicated element from an arrayList of Integer
Ex:
			list = [1,2,2,3,4,4,5,6,7,7];
			output:
				2
 */