package day14_String;

public class EmailTask2 {
    public static void main(String[] args) {
        String email = "mike_tyson@gmail.com";

        String firstName = email.substring(0, email.indexOf("_"));
        String lastName = email.substring(email.indexOf("_") + 1, email.indexOf("@"));
        String domain = email.substring(email.indexOf("@")+1, email.indexOf("."));
        firstName= (firstName.substring(0,1).toUpperCase()+firstName.substring(1).toLowerCase());
        lastName= (lastName.substring(0,1).toUpperCase()+lastName.substring(1).toLowerCase());
        System.out.println("firstName = " + firstName);
        System.out.println("lastName = " + lastName);
        System.out.println("domain = " + domain);

    }
}
