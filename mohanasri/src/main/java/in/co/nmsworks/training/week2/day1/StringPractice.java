package in.co.nmsworks.training.week2.day1;

public class StringPractice {
    public static void main(String[] args) {
        reverseString();
        checkPalindrome();
        printEvenLengthWords();
        removeLeadingZero();
        printSentences();
        countLetters();
        removeDuplicates();
        convertToTitleCase();
        findLongestWord();
        reverseStringManual();
        removeSpaces();
    }

    public static void removeSpaces() {
        String input = "The quick brown fox jumps over the lazy dog";
        String result = input.replace(" ", "");
        System.out.println("Original: " + input);
        System.out.println("Result : " + result);
    }

    public static void reverseStringManual() {
        String inputString = "India";
        StringBuilder reversed = new StringBuilder();
        for (int i = inputString.length() - 1; i >= 0; i--) {
            reversed.append(inputString.charAt(i));
        }
        System.out.println("Original: " + inputString);
        System.out.println("Reversed: " + reversed);
    }

    public static void findLongestWord() {
        String input = "The quick brown fox jumps over the lazy dog";
        String[] words = input.split(" ");
        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        System.out.println("Output: " + longestWord);
    }

    public static void convertToTitleCase() {
        String sentence = "the quick brown fox jumps over the lazy dog";
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            if (!word.isEmpty()) {
                char firstChar = Character.toUpperCase(word.charAt(0));
                String restWord = word.substring(1);
                result.append(firstChar).append(restWord).append(" ");
            }
        }
        System.out.println("Output: " + result.toString().trim());
    }

    public static void removeDuplicates() {
        String input = "aabbcc";
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            String chAsString = String.valueOf(ch);
            if (result.indexOf(chAsString) == -1) {
                result.append(ch);
            }
        }
        System.out.println("Output: " + result);
    }

    public static void countLetters() {
        String input = "Hello World";
        String lowerStr = input.toLowerCase();
        int vowels = 0;
        int consonants = 0;
        for (int i = 0; i < lowerStr.length(); i++) {
            char ch = lowerStr.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        System.out.println("Vowels: " + vowels + ", Consonants: " + consonants);
    }

    public static void removeLeadingZero() {
        String num = "0005640";
        int i = 0;
        for (i = 0; i < num.length(); i++) {
            if (num.charAt(i) != '0') { // Fixed: Changed literal 0 to character '0'
                break;
            }
        }
        System.out.println(num.substring(i));
    }

    public static void printSentences() {
        String paragraph = "The early morning sun cast a golden hue over the quiet village, where the scent of blooming jasmine mingled with the crisp, cool air. As the first light of day filtered through the canopy of ancient oak trees, the streets began to stir with the soft chatter of locals preparing for the day ahead. Children darted around with laughter, their voices a cheerful contrast to the serene landscape. In the heart of the village, the old bakery's doors creaked open, releasing the warm, inviting aroma of freshly baked bread, promising a comforting start to the day for everyone within reach.";
        String[] sentences = paragraph.split("(?<=\\.)\\s+"); // Fixed: Keeps trailing periods on sentences
        for (int i = 0; i < sentences.length; i++) {
            String cleanSentence = sentences[i];
            System.out.println(cleanSentence);
        }
    }

    public static void printEvenLengthWords() {
        String str = "This is a java language";
        String[] words = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() % 2 == 0) {
                System.out.println(words[i]);
            }
        }
    }

    public static void checkPalindrome() {
        String word = "dad";
        boolean isPalindrome = true; // Fixed: Added tracking flag
        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("Is a palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }

    public static void reverseString() {
        String originalStr = "India is my country";
        String[] words = originalStr.split(" ");
        StringBuilder rev = new StringBuilder();
        System.out.println("Original: " + originalStr);
        for (int i = words.length - 1; i >= 0; i--) {
            rev.append(words[i]);
            if (i > 0) {
                rev.append(" ");
            }
        }
        System.out.println("Reversed: " + rev);
    }
}
