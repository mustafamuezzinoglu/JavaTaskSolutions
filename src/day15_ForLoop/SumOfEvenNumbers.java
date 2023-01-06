package day15_ForLoop;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 2; i <= 100; i += 2)
            sum+=i;
            System.out.print(sum);
    }
}

