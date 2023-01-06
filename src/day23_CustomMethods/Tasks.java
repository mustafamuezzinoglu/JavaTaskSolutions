package day23_CustomMethods;

public class Tasks {
    public static void main(String[] args) {

        oddNumbers();
        System.out.println("1");
        evenNumbers();
        System.out.println("2");
        System.out.println(isEligible(18));
        System.out.println("3");
        isEligibleToVote(15, "USA");
        System.out.println("4");
        grade(81);
        System.out.println("5");
        int [] num={1,2,3};
        eachElement(num);
        System.out.println("6");
    }


    //1.   create a method that can print odd numbers between 1~100 in a same line saperated by space
    public static void oddNumbers() {
        for (int i = 1; i <= 100; i += 2) {

            System.out.print(i + " ");

        }  System.out.println();
    }

    //2. create a method that can print even numbers between 1~100 in a same line saperated by space
    public static void evenNumbers() {
        for (int i = 2; i <= 100; i += 2) {

            System.out.print(i + " ");
        }
    }

    //3. create a method that can check if a person is eligible to buy alcohol
    public static boolean isEligible(int age) {
        if (age > 21) {
            return true;
        }
        return false;

    }

    /*4. create a method that can check if a person is eligible to vote
        Ex:    eligibleToVote(19, "USA");
        output:    You are not eligible to vote!*/
    public static void isEligibleToVote(int age, String cnt) {
        if (age >= 18 && cnt.equalsIgnoreCase("USA")) {
            System.out.println("You are eligible to vote!");
        } else {
            System.out.println("You are not eligible to vote!");
        }
    }

    //5. create a method that can calculate the grade of the student based on the score
    public static void grade(int score) {
        char grade = 'z';
        if (score > 90 && score <= 100) {
            System.out.println('A');
        } else if (score > 80 && score <= 90) {
            grade = 'B';
        } else if (score > 70 && score <= 80) {
            grade = 'C';
        } else if (score > 60 && score <= 70) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println(grade);

    }
//14. create a method named printEachElement that can print each elements of an integer array

    private static void eachElement(int [] num) {
        for(int each : num){
       System.out.print(each+" ");
    }System.out.println();
}






}

/*	7. create a method that can calculate the area of a square
	9. create a method that can convert dollar to euro
	10. create a method that can can convert dollar to lira
	11. create a method that can convert kg to lb
	12. create a method that can if the given integer is positive, negative or zero
	13. create a method named printEachChar that can print each characters of a string
	14. create a method named printEachElement that can print each elements of an integer array
	15. create a method named calculator that passes three arguments (num1, num2, mathOperator), prints the calculation result
	16.  write a method that can print out the full name of a person in regular format
            ex:
               fullName("cYdEo", "SCHOOL");
               output:
                    "Cydeo School"
    17. create a method that can check if two strings are anagram
    		ex:
    			anagram("silent", "listen")
			output:
				silent and listen are anagram
 */
