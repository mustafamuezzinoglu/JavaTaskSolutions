package day24_CustomMethods;

public class Task9_Contain {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7};
        int num=1;
        boolean contain=contains(arr,num);
        System.out.println(contain);

    }

    private static boolean contains(int[]array,int element) {
        for (int each : array) {
            if(element==each){
                return true;
            }
        }return false;
    }
}

/*
	9. Create a method named contains that passes one integer array and one integer parameters, the method returns true if the given integer is contained in the given array, otherwise returns false

				Ex:
					arr = {1,2,3,4,5,6,7};
					num = 10;

					contains(arr, num) ===> false
*/