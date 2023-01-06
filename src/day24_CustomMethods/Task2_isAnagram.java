package day24_CustomMethods;

import java.util.Arrays;

public class Task2_isAnagram {
    public static void main(String[] args) {
        String str1="cba";
        String str2="abc";
        System.out.println(isAnagram(str1,str2));
    }

    private static boolean isAnagram(String str1,String str2) {
        char [] a  =str1.toCharArray();
        char [] b  =str2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
   return Arrays.equals(a,b);

        }


    }


/*
 2. create a method named isAnagram that passes two String parameters, the method returns true if the given two strings are anagram, otherwise returns false
    			Ex:
    				str1 = "cba"
    				str2 = "bac";
    				isAnagram(str1, str2) ====> true
*/