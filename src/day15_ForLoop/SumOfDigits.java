package day15_ForLoop;

public class SumOfDigits {
    public static void main(String[] args) {
        String str = "A1B2C3";
        String digits = "";
        int sum = 0;

        for (int i = 0; i <str.length() ; i++) {
            char ch = str.charAt(i);
            if (ch >= '0' && ch <= '9') {
                digits += ch;
            }

        }

            for (int j = 0; j <= digits.length(); j++) {
                sum += j;
            }
            System.out.println(sum);

    }
}
