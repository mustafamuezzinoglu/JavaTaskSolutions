package day12_Scanner;

import java.util.Scanner;

public class SpeedCheck {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int speedLimit = 55;
        System.out.println("What is your current speed?");
        int currentSpeed = scan.nextInt();
        scan.close();
        if (currentSpeed > speedLimit) {
            System.out.println("You're driving " + (currentSpeed - speedLimit) + " mph over the limit. Slow down!");
        } else {

        }


    }
}
