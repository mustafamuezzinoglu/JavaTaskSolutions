package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(10,2,3,4,5));



        System.out.println("f " +numbers);
        numbers.set(numbers.size()-1,0);
        System.out.println("s " + numbers);

    }
}
/*
1. write a program that can set the last element of the Integer arraylist to zero
	            ex:
	                list = [1,2,3,4,5];
	                output: [1,2,3,4,0];
 */