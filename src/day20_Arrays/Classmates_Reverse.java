package day20_Arrays;

public class Classmates_Reverse {
    public static void main(String[] args) {
        /*
        create string array, and store the names of your  class mates (10)
            reverse each students names and print them in separate lines
            	ex:
            		arr = {java, python, c#}

        		output:
        			avaJ
        			nohtyp
        			#c
         */



        String [] classMates ={"veli özerdem", "mustafa atik", "mehmet yalçın","mustafa müezzinoğlu", "mehmet akkaya"};
        String reverse="";

        for (int i = 0; i <classMates.length ; i++) {

            String temp =classMates[i];
            reverse="";
            for (int j = temp.length()-1 ; j >=0 ; j--) {
                reverse+= temp.charAt(j);

            }
            System.out.println(reverse);




        }








    }
}
