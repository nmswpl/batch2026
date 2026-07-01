package in.co.nmsworks.training.week3.day3;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MoviesReport {
    public static void main(String[] args) {
        try {
            MoviesReport report = new MoviesReport();
            Map<Integer, List<String>> moviesMap = report.allMovies();
            for (Integer i : moviesMap.keySet()) {
                System.out.println(i + " :: " + moviesMap.get(i));
            }
            for (Integer i : moviesMap.keySet()) {
                System.out.println(i + " Count of Movies :: " + moviesMap.get(i).size());
            }
        } catch (Exception e) {
           e.printStackTrace();
        }
    }

    private Map<Integer, List<String>> allMovies() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("/home/nms-training/Downloads/MovieNameAndYear.txt"));
        String line = "";
        List<String> movieNames;
        Map<Integer, List<String>> yearToMovieMap = new HashMap<>();
        while((line = reader.readLine()) != null){
            line = line.replaceAll("\"", "");
            line = line.replaceAll(",", "");
            String[] movieNameYearArray = line.split("-");
            int year = Integer.parseInt(movieNameYearArray[1]);
            movieNames = yearToMovieMap.getOrDefault(year,new ArrayList<>());
            movieNames.add(movieNameYearArray[0]);
            yearToMovieMap.put(year,movieNames);
        }
        return yearToMovieMap;
    }
}
