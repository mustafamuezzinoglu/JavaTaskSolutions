package day26_CustomMethodsPractice;

public class Task14_15_16_17 {
    public static void main(String[] args) {

        System.out.println("square 5 = " +square(5));
        System.out.println("cube 5= "+ cube(5));
    }

    public static int square(int number) {
        return number*number;
    }

    public static double square(double number) {
        return number*number;
    }

    public static int cube(int number) {
        return number*number*number;
    }

    public static double cube(double number) {
        return number*number*number;

    }


}
/*
            2.14 Create a method that can return the square of an integer
					Ex: square(2) ==> 4
			2.15 Create a method that can return the square of a double
			2.16 Create a method that can return the cube of an integer
			2.17 Create a method that can return the cube of a double

 */