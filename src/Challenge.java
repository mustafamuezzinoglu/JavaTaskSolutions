public class Challenge {
    public static void main(String[] args) {
//                    012345678910
        String str = "116 of 462 results for";
//        str.substring(8,11); not dynamic
//        to get 462 we need to use substring so it must starts 4 and ends 2
        str = str.substring(str.indexOf("of ")+3, str.indexOf(" r"));
        System.out.println("str = " + str);
        int strAsInteger = Integer.parseInt(str); //we use parseInt to return from string to integer
        System.out.println(strAsInteger + 1); //to get plus 1 --> 463
        System.out.println("srtrAsInteger= " + (strAsInteger + 1));

    }

}
