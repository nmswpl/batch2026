package in.co.nmsworks.training.week2.Day1;
import java.util.*;

public class StringPractice {
    public static void reverseWord() {
        String word = "India is my country";
        String[] arr = word.split(" ");
        StringBuilder words = new StringBuilder();
        for (int i = arr.length-1; i >=0; i--) {
            words.append(arr[i] + " ");
        }
        System.out.println(words);
    }
public static void palindrome(){
        String name="dad";
        StringBuilder value=new StringBuilder(name);
        StringBuilder value1=new StringBuilder(name);
        if(value.equals(value1.reverse())){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
}
public static void evenLengthString(){
        String name="This is a java language";
        String [] str=name.split(" ");
        for(int i=0;i< str.length;i++) {
            if (str[i].length() % 2 == 0) {
                System.out.println(str[i]);
            }
        }
}
public static void removeZero(){
        String number="0005460";
        boolean val=false;
        int num=0;
       for(int i=0;i<number.length();i++){
           if(number.charAt(i)!='0'){
               val=true;
               num=i;
               break;
           }
       }
       System.out.println(number.substring(num,number.length()));

        }

public static void printParaNewLine() {
    String para = "The early morning sun cast a golden hue over the quiet village, where the scent of blooming jasmine mingled with the crisp, cool air. As the first light of day filtered through the canopy of ancient oak trees, the streets began to stir with the soft chatter of locals preparing for the day ahead. Children darted around with laughter, their voices a cheerful contrast to the serene landscape. In the heart of the village, the old bakery's doors creaked open, releasing the warm, inviting aroma of freshly baked bread, promising a comforting start to the day for everyone within reach. ";
    String[] line = para.split(",");
    for (int i = 0; i < line.length; i++) {
        System.out.println(line[i]);
    }
}

public static void vowelConsonants(){
    String value="hello world";

    int vow=0;
    int cons=0;
    for(int i=0;i<value.length();i++){
        if(value.charAt(i)=='a' || value.charAt(i)=='e' || value.charAt(i)=='i' || value.charAt(i)=='o' || value.charAt(i)=='u' ||value.charAt(i)=='A' ||value.charAt(i)=='E' || value.charAt(i)=='I' ||value.charAt(i)=='O' || value.charAt(i)=='U'){
            vow++;
        }
        else {
            cons++;
        }
    }
    System.out.println(vow);
    System.out.println(cons);
}
public static void removeDuplicates(){
        String name="aabbcc";
        HashSet<Character>set=new HashSet<>();
        for(char c:name.toCharArray()){
           set.add(c);
        }
        System.out.println(set);
}
public static void sentenceTitle(){
        String name="the quick brown fox jumps over the lazy dog";
        String [] words=name.split(" ");

        for(int i=0;i< words.length;i++){
            String val=words[i].substring(0,1).toUpperCase();
            String val2=words[i].substring(1);
            System.out.print(val+val2+" ");
        }
}
public static void longestWord(){
    String value="The quick brown fox jumps over the lazy dog";
    String []val=value.split(" ");
    int max=val[0].length();
    int r=0;
    for(int i=0;i<val.length;i++) {
        if (val[i].length() > max) {
            max = val[i].length();
            r = i;
        }}

        System.out.println(val[r]);
    }
public static void reverseString(){
    String word="madam";
    for(int i=word.length()-1;i>=0;i--){
        System.out.println(word.charAt(i));
    }
}
public static void removeSpace(){
    String value=" hello world ";
    System.out.println(value.replace(" ",""));
}
public static void main(String[] args){
   reverseWord();
   palindrome();
   longestWord();
    reverseString();
    removeSpace();
    vowelConsonants();
    sentenceTitle();
    removeZero();
    evenLengthString();
    printParaNewLine();
    removeDuplicates();
}
}
