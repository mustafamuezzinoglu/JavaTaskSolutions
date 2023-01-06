package day21_ForEachLoop;

import java.util.Arrays;

public class JavaAndPython {
    public static void main(String[] args) {

        String sentence = "I love java and python but java is much easier than python. every time i prefer java not python so java java and again java " ;

        String [] words = sentence.split(" ");
        System.out.println(Arrays.toString(words));

            int countJava =0;
        int countPython =0;
        for (String each : words) {
            System.out.print(each+ " ");
      if(  each.equalsIgnoreCase("Java")) {
          countJava++;
      }
            if(  each.equalsIgnoreCase("python")) {
                countPython++;
            }
        }
        System.out.println();
        System.out.println("java number is "+countJava);
        System.out.println("python number is "+countPython);







        /*
        Write a program that can return the number of appearances of “java” and “python” anywhere in the sentence.
				(similar to the task 97 in repl.it, but this time you MUST use arrays and for each loop)

         */
    }
}
