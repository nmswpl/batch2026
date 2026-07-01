package in.co.nmsworks.training.week3.day3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Movies {
    public static void main(String[] args) {
        Movies movies = new Movies();

        List<String> moviesList = movies.getMovieData();
        System.out.println("List after reading file:");
        for (String s : moviesList) {
            System.out.println(s);
        }
        System.out.println();

        System.out.println("Year-wise movies map:");
        Map<Integer, List<String>> yearWiseMoviesMap = movies.yearWiseMovies(moviesList);
        for (Map.Entry<Integer, List<String>> integerListEntry : yearWiseMoviesMap.entrySet()) {
            System.out.println(integerListEntry);
        }
        System.out.println();

        System.out.println("Year-wise movies count");
        Map<Integer, Integer> yearWiseMovieCountMap = movies.yearWiseMoviesCount(yearWiseMoviesMap);
        for (Map.Entry<Integer, Integer> integerIntegerEntry : yearWiseMovieCountMap.entrySet()) {
            System.out.println(integerIntegerEntry);
        }
    }

    private Map<Integer, Integer> yearWiseMoviesCount(Map<Integer, List<String>> yearWiseMoviesMap) {

        Map<Integer, Integer> yearWiseMovieCountMap = new HashMap<>();
        for (Integer i : yearWiseMoviesMap.keySet()) {
            yearWiseMovieCountMap.put(i, yearWiseMoviesMap.get(i).size());
        }
        return yearWiseMovieCountMap;
    }

    private Map<Integer, List<String>> yearWiseMovies(List<String> moviesList) {

        Map<Integer,List<String>> yearWiseMoviesMap = new HashMap<>();
        for (String s : moviesList) {
            String[] splitMovie = s.split("-");
            Integer year = Integer.valueOf(splitMovie[1]);
            String movieName = splitMovie[0];
            List<String> moviesInYear = yearWiseMoviesMap.get(year);
            if (moviesInYear == null){
                moviesInYear = new ArrayList<>();
                yearWiseMoviesMap.put(year, moviesInYear);
            }
            moviesInYear.add(movieName);

        }
        return yearWiseMoviesMap;
    }

    private List<String> getMovieData() {
        List<String> moviesList = new ArrayList<>();
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader("/home/nms-training/Desktop/MovieNameAndYear.txt"));
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                String removeQuotes = line.replaceAll("\"", "");
                String cleanedLine = removeQuotes.replace(",", "");
                moviesList.add(cleanedLine);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return moviesList;
    }
}
