package in.co.nmsworks.training.week4;

import in.co.nmsworks.training.week3.weekend.WordFrequencyCounter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ParagraphAnalysis {
    public static void main(String[] args) {
        ParagraphAnalysis paraAnalysis = new ParagraphAnalysis();

        WordFrequencyCounter wordFreqCounter = new WordFrequencyCounter();
        String words = wordFreqCounter.getWordsAsText();
        int[] analysis = paraAnalysis.analyseParagraph(words);
        System.out.println("NO OF STATEMENTS = " + analysis[0]);
        System.out.println("NO OF WORDS = " + analysis[1]);
        System.out.println("NO OF LETTERS = " + analysis[2]);
    }

    private int[] analyseParagraph(String wordsText) {
        int[] analysis = new int[3];
        List<String> words = Arrays.asList(wordsText.split(" "));
        for (String word : words) {
            if (word.contains(".")){
                // state
                analysis[0]++;
            }
            // word
            analysis[1]++;
            //char
            analysis[2] += word.length();
        }

        return analysis;
    }
}
