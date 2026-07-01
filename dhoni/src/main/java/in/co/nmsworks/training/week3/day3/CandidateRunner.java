package in.co.nmsworks.training.week3.day3;

import in.co.nmsworks.training.week3.day2.Student;

import java.io.*;
import java.util.*;

public class CandidateRunner {
    public static void main(String[] args) {

        CandidateRunner candidateRunner = new CandidateRunner();
        //List<Candidate> candidateList = candidateRunner.readFile();
        //candidateRunner.printCandidate(candidateList);
        //candidateRunner.replaceText();
        //candidateRunner.countWordsInFile();
        candidateRunner.countLargerWords();

    }

    private void countLargerWords() {
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;

        try {
            bufferedReader = new BufferedReader(new FileReader("/home/nms-training/Desktop/largeWords.txt"));
            bufferedWriter = new BufferedWriter(new FileWriter("/home/nms-training/Desktop/longerWords.txt"));

            String line = bufferedReader.readLine();

            String newLine = line.replace(","," ");
            newLine = newLine.replace("."," ");
            String[] words = newLine.split(" ");

            Set<String> uniqueWords = new HashSet<>(Arrays.asList(words));
            Set<String> largerWords = new HashSet<>();
            int count  = 0;

            for(String word : words){
                if(word.length() > 5){
                    count++;
                    largerWords.add(word);
                }
            }

            bufferedWriter.write("larger words : " + count +" \n");
            bufferedWriter.write("unique words : " + uniqueWords.size() + " \n");
            bufferedWriter.write(uniqueWords + "\nlarger words:\n");
            bufferedWriter.write(largerWords.toString());

            System.out.println("larger words : " + count );
            System.out.println("unique words : " + uniqueWords.size());
            System.out.println(uniqueWords);

            bufferedWriter.close();
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    private void countWordsInFile() {
        BufferedReader bufferedReader = null;

        try{
            bufferedReader = new BufferedReader(new FileReader("/home/nms-training/Desktop/countWords.txt"));

            String line = bufferedReader.readLine();
            String[] lines = line.split("\\.");
            String[] words = line.split(" ");

            System.out.println("lines count : " + lines.length);
            System.out.println(Arrays.toString(lines));

            System.out.println("words count : " + words.length);
            System.out.println(Arrays.toString(words));

        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void replaceText() {
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;

        try{
            bufferedReader = new BufferedReader(new FileReader("/home/nms-training/Desktop/original.txt"));
            bufferedWriter = new BufferedWriter(new FileWriter("/home/nms-training/Desktop/modified.txt"));

            String line = "";
            String newLine = "";
            while ((line = bufferedReader.readLine()) != null){
                newLine = newLine + line.replace("old","new");
            }

            String[] elements = newLine.split("\\.");

            for(String element : elements){
                bufferedWriter.write(element);
                bufferedWriter.write("\n");
            }

            bufferedWriter.flush();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            try {
                assert bufferedWriter != null;
                bufferedWriter.close();
                bufferedReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }

    private void printCandidate(List<Candidate> candidateList) {
        System.out.println("candidate size : " + candidateList.size());
        for (Candidate candidate : candidateList){
            System.out.println("name " + candidate.getName() + " " + "id :" + candidate.getId()
                    + " college : " + candidate.getCollege() + " dept : " + candidate.getDept());
        }
    }


    private List<Candidate> readFile() {

        BufferedReader bufferedReader = null;

        try {
            bufferedReader = new BufferedReader(new FileReader("/home/nms-training/Downloads/StudentDetails.txt"));

            String line = "";
            List<Candidate> list = new ArrayList<>();

            while((line = bufferedReader.readLine()) != null){
                String[] elements = line.split(",");

                list.add(new Candidate(elements[0], Integer.parseInt(elements[1]), elements[2], elements[3] ));

            }
            return list;

        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
