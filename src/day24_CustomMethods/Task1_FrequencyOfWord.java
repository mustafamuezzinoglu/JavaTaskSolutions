package day24_CustomMethods;

public class Task1_FrequencyOfWord {
    public static void main(String[] args) {

        frequencyOfWord("Java java java python python", "java");
        frequencyOfWord("hELLO WORLD HELLO EVERY", "hello");
    }

    private static String frequencyOfWord(String sentence, String word) {
        int countWord = 0;
        for (int i = 0; i < sentence.length() - word.length(); i++) {
            String str = sentence.substring(i, i + word.length());

            if (str.equalsIgnoreCase(word))
                countWord++;

        }
        System.out.println(countWord);
        return sentence;
    }


}
/*
1.  create a method named frequencyOfWord that passes two parameters: string sentence and String word, then returns the frequency of word from the sentence
                Ex:
                    sentence = "Java java java python python"
                    word = "java";
                    frequencyOfWord(sentence, word) ==>  3
 */