package day17_While_DoWhileLoop;

import java.util.Scanner;

public class RoomReservation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int price = 0;

        System.out.println("Do you want to reserve a room? yes/no");
        String ans = scan.nextLine().toLowerCase();

        if (ans.equals("no")) {
            System.out.println("Have a nice day");
        }

        while (!(ans.equals("yes") || ans.equals("no"))) {
            System.err.println("Invalid answer, please enter yes or no");
            ans = scan.nextLine().toLowerCase();
        }
        if(ans.equals("yes")) {
            System.out.println("Which type of room you want to reserve? King Bed/ Queen Bed/ single Bed");
            String ans2 = scan.nextLine().toLowerCase();

            while (! ( ans2.equalsIgnoreCase("King Bed")
                    || ans2.equalsIgnoreCase("Queen Bed")
                    || ans2.equalsIgnoreCase("Single Bed"))) {
                System.err.println("Invalid entry");
                ans2 = scan.nextLine();
            }
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

            }
        scan.close();
            }
        }

