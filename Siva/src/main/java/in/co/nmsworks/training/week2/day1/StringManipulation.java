package in.co.nmsworks.training.week2.day1;

public class StringManipulation {

    public static void main(String[] args) {

        printReverseWordsInSentence("India is my country");
        checkPalindromeOrNot();
        printEvenLengthOfStrings();
        removeLeadingZeros();
        printEachSentencesInTheNewLine();
        printCountOfVowelsAndConsonants();
        removeDuplicatesInTheString();
        convertEveryWordOfFirstCharacterIsUpper();
        printLongestWordInTheSentence();
        reverseString();
        removeSpacesInString();
    }

    private static void removeSpacesInString() {
        String text = "The quick brown fox jumps over the lazy dog";
        String answer = text.replace(" ","");
        System.out.println(answer);
    }

    private static void reverseString() {
        String text = "Sivakumar";
        String answer = "";
        for (char ch : text.toCharArray()) {
            answer = ch + answer;
        }
        System.out.println("Reverse String Output :: "+answer);
    }

    private static void printLongestWordInTheSentence() {
        String text = "he quick brown fox jumps over the lazy dog";
        String[] textArray = text.split(" ");
        String answer = "";
        for (String s : textArray) {
            if(answer.length() <= s.length())
                answer = s;
        }
        System.out.println("Longest Sentence :: "+answer);
    }

    private static void convertEveryWordOfFirstCharacterIsUpper() {
        String text = "the quick brown fox jumps over the lazy dog";
        String[] textArray = text.split(" ");
        for (int i = 0; i < textArray.length; i++) {
            String first = "", second = "";
            if (!textArray[i].isEmpty()) {
                first = textArray[i].substring(0,1).toUpperCase();
            }
            if (textArray[i].length() >= 1) {
                second = textArray[i].substring(1).toLowerCase();
            }
            textArray[i] = first + second;
        }
        for (String s : textArray) {
            System.out.print(s+" ");
        }
    }

    private static void removeDuplicatesInTheString() {
        String text = "aabbcc";
        String answer = "";
        for (char ch : text.toCharArray()) {
            String current = ""+ch;
            if (!answer.contains(current))
                answer += ch;
        }
        System.out.println("Output :: "+answer);
    }

    private static void printCountOfVowelsAndConsonants() {
        String text = "Hello World";
        int vowelsCount = 0, consCount = 0;
        for (char ch : text.toCharArray()) {
            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
                if (isVowel(ch))
                    vowelsCount++;
                else
                    consCount++;
            }

        }
        System.out.println("Vowels Count :: "+vowelsCount);
        System.out.println("Consonants Count :: "+consCount);
    }

    private static boolean isVowel(char ch) {
        if (ch >='a' && ch <= 'z')
            ch -= 32;
        return ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }

    private static void printEachSentencesInTheNewLine() {
        String text = "The early morning sun cast a golden hue over the quiet village, where the scent of blooming jasmine mingled with the crisp, cool air. As the first light of day filtered through the canopy of ancient oak trees, the streets began to stir with the soft chatter of locals preparing for the day ahead. Children darted around with laughter, their voices a cheerful contrast to the serene landscape. In the heart of the village, the old bakery's doors creaked open, releasing the warm, inviting aroma of freshly baked bread, promising a comforting start to the day for everyone within reach.";
        String[] textArray = text.split("\\.");
        for (String s : textArray) {
            System.out.println(s);
        }
    }

    private static void removeLeadingZeros() {
        String number = "0005640";
        int i = 0;
        while (i < number.length() && number.charAt(i) == '0'){
            i++;
        }
        if (i == number.length()) {
            System.out.println("String is Empty ,after removing Leading Zeros");
            return;
        }
        System.out.println(number.substring(i));
    }

    private static void printEvenLengthOfStrings() {
        String text = "This is a java language";
        String[] textArray = text.split(" ");
        for (String s : textArray) {
            if (s.length() %2 == 0)
                System.out.println(s);
        }
    }

    private static void checkPalindromeOrNot() {
        String text = "malayalam";
        int st = 0, end = text.length()-1;
        while (st <= end && text.charAt(st) == text.charAt(end)) {
            st += 1;
            end -= 1;
        }
        if (st > end)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }

    private static void printReverseWordsInSentence(String text) {
        String[] textArray = text.split(" ");
        for (int i = textArray.length - 1; i >= 0; i--) {
            System.out.print(textArray[i]+" ");
        }
    }

}
