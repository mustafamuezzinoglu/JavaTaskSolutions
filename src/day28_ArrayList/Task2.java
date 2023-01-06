package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1, 2, 3, 4, 5,6));
        int temp= numbers.get(0);
        System.out.println(numbers);
        numbers.set(0,numbers.size());
        numbers.set(numbers.size()-1,temp);


        System.out.println(numbers);


}


}

/*
 2. write a program that can swap the first and last elements of an integer arraylist
	            ex:
	                list = [1,2,3,4,5];
	                output: [5,2,3,4,1];
 */