package day11_SwithStatements;

public class Http {
    public static void main(String[] args) {
        int code = 200;
        String res = "";
        switch (code) {
            case 200:
                res = "OK";
                break;
            case 201:
                res = "Created";
                break;

            case 202:
                res = "Accepted";
                break;

            default:
                res = "Invalid";
        }
        System.out.println(res);
    }
}