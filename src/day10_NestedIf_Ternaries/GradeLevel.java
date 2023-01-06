package day10_NestedIf_Ternaries;

public class GradeLevel {
    public static void main(String[] args) {
        byte grade = 20;
        String res = "";


        if (grade >= 1 && grade <= 18) {

            if (grade > 17) {
                res = "Grad School";
            } else if (grade > 13) {
                res = "College";
            } else if (grade > 9) {
                res = "High School";
            } else if (grade > 6) {
                res = "Middle School";
            } else {
                res = "Elementary School";
            }

        } else {
            res = "Invalid grade level given";

        }
        System.out.println(res);

    }
}
