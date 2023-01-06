package day09_IfStatements;

public class CampusTime {
    public static void main(String[] args) {
        int time = 9;
        String result = "";
        if (time >= 8 && time <= 23) {
            result = "Campus is OPEN";
        } else {
            result = "Campus is CLOSED";
        }
        System.out.println(result);

    }
}
