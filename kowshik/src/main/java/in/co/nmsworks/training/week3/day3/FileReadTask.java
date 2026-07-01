package in.co.nmsworks.training.week3.day3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileReadTask {
    public static void main(String[] args) {
        FileReadTask fileReadTask = new FileReadTask();
        List<String> movies = fileReadTask.readDataFromFile();
        fileReadTask.printYearWiseMovies(movies);
        fileReadTask.printYearWiseMoviesCount(movies);
    }

    private void printYearWiseMoviesCount(List<String> movies) {
        Map<Integer, Integer> yearWiseMoviesCountMap = new HashMap<>();

        for (String movieWithYear : movies) {
            String[] words = movieWithYear.split("-");
            Integer movieYear = Integer.valueOf(words[1]);
            yearWiseMoviesCountMap.put(movieYear, yearWiseMoviesCountMap.getOrDefault(movieYear, 0)+1);
        }

        System.out.println("Year wise movies count : " + yearWiseMoviesCountMap);
    }

    private void printYearWiseMovies(List<String> movies) {

        Map<Integer, List<String>> yearWiseMoviesMap = new HashMap<>();

        for (String movieWithYear : movies) {
//            System.out.println("Movie with year : " + movieWithYear);

            String[] words = movieWithYear.split("-");
//            System.out.println("words[0] : " + words[0]);
//            System.out.println("words[1] : " + words[1]);

            yearWiseMoviesMap.computeIfAbsent(Integer.valueOf(words[1]), v -> new ArrayList<>()).add(words[0]);
        }

        System.out.println("Year wise movies map : " + yearWiseMoviesMap);
    }

    private List<String> readDataFromFile() {
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        List<String> movies = new ArrayList<>();

        try {
            fileReader = new FileReader("/home/nms-training/Downloads/MovieNameAndYear.txt");
            bufferedReader = new BufferedReader(fileReader);

            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                String[] moviesAndYears = line.split(",");
//                System.out.println("s[0] : " + moviesAndYears[0]);
//                System.out.println("s[1] : " + moviesAndYears[1]);

                for (String movieAndYear : moviesAndYears) {
                    System.out.println(movieAndYear);

                    String subStr = movieAndYear.substring(1, movieAndYear.length()-1);
                    System.out.println("Substr -> " + subStr);
                    movies.add(subStr);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileReader.close();
                bufferedReader.close();
            }catch (Exception e) {
                e.printStackTrace();
            }
        }

        return movies;
    }


}
