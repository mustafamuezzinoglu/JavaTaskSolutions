package day11_SwithStatements;

public class Browser {
    public static void main(String[] args) {
        String browserName = "edge";

        switch (browserName) {
            case "chrome":
            case "firefox":
            case "opera":
            case "safari":
            case "edge":
                System.out.println("Browser name is selected = " + browserName); break;
            default:
                System.out.println("Invalid Browser");
        }

    }
}
