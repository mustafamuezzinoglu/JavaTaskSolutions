package day09_IfStatements;

public class AgeGroups {
    public static void main(String[] args) {
        int age = 2;
        String result = " ";

        if (age <= 1 && age >= 2) {
            result = "infant";
        } else if (age >= 3 && age >= 5) {
            result = "Toddler";
        }else{
            result = "Old Senior Citizen";
        }
        System.out.println(result);


    }
}
