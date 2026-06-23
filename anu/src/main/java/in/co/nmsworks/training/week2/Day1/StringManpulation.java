package in.co.nmsworks.training.week2.Day1;

public class StringManpulation {

    public static void main(String[] args) {
        String str = "India is my country";
        reverseSentences(str);

        String palindrome= "dad";
        if(checkPalindrome(palindrome)){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }

        String word="This is a java language";
        System.out.println("Even length of character : ");
        printEvenLength(word);

        System.out.println("Remove the leading :  ");
        String number="0005640";
        removeLeading(number);

        System.out.print("print the vowels and constant : ");
        String input="Hello World";
        countAlphabet(input);

        System.out.print("Reverse the character:");
        String a=" Anushri ";
        for (int i = a.length()-1; i >=0 ; i--) {
            System.out.print(a.charAt(i));
        }

        System.out.println("remove the space : " + a.trim());

        System.out.print("first letter as capital : ");

        String sentence="the quick brown fox jumps over the lazy dog";
        changeUppercase(sentence);

        String r=longestWord(sentence);
        System.out.println("longest word : " + r);

        String strings="aabbcc";
        String duplicate=removeDuplicates(strings);
        System.out.println("remove the duplicate :  " + duplicate);

        String s="The early morning sun cast a golden hue over the quiet village, where the scent of blooming jasmine mingled with the crisp, cool air. As the first light of day filtered through the canopy of ancient oak trees, the streets began to stir with the soft chatter of locals preparing for the day ahead. Children darted around with laughter, their voices a cheerful contrast to the serene landscape. In the heart of the village, the old bakery's doors creaked open, releasing the warm, inviting aroma of freshly baked bread, promising a comforting start to the day for everyone within reach.";
        String[] e=s.split(" ");
        for (int i = 0; i < e.length; i++) {
            String result=e[i];
            System.out.println(result);
        }

    }

    private static void changeUppercase(String sentence) {
        String[] upcase = sentence.split(" ");
        String res = "";
        for (int i = 0; i < upcase.length; i++) {
            String word = upcase[i];
            res += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
        }
        System.out.println(res.trim());
    }

    private static String longestWord(String sentence) {
        String[] words = sentence.split(" ");
        String lw= "";
        for (String word : words) {
            if (word.length() > lw.length()) {
                lw = word;
            }
        }
        return lw;
    }

    private static void countAlphabet(String input) {
        int vcount=0;
        int ccount=0;
        for (int i = 0; i < input.length(); i++) {
             char ca=input.charAt(i);
            if(ca== 'a' || ca== 'e' || ca == 'i' || ca== 'o' || ca == 'u' ) {
                vcount++;
            }
            else{
                ccount++;
            }
        }
        System.out.println("vowels : " + vcount);
        System.out.println("constants :"+ccount);
    }

    private static void removeLeading(String number) {
        String lead = number.replaceFirst("0+", "");
        System.out.println(lead);
    }

    private static void printEvenLength(String word) {
        String[] even=word.split(" ");
        for (int i = 0; i < even.length; i++) {
            String e=even[i];
            if(e.length() % 2==0){
                System.out.println(e);
            }
        }
    }

    private static boolean checkPalindrome(String palindrome) {
        String s=palindrome.toLowerCase();
        String rev="";
        for (int i = s.length()-1; i >=0 ; i--) {
            rev+=s.charAt(i);
        }
        return s.equals(rev);
    }

    private static void reverseSentences(String str) {
        String[] rev=str.split(" ");
        System.out.print("Storing into array rev : ");
        for (int i = 0; i < rev.length; i++) {
            System.out.print(rev[i]);
        }
        System.out.println();
        System.out.print("reverse the words : ");
        for (int i = rev.length-1; i >=0 ; i--) {
            System.out.print(rev[i]);
        }
    }

    private static String removeDuplicates(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char current = text.charAt(i);
            if (result.indexOf(current) == -1) {
                result += current;
            }
        }
        return result;
    }
}
