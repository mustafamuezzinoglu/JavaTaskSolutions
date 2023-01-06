package day25_CustomMethodOverloading;

public class Task3 {
    public static void main(String[] args) {
        int[] arr = {21,2,3,14,5,6,-4};
        System.out.println(min(arr));
    }

    public static int min(int[]array){
        int min = array[0];
        for (int each : array) {
            if(each < min)
                min=each;
        }
        return min;

    }

}
/*
1. create a method that can return the min number from an integer array

	2. create a method that can return the min number from double array

	3. create a method that can return the min number from long array

	4. create a method that can return the min number from short array

	5. create a method that can return the min number from float array

	6. create a method that can return the min number from byte array
 */