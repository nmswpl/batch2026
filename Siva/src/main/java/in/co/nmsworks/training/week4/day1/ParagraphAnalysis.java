package in.co.nmsworks.training.week4.day1;

import in.co.nmsworks.training.week3.weekend.WordFrequencyCounter;

import java.util.Map;

public class ParagraphAnalysis {
    public static void main(String[] args) {
        ParagraphAnalysis paragraphAnalysis = new ParagraphAnalysis();
        paragraphAnalysis.run();
    }

    private void run() {
        int[] analysisReport = getReport();
        System.out.println("Number of statements in the paragraph :: "+analysisReport[0]);
        System.out.println("Total number of words :: "+analysisReport[1]);
        System.out.println("Total number of letters : "+analysisReport[2]);
    }

    private int[] getReport() {
        WordFrequencyCounter wordFrequencyCounter = new WordFrequencyCounter();
        Integer noOfStatement = 0;
        String fileContent = wordFrequencyCounter.readFile("/home/nms-training/Downloads/Word_Frequency.txt");
        String[] allWords = wordFrequencyCounter.splitWords(fileContent);
        Map<String, Integer> wordToCount = wordFrequencyCounter.getWordToCount(allWords);
        int[] analysisReport = new int[3];
        analysisReport[0] = wordFrequencyCounter.getNumberOfStatement("/home/nms-training/Downloads/Word_Frequency.txt");
        analysisReport[1] = wordToCount.size();
        analysisReport[2] = fileContent.length();
        return analysisReport;
    }
}
