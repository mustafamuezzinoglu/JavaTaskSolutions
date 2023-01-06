package day20_Arrays;

public class Classmates_Initials {
    public static void main(String[] args) {
        /*
        create an array named classmates, and store 10 of your classmates' full names
            print the initials of each classmates in separate lines
         */

        String [] classMates ={"veli özerdem", "mustafa atik", "mehmet yalçın","mustafa müezzinoğlu", "mehmet akkaya"};


        for (int i = 0; i <classMates.length ; i++) {

            System.out.println(classMates[i].charAt(0)+" "+classMates[i].charAt(classMates[i].indexOf(" ")+1));
        }






    }
}
