package com.company;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
	// write your code here
        printPartOfWord("Oondasta", 1, 4);
        printIfPalindrome("Den laKs skal nEd");
    }

    private static void printPartOfWord(String word, int start, int slut) {
        try {
            if (start < slut) {
                var res = word.substring(start, slut);
                System.out.println(res);
        }   else if (start > slut) {
                var res = word.substring(start, word.length());
                System.out.println(res);
            }
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println("One of the arguments exceeds the length of the word.");
        }
    }

    static boolean isPalindrome(String word) {

        int i = 0;
        int j = word.length() - 1;

        while (i < j) {

            if (word.charAt(i) != word.charAt(j))
                return false;
            i++;
            j--;

            }
        return true;
    }
    private static void printIfPalindrome(String word) {

        if (isPalindrome(word) || isPalindrome(word.toUpperCase())) {
            System.out.println(word);
        } else {
            System.out.println("no");
        }
    }
}
