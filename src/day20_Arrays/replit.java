package day20_Arrays;

import java.util.Scanner;

public class replit {
    public static void main(String[] args) {
//        verilen bir string cümlesindeki kelimeleri her birini içindeki harfleri değiştirmeden yazdırmak için önce aradkai boşlukları split ile array içine alıp sonra sonra ters çevirip sonra tek tek array dışına alıp sonra tekrar yeni bir string ile cümle kurup sonundaki boşluğu alarak doğru sonuca ulaşabiliyoruz

        // DO NOT TOUCH BELOW:
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        // TYPE YOUR CODE BELOW:
        String[] sentence1 = sentence.split(" ");

        String[] reversed = new String[sentence1.length];

        for (int i = sentence1.length - 1, k = 0; i >= 0; i--, k++) {
            reversed[k] = sentence1[i];
        }

        String res = "";
        for (String each : reversed) {
            res += each + " ";
        }

        res = res.substring(0, res.length() - 1);

        System.out.print(res);


    }
}

