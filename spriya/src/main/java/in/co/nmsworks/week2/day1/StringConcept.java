package in.co.nmsworks.week2.day1;

public class StringConcept {
    public static void main(String[] args) {
        reverseString();
        palindrome();
        evenLengthString();
        removeLeadingZero();
        printPara();
        countVowelAndConsonant();
        removeDuplicates();
        titleCase();
        longestString();
        stringReverse();
        removeSpace();
    }

    public static void reverseString() {
        String str = "India is my country";

        String[] ans = str.split(" ");

        System.out.println("---the String reversal ---");
        int r = ans.length - 1;
        while (r >= 0) {
            System.out.print(ans[r] + " ");
            r--;
        }

        System.out.println(" ");

    }

    public static void palindrome() {
        String s = "dad";
        int l = 0;
        int r = s.length() - 1;
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                System.out.println("this String " + s + " is not a palindrome");
                break;
            }
            l++;
            r--;
        }
        if (l == r) {
            System.out.println("This String " + s + " is a palindrome");
        }
        System.out.println(" ");
    }

    public static void evenLengthString() {
        String s = "This is a java language";
        String[] ans = s.split(" ");
        System.out.println("---EVEN LENGTH STRING---");
        for (int i = 0; i < ans.length; i++) {
            if (ans[i].length() % 2 == 0) {
                System.out.println(ans[i]);
            }
        }
        System.out.println(" ");

    }

    public static void removeLeadingZero() {
        String s = "000560";
        System.out.println("---REMOVE LEADING ZEROS---");
        int i = 0;
        while (s.charAt(i) == '0') {

            i++;
        }
        System.out.println(s.substring(i));
        System.out.println(" ");
    }

    public static void printPara() {
        String s = "The early morning sun cast a golden hue over the quiet village, where the scent of blooming jasmine mingled with the crisp, cool air. As the first light of day filtered through the canopy of ancient oak trees, the streets began to stir with the soft chatter of locals preparing for the day ahead. Children darted around with laughter, their voices a cheerful contrast to the serene landscape. In the heart of the village, the old bakery's doors creaked open, releasing the warm, inviting aroma of freshly baked bread, promising a comforting start to the day for everyone within reach. ";
        String[] res = s.split("\\.");
        System.out.println("---PRINTING PARAGRAPH---");
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
        System.out.println(" ");
    }

    public static void countVowelAndConsonant() {
        String s = "Hello World";
        String str = s.toLowerCase();
        int countConsonant = 0;
        int countVowel = 0;
        System.out.println("---VOWEL AND CONSONANT COUNT---");
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                countVowel++;
            } else if (ch == ' ') {
                continue;
            } else {
                countConsonant++;
            }

        }
        System.out.println("The count of vowel is :" + countVowel + " " + "and consonant is :" + countConsonant);
        System.out.println(" ");
    }

    public static void removeDuplicates() {
        String str = "aabbcc";
        String newStr = "";

        int l = 0;
        int r = 1;
        System.out.println("---REMOVE DUPLICATES---");
        while (l < str.length()) {
            newStr += str.charAt(l);

            while (r < str.length() && str.charAt(l) == str.charAt(r)) {
                r++;
            }

            l = r;
            r = l + 1;
        }

        System.out.println("The String after removal of duplicates is: " + newStr);
        System.out.println(" ");
    }

    public static void titleCase() {
        System.out.println("---TITLE CASE---");
        String str = "the quick brown fox jumps over the lazy dog";
        String[] arr = str.split(" ");
        String res = "";
        for (int i = 0; i < arr.length; i++) {
            String a = arr[i];
            res += a.substring(0, 1).toUpperCase() + a.substring(1) + " ";

        }
        System.out.println("The title Case res is : " + res);
        System.out.println(" ");

    }

    public static void longestString() {
        String str = "the quick brown fox jumps over the lazy dog";
        System.out.println("---LONGEST WORD---");
        String[] arr = str.split(" ");
        String res = " ";
        int len = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() >= len) {
                len = arr[i].length();
                res = arr[i];
            }
        }
        System.out.println("The Longest word in the String is :" + res);
        System.out.println(" ");

    }

    public static void stringReverse() {
        String str = "Hello world!";
        System.out.println("---STRING REVERSAL---");
        char[] arr = str.toCharArray();
        int l = 0;
        int r = arr.length - 1;
        while (l < r) {
            char left = arr[l];
            char right = arr[r];
            char temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
        System.out.println(new String(arr));
        System.out.println(" ");
    }

    public static void removeSpace() {
        String str = "Hello World!";
        String res = " ";
        System.out.println("---REMOVE SPACE---");
        String[] arr = str.split(" ");
        for (int i = 0; i < arr.length; i++) {
            res += arr[i];
        }
        System.out.println("The String after removal of space is : " + res);
        System.out.println(" ");
    }
}
