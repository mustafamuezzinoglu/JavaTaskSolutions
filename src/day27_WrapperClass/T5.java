package day27_WrapperClass;


public class T5 {
    public static void main(String[] args) {
        String sentence = "JAVA java";
        System.out.println(equalsTotalNumberOfUpperLowerCase(sentence));
    }
    private static boolean equalsTotalNumberOfUpperLowerCase(String sentence) {

        int counterUpperCase = 0;
        int counterLowerCase = 0;

        char[] chars = sentence.toCharArray();

        boolean equal = false;
        for (char each : chars) {
            if (Character.isUpperCase(each)) {
                counterUpperCase++;
            } else if(Character.isLowerCase(each)) {
                counterLowerCase++;
            }

            equal = counterUpperCase == counterLowerCase;
        }

        return equal;
    }
}
/*
Write program that returns true if the total number of upper case characters are equal to total number of Lowercase characters of a string
		Ex:
			str = "JAVA java";

		output:
			true


 */