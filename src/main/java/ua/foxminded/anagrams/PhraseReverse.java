package ua.foxminded.anagrams;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class PhraseReverse {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input your phrase here, please: ");
        String inputtedText = in.nextLine();
        in.close();
        System.out.println(phraseReverse(inputtedText));
    }

    public static String phraseReverse(String inputtedText) {

        if (StringUtils.isBlank(inputtedText)) {
            System.out.println("NO ENTERED TEXT");
            return "";
        }

        String[] inputWords = inputtedText.split(" ");
        String[] outputWords = new String[inputWords.length];
        int numberOfWord = 0;

        for (String inputWord : inputWords) {

            StringBuilder invertedWord = new StringBuilder();
            char[] arrayOfSymbols = inputWord.toCharArray();
            int wordLength = inputWord.length();

            for (int i = wordLength - 1; i >= 0; i--) {
                if (Character.isLetter(arrayOfSymbols[i])) {
                    invertedWord.append(arrayOfSymbols[i]);
                }
            }

            for (int i = 0; i < wordLength; i++) {
                if (!Character.isLetter(arrayOfSymbols[i])) {
                    invertedWord.insert(i, arrayOfSymbols[i]);
                }
            }

            outputWords[numberOfWord] = String.valueOf(invertedWord);
            numberOfWord++;
        }

        return String.join(" ", outputWords);
    }

}