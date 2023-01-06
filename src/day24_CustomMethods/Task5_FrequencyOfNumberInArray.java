package day24_CustomMethods;

public class Task5_FrequencyOfNumberInArray {
    public static void main(String[] args) {
        int[] array ={1,1,1,1,1,2,2};
        int freq=frequencyOfNumberInarray(array,1);
        System.out.println(freq);
    }

    private static int frequencyOfNumberInarray(int[]array,int element) {
        int counter=0;
        for (int each : array) {
            if(each==element){
                counter++;
            }
        }
        return counter;
    }
}
/* 5. create method that accepts one integer array and one integer number and returns the frequency of the number

                    Ex:
                        int[] array ={1,1,1,1,1,2,2};

                        frequency(array, 1) ==> 5

*/