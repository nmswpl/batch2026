package in.co.nmsworks.training.week1.day1;
import java.util.*;

import com.google.gson.internal.bind.util.ISO8601Utils;

public class CheckVowelConsonant {
    public static void main(String[] args) {
        char ch = 'u';
        if( ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch =='U')
            System.out.println(ch+" is a Vowel");
        else
            System.out.println(ch+" is a Consonant");



    }
}
