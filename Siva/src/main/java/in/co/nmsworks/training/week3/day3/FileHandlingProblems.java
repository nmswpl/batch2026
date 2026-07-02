package in.co.nmsworks.training.week3.day3;

import java.io.*;
import java.util.*;

public class FileHandlingProblems {
    public static void main(String[] args) {
        FileHandlingProblems fp = new FileHandlingProblems();
//        fp.readFromFileAndChangeParticularValue(fp);
//        fp.countNumberOfWordsAndSentence(fp);
//        fp.countNumberOfWordsLongerThanX(fp);
        fp.manageMovieList(fp);
    }

    private void manageMovieList(FileHandlingProblems fp) {
        String content = fp.readFile("/home/nms-training/Downloads/MovieNameAndYear.txt");
        String[] eachMovie = content.split(",");
        Map<Integer, Set<String>> yearToMovies = new HashMap<>();
        for (String movie : eachMovie) {
            movie = movie.substring(1,movie.length()-1);
            int index = movie.indexOf('-');
            Integer year = Integer.parseInt(movie.substring(index+1));
            String movieName = movie.substring(0,index);
            Set<String> currentMovies = yearToMovies.get(year);
            if (currentMovies == null) {
                currentMovies = new HashSet<>();
                yearToMovies.put(year, currentMovies);
            }
            currentMovies.add(movieName);
        }
        System.out.println(yearToMovies);
    }

    private void countNumberOfWordsLongerThanX(FileHandlingProblems fp) {
        String content = fp.readFile("/home/nms-training/Downloads/NationInfo.txt");
        String[] words = content.split(" ");
        Set<String> uniqueWords = new HashSet<>();
        Long answer = 0L;
        for (String word : words) {
            if (word.length() > 5)
                answer += 1;
            uniqueWords.add(word);
        }
        String fileContent = "Number of words longer than 5 letters :: "+answer+".Number of unique words in the paragraph :: "+uniqueWords.size();
        fp.writeFile("/home/nms-training/Downloads/NationInfoWordsCount.txt",fileContent);
    }

    private void countNumberOfWordsAndSentence(FileHandlingProblems fp) {
        String content = fp.readFile("/home/nms-training/Downloads/CountWords.txt");
        String[] sentences = content.split("\\.");
        String[] words = content.split(" ");
        System.out.println("Number of words :: "+ words.length);
        System.out.println("Number of sentence :: "+ sentences.length);

    }

    private void readFromFileAndChangeParticularValue(FileHandlingProblems fp) {
        String content = fp.readFile("/home/nms-training/Downloads/Original.txt");
        content = content.replaceAll("old","new");
        fp.writeFile("/home/nms-training/Downloads/Modified.txt",content);
    }

    private void writeFile(String filePath, String content) {
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(filePath));
            String[] eachLine = content.split("\\.");
            for (String eachLineItr : eachLine) {
                writer.write(eachLineItr+'.'+'\n');
                writer.flush();
            }
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
        finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public String readFile(String filePath) {
        BufferedReader reader = null;
        String resultContent = "";
        try {
            reader = new BufferedReader(new FileReader(filePath));
            String text = "";
            while ((text = reader.readLine()) != null) {
                resultContent += text;
            }

        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return resultContent;
    }
}
