package in.co.nmsworks.training.week2.day1;

public class StringManipulation {
    public static void main(String[] args){
        reverseWords("India is my country");
        checkPalindrome("dad");
        printEvenWords("This is a Java language");
        removeLeadingZeroes("0005640");
        printNewLine("The early morning sun cast a golden hue over the quiet village, where the scent of blooming jasmine mingled with the crisp, cool air. As the first light of day filtered through the canopy of ancient oak trees, the streets began to stir with the soft chatter of locals preparing for the day ahead. Children darted around with laughter, their voices a cheerful contrast to the serene landscape. In the heart of the village, the old bakery's doors creaked open, releasing the warm, inviting aroma of freshly baked bread, promising a comforting start to the day for everyone within reach.");
        countVowelsConsonants("Hello world");
        removeDuplicates("aabbcc");
        convertToTitleCase("The quick brown fox jumps over the lazy dog");
        findLongestWord("The quick brown fox jumps over the lazy dog");
        reverseString("word");
        removeSpaces("Hello world !");
    }
    // 1. Reverse words in a string
    public static void reverseWords(String str){
        String[] splitStr = str.split(" ");
        for (int i = splitStr.length - 1; i >= 0; i--){
            System.out.print(splitStr[i] + " ");
        }
        System.out.println(" ");

    }

    // 2. Check if a word is a palindrome
    public static void checkPalindrome(String word){
        int l = 0;
        int r = word.length()-1;
        while (l<r){
            if (word.charAt(l) != word.charAt(r)){
                System.out.println("Not a palindrome");
            }
            l++;
            r--;
        }
        System.out.println("Palindrome");
    }

    // 3. Print words with even length
    public static void printEvenWords(String words){
        String[] splitWords = words.split(" ");
        for (String splitWord : splitWords) {
            int n = splitWord.length();
            if (n % 2 == 0){
                System.out.println(splitWord);
            }

        }
    }

    // 4. Remove leading zeros from number
    public static void removeLeadingZeroes(String num){
        String newNum = "";
        boolean leading = true;
        for (int i = 0; i <num.length(); i++){
            char ch = num.charAt(i);
            if (ch == '0' && leading)
                newNum += "";
            else{
                newNum += ch;
                leading = false;
            }

        }
        System.out.println("Without leasing zeroes: " + newNum);
    }

    // 5. Print each sentence as newline
    public static void printNewLine(String paragraph){
        String[] splitPara = paragraph.split("\\. ");
        for (String s : splitPara) {
            System.out.println(s);

        }

    }

    // 6. Count number of vowels and consonants
    public static void countVowelsConsonants(String sentence){
        int vowels = 0;
        int consonants = 0;
        int spaceCount = 0;
        for (int i = 0; i < sentence.length(); i++){
            if (sentence.charAt(i) == 'A' || sentence.charAt(i) == 'E' || sentence.charAt(i) == 'I' || sentence.charAt(i) == 'O' || sentence.charAt(i) == 'U' || sentence.charAt(i) == 'a' || sentence.charAt(i) == 'e' || sentence.charAt(i) == 'i' || sentence.charAt(i) == 'o' || sentence.charAt(i) == 'u'){
                vowels++;
            } else if (sentence.charAt(i) == ' '){
                spaceCount++;
            } else {
                consonants++;
            }

        }
        System.out.println("No.of vowels : " + vowels);
        System.out.println("No.of consonants: " + consonants);
    }

    // 7. Remove duplicate occurences
    public static void removeDuplicates(String sequence){
        String newSequence = "";
        for (int i = 0; i < sequence.length()-1; i++){
            if (newSequence.indexOf(sequence.charAt(i)) == -1){
                newSequence += sequence.charAt(i);
            }
        }
        System.out.println("Without duplicates: " + newSequence);
    }

    // 8. Convert to title case
    public static void convertToTitleCase(String sentence){
        String[] splitSentence = sentence.split(" ");
        String titleCase = "";
        for (String s : splitSentence) {
            String word = s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
            titleCase += word;
            titleCase += " ";

        }
        System.out.println("Title case sentence: " + titleCase);

    }

    // 9. Longest word in sentence
    public static void findLongestWord(String sentence){
        String[] splitArray = sentence.split(" ");
        int maxLen = 0;
        String longestWord = "";
        for (int i = 0; i < splitArray.length; i++) {
            if (splitArray[i].length() > maxLen){
                maxLen = splitArray[i].length();
                longestWord = splitArray[i];
            }
        }
        System.out.println("Longest word is: " + longestWord);

    }

    // 10. Reverse a string
    public static void reverseString(String str){
        String revStr = "";
        for (int i = str.length()-1; i >= 0; i--){
            revStr += str.charAt(i);
        }
        System.out.println(revStr);

    }

    // 11. Remove spaces
    public static void removeSpaces(String str){
        String newStr = str.replace(" ", "");
        System.out.println("Spaces removed: " + newStr);
    }

}

