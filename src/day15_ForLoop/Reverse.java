package day15_ForLoop;

public class Reverse {
    public static void main(String[] args) {
        String str = "Wooden Spoon";
        String res = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            res += str.charAt(i);
        }
        System.out.println(res);


    }
}
