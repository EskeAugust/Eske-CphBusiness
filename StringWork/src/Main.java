import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    private static String[][] text = new String[12][1];

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("src/Data.txt");
        Scanner scan = new Scanner(file);
        int i = 0;

        while (scan.hasNextLine()) {
            text[i] = scan.nextLine().split(" ");
            //System.out.println(text[i]);
            i++;
        }

        // Print alle ord der starter med det der sendes som argument
        //printWordsStartingWith("Ø");

        // print alle ord der har præcis det antal bogstaver som sendes som argument
        //printWordsOfLength(3);

        // Print alle ord som har en dobbelt-konsonant
        printWordsWithDoubleConsonant();

        printLongestSentence();
    }

    private static void printLongestSentence() throws FileNotFoundException {
        String longestSentence = "";
        String currentSentence = "";
        String nextSentence = "";
        File file = new File("src/Data.txt");
        Scanner scan = new Scanner(file);

        while (scan.hasNextLine()) {
            String[] splitArray = scan.nextLine().split("\\. ");

            for (int j = 0; j < splitArray.length - 1; j++) {
                if (splitArray[j].length() > splitArray[j + 1].length()) {
                    longestSentence = splitArray[j];
                    System.out.println(longestSentence);
                }
            }

        }
    }


    private static void printWordsWithDoubleConsonant() {

        for (int i = 0; i < text.length; i++) {

            for (String s : text[i]) {
                for (int j = 0; j < s.length() - 1; j++) {
                    if (s.charAt(j) == s.charAt(j + 1) && !Character.isDigit(s.charAt(j))   ) {
                        System.out.println(s);
                    }
                }
            }
        }
    }
}









/*
    private static void printWordsOfLength(int l){
        boolean wordIsValid = true;

        for (int i = 0; i < text.length; i++) {
            for (String s:text[i]) {
                if (s.length() == l){
                    if(s.contains(",") || s.contains(".")){
                        wordIsValid = false;
                    }
                    if(wordIsValid) {
                        System.out.println(s);
                    }
                }
            }
        }
    }
    private static void printWordsStartingWith(String pattern) {

        for (int i = 0; i < text.length; i++) {
            for (String s:text[i]) {
                if(s.startsWith(pattern)||s.startsWith(pattern.toLowerCase())){
                    System.out.println(s);
                }
            }
        }
    }
}
 */
