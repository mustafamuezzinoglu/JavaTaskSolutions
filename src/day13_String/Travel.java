package day13_String;

import java.util.Scanner;

public class Travel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Have u got a valid passport?");
        String yesOrNo = scan.next().toLowerCase();

        if (yesOrNo.equals("yes")) {
            int cost = 1000;
            scan.nextLine();
            System.out.println("which country do yu travel to?");
            String countryName = scan.nextLine();
            System.out.println("How many bags will u take with?");
            byte numberOfBags = scan.nextByte();
            cost += numberOfBags * 50;
            System.out.println("How many people will you travel with?");
            short numberOfTravelWith = scan.nextShort();
            if (numberOfTravelWith < 3) {
                cost -= numberOfTravelWith * 100;
            } else {
                cost -= 300;
            }
            scan.nextLine();
            System.out.println("Enter the name of the people they will travel with in one line, separating each name with a comma");
            String peopleYouTravelWith = scan.nextLine();

            System.out.println("Your ticket is booked to " + countryName + ". We have charged extra for the "
                    + numberOfBags + " bags but you are traveling with " + peopleYouTravelWith
                    + " so we are giving a discount. Your total cost is $" + cost);
        } else {
            int cost = 200;
            System.out.println("When did your passport expire?");
            int expiredYear = scan.nextInt();
            cost += 75 * (2023 - expiredYear);
            scan.nextLine();
            System.out.println("Which country are you traveling too?");
            String country = scan.nextLine();
            System.out.println("Will you be traveling in the next year (yes or no)?");
            String answer = scan.next().toLowerCase();

            if (answer.equals("yes")) {
                cost += 100;
            } else {
                cost -= 50;
            }

            System.out.println("Looks like your password has been expired for " + (2021 - expiredYear)
                    + "years, but not to worry we will get it ready for you to travel to " + country
                    + ". Your total cost has come out to $" + cost);

        }
        scan.close();
    }
}
