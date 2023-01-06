package day18_NestedLoop;

import java.util.Scanner;

public class RoomReservation {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int total = 0;

        while(true) {
            System.out.println("Which room would you like to select?");
            System.out.println("\t\tKing Bed == $120");
            System.out.println("\t\tQueen Bed == $100");
            System.out.println("\t\tSingle Bed == $80");

            String word = scan.nextLine().toLowerCase();

            while (!(word.equals("king bed") || word.equals("queen bed") || word.equals("single bed"))) {
                System.out.println("Invalid Entry, Please Re-Enter");
                word = scan.nextLine().toLowerCase();
            } // to make sure user selected either the king bed, or queen bed or single bed

            total += (word.equals("king bed")) ? 120 : (word.equals("queen bed")) ? 100 : 80;

            System.out.println("Would you like to select another room?");
            String a = scan.nextLine().toLowerCase();

            while( !( a.equals("yes") || a.equals("no") ) ){ // while the answer is not valid answer
                System.out.println("Invalid Entry, please re-enter");
                System.out.println("Would you like to select another room?");
                a = scan.nextLine().toLowerCase();
            } // it stops if the answer is either ye or no

            if(a.equals("no")){
                System.out.println("Your total price is: $"+total);
                break;
            }

        }

        scan.close();





        /*Scanner scan = new Scanner(System.in);
        int price = 0;

        System.out.println("Which bedroom do you want to reserve? King Bed/ Queen Bed/ single Bed");
        String ans2 = scan.nextLine().toLowerCase();

        while (! ( ans2.equalsIgnoreCase("King Bed")
                || ans2.equalsIgnoreCase("Queen Bed")
                || ans2.equalsIgnoreCase("Single Bed"))) {
            System.err.println("Invalid entry. Please write room type");
            ans2 = scan.nextLine();

            System.out.println("How many nights are you staying");
            int nightNumber = scan.nextInt();

            System.out.println("Would you like to reserve another room?");
            String yN = scan.nextLine().toLowerCase();

            while (!(yN.equals("yes") || yN.equals("no"))) {
                System.err.println("Invalid answer, please enter yes or no");
                yN = scan.nextLine().toLowerCase();

            if (yN.equals("yes") ){
                    System.out.println("Which bedroom do you want to reserve? King Bed/ Queen Bed/ single Bed");
                    ans2 = scan.nextLine().toLowerCase();

                    while (!(ans2.equalsIgnoreCase("King Bed")
                            || ans2.equalsIgnoreCase("Queen Bed")
                            || ans2.equalsIgnoreCase("Single Bed"))) {
                        System.err.println("Invalid entry. Please write room type");
                        ans2 = scan.nextLine();

                        System.out.println("How many nights are you staying");
                        nightNumber = scan.nextInt();

                        System.out.println("Would you like to reserve another room?");
                        yN = scan.nextLine().toLowerCase();
                    }
                } else {
                    if (ans2.equalsIgnoreCase("King Bed")) {
                        price += 120;
                        System.out.println(ans2 + "'s total price is: $" + price);
                    }else if (ans2.equals("Queen Bed")) {
                        price += 100;
                        System.out.println(ans2 + "'s total price is: $" + price);
                    } else {
                        price += 80;
                        System.out.println(ans2 + "'s total price is: $" + price);
                    }
                    int totalPrice=nightNumber*price;

                    System.out.println(totalPrice);
                }

                }

            }
*/
    }
}
