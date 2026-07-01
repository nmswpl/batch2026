package in.co.nmsworks.training.week3.day3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MovieGrouping {
    public static void main(String[] args) {
        MovieGrouping movieGrouping = new MovieGrouping();

        Map<Integer, List<String>> yearWiseMovieMap = movieGrouping.getMoviesDetails();
        System.out.println("MOVIES LIST YEAR WISE::");
        movieGrouping.printMoviesListYearWise(yearWiseMovieMap);
        System.out.println("MOVIES COUNT PER YEAR::");
        movieGrouping.printMovieCountPerYear(yearWiseMovieMap);
    }

    private void printMovieCountPerYear(Map<Integer, List<String>> yearWiseMovieMap) {
        yearWiseMovieMap.forEach((year , movies) -> {
            System.out.println(year + "  -->  " + movies.size());
        });
    }

    private void printMoviesListYearWise(Map<Integer, List<String>> yearWiseMovieMap) {
        yearWiseMovieMap.forEach((year , movies) -> {
            System.out.println(year + "  -->  " + movies);
        });
    }

    private Map<Integer, List<String>> getMoviesDetails() {
        Map<Integer, List<String>> yearWiseMovieMap = new HashMap<>();
        List<String> movieList;
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader("src/main/java/in/co/nmsworks/training/week3/day3/data/MovieNameAndYear.txt"));
            String line;
            while ((line = reader.readLine()) != null){
                String[] details = cleanMovieDetails(line);
                Integer year = Integer.valueOf(details[1]);
                movieList = yearWiseMovieMap.getOrDefault(year, new ArrayList<>());
                yearWiseMovieMap.put(year, movieList);
                movieList.add(details[0]);
            }
        } catch (IOException e) {
            System.err.println("ERROR : " + e.getMessage());
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                System.err.println("ERROR : " + e.getMessage());
            }
        }
        return yearWiseMovieMap;
    }

    private String[] cleanMovieDetails(String line) {
        line = line.replaceAll("[\",]", "");
        return line.split("-");

    }
}
