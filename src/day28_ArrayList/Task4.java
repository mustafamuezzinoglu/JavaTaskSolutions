package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        String [] arr1 = {"A", "B", "C"};
        String [] arr2 = {"D", "E", "F", "G"};
        ArrayList<String> array = new ArrayList<>();

        for (String each : arr1) {

            array.add(each);
        }
        for (String each : arr2) {
            array.add(each);
        }
            System.out.println(array);

        }

}
/*
4. write a program that can combine two String arrays into one arrayList
	            ex:
	                arr1 = {"A", "B", "C"};
	                arr2 = {"D", "E", "F", "G"};
	                list ==> {"A", "B", "C", "D", "E", "F", "G"}
 */