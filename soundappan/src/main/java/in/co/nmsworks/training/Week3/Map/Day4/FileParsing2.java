package in.co.nmsworks.training.Week3.Map.Day4;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileParsing2 {
    public static void main(String[] args) {
        FileParsing2.writeFile();
        FileParsing2.writeToFileToNameChange();
        FileParsing2.readCountWords();
        FileParsing2.readSizeCount();
    }

    private static void readSizeCount() {
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            br = new BufferedReader(new FileReader("/home/nms-training/Desktop/sizecount.txt"));
            bw = new BufferedWriter(new FileWriter("/home/nms-training/Desktop/addlargerword.txt"));
            String line;
            int count = 0;
            while ((line = br.readLine()) != null) {
                String[] words = line.split(" ");

                for (String w : words) {
                    if (w.length() > 5) {
                        count++;
                        bw.write(w);
                        bw.newLine();
                    }
                }
            }
            System.out.println(count);
            bw.newLine();
            br.close();
            bw.close();
        } catch (Exception e) {
            System.out.println("exception");
        }
    }

    private static void writeFile() {
        List<Candidate> list = new ArrayList<>();
        BufferedReader br;
        try {
            br = new BufferedReader(new FileReader("/home/nms-training/Downloads/StudentDetails.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                String[] split = line.split(",");
                for (String word : split) {
                    System.out.print(word);
                }
                System.out.println();
                list.add(new Candidate( Integer.parseInt(split[1].trim()),
                        split[0].trim(),
                        split[2].trim(),
                        split[3].trim()));
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Exception Found");
        }

        for (Candidate value : list) {
            System.out.println(value);
        }
        System.out.println(list.size());
    }

    private static void writeToFileToNameChange() {
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            br = new BufferedReader(new FileReader("/home/nms-training/Desktop/orginal.txt"));
            bw = new BufferedWriter(new FileWriter("/home/nms-training/Desktop/duplicate.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split(" ");
                for (String word : words) {
                    if (word.equalsIgnoreCase("old")) {
                        bw.write("new");
                    } else {
                        bw.write(word);
                    }
                    bw.write(" ");
                }
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bw.close();
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void readCountWords() {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("/home/nms-training/Desktop/countWords.txt"));
            String line;
            int wordCount = 0;
            int lineCount = 0;
            while ((line = br.readLine()) != null) {
                lineCount++;
                String[] words = line.trim().split("\\s+");
                if (!line.trim().isEmpty()) {
                    wordCount += words.length;
                }
            }
            System.out.println("Number of Words : " +wordCount);
            System.out.println("Number of Lines  : " +lineCount);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


