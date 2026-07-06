package in.co.nmsworks.training.week3.day3;

import java.io.*;
import java.util.*;

public class CandidateRunner {
    public static void main(String[] args) throws IOException {
        CandidateRunner cr = new CandidateRunner();
        List<Candidate> list = cr.bufferReadAndWrite();
        printCandidates(list);
        replacingWord();
        countFile();
        countWordsLargerThanSpecificLength();
    }

    private static void countWordsLargerThanSpecificLength() {
        BufferedWriter writer = null;
        BufferedReader reader = null;
        Set<String> wordSet = new HashSet<>();
        try {
            reader = new BufferedReader(new FileReader("/home/nms-training/Desktop/content.txt"));
            writer = new BufferedWriter(new FileWriter("/home/nms-training/Desktop/contentoutput.txt"));
            String text = "";
            int count = 0;
            text = reader.readLine();
            text = text.replaceAll(",", "");
            String[] words = text.split(" ");
            int wordLength = 0;
            for (String word : words) {
                if (word.length() > 5) {
                    count++;
                    writer.write(word + " ");
                }
                wordSet.add(word);
            }
            System.out.println("Total Words longer than 5 letter :: " + count);
            System.out.println("Total no of unique words :: " + wordSet.size());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            if(reader != null || writer != null){
                try {
                    writer.close();
                    reader.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    private static void countFile() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("/home/nms-training/Desktop/countWords.txt"));
        int sentencesCount = 0, wordsCount = 0;
        int ch ;
        while ((ch= reader.read()) != -1) {
            if (ch == ' ') {
                wordsCount++;
            } else if (ch == '.') {
                sentencesCount++;
            }
        }
        System.out.println("Total Words count :: " + wordsCount);
        System.out.println("Total Sentences count :: " + sentencesCount);
        reader.close();
    }

    private static void replacingWord() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("/home/nms-training/Desktop/original.txt"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("/home/nms-training/Desktop/modified.txt"));
        String line = "";
        String modifiedLine = "";
        while ((line = reader.readLine()) != null) {
            modifiedLine = line.replace("old", "new");
            writer.write(modifiedLine + "\n");
            writer.flush();
        }
        System.out.println("Writing finished");
        writer.close();
        reader.close();
    }

    private static void printCandidates(List<Candidate> list) {
        for (Candidate candidate : list) {
            System.out.println(" Name :: " + candidate.getName());
            System.out.println(" Roll no :: " + candidate.getId());
            System.out.println(" University :: " + candidate.getUniversity());
            System.out.println(" Dept :: " + candidate.getDept());
            System.out.println("_______________________________________________________________");

        }
    }

    private List<Candidate> bufferReadAndWrite() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("/home/nms-training/Downloads/StudentDetails.txt"));
        String line = "";
        List<Candidate> candidates = new ArrayList<>();
        while(( line = reader.readLine()) != null){
            String[] details = line.split(",");
            Candidate c = new Candidate(details[0],Integer.valueOf(details[1]),details[2],details[3]);
            candidates.add(c);
        }
        return candidates;
    }
}
