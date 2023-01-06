package day24_CustomMethods;

public class Task4_isPalindrome {
    public static void main(String[] args) {

        String word = "ata";

        System.out.println(isPalindrome(word));

    }
    private static boolean isPalindrome(String word) {

        String result = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            result += word.charAt(i);
      if(result.equalsIgnoreCase(word)){
          return true;
      }

        }
        return false;
    }


}
/*


	4. By using the reverse method above to create another method named isPalindrome  that passes a String parameter, the method returns true if the string is palindrome, otherwise returns false

				Ex:
					str = "Level"

					isPalindrome(str) ===> true

*/


