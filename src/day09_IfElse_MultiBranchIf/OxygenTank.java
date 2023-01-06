package day09_IfStatements;

public class OxygenTank {
    public static void main(String[] args) {
        int number = 85;
        String above = "";

        if (number >= 90) {
            above = "Your tank is full";
        } else if (number >= 80) {
            above = "Still okay";
        } else if (number >= 70) {
            above = "Don't go too far";
        } else if (number >= 60) {
            above = "Start to head back";
        } else {
            above = "Your tank is fullBe carefull now you at 50%";
        }
        System.out.println("Above " + number + " -  " + above);


    }
}
