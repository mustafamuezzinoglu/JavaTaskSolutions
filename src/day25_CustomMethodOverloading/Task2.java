package day25_CustomMethodOverloading;

public class Task2 {
    public static void main(String[] args) {
        int[] arr = {21,2,3,14,5,6};
        int max = max(arr);
        System.out.println(max);
    }
    public static int max(int[] array) {
        int max = array[0];
        for (int each : array) {
            if (each > max)
                max = each;
        }
        return max;
    }
    public static long max(long[] array) {
        long max = array[0];
        for (long each : array) {
            if (each > max)
                max = each;
        }
        return max;
    }
}
/*
1. create a method that can return the max number from an integer array

	2. create a method that can return the max number from double array

	3. create a method that can return the max number from long array

	4. create a method that can return the max number from short array

	5. create a method that can return the max number from float array

	6. create a method that can return the max number from byte array

 */