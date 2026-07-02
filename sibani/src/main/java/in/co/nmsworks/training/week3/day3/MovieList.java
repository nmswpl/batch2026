package in.co.nmsworks.training.week3.day3;

import java.io.*;
import java.util.*;

public class MovieList {
    public static void main(String[] args) {
        MovieList movieList = new MovieList();
        List<String> moviesList = movieList.readFromFile();
        movieList.yearWiseMovies();
        movieList.yearWiseMovieCount();
    }

    private void yearWiseMovies() {
        Map<Integer,List<String>> yearWiseMovies = new HashMap<>();
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader("/home/nms-training/Downloads/MovieNameAndYearCleaned.txt"));
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                String[] yearWiseCount = line.split("-");
                Integer year = Integer.parseInt(yearWiseCount[1]);
                List<String> movieList = yearWiseMovies.getOrDefault(year, new ArrayList<>());
                movieList.add(yearWiseCount[0]);
                yearWiseMovies.put(year, movieList);
            }
            for (Map.Entry<Integer, List<String>> yearWiseMovie : yearWiseMovies.entrySet()) {
                System.out.println("Year : " + yearWiseMovie.getKey() + " " + "Movies : " + yearWiseMovie.getValue());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            bufferedReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void yearWiseMovieCount() {
        Map<Integer,Integer> yearWiseMovieCount = new HashMap<>();
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader("/home/nms-training/Downloads/MovieNameAndYearCleaned.txt"));
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                String[] yearWiseCount = line.split("-");
                yearWiseMovieCount.put(Integer.parseInt(yearWiseCount[1]),yearWiseMovieCount.getOrDefault(Integer.parseInt(yearWiseCount[1]), 0) + 1);
            }
            for (Map.Entry<Integer, Integer> moviecount : yearWiseMovieCount.entrySet()) {
                System.out.println("Year : " + moviecount.getKey() + " " + " Movie Count : " + moviecount.getValue());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private List<String> readFromFile() {
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        List<String> moviesList = new ArrayList<>();
        try {
            bufferedReader = new BufferedReader(new FileReader("/home/nms-training/Downloads/MovieNameAndYear.txt"));
            bufferedWriter = new BufferedWriter(new FileWriter("/home/nms-training/Downloads/MovieNameAndYearCleaned.txt"));
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                String[] movieAndYearListArray = line.split(",");
                for (String movies : movieAndYearListArray) {
                    String[] movieListArray = movies.split("-");
                    moviesList.add(movieListArray[0].replace("\"", ""));
                    movies = movies.replace("\"", "");
                    bufferedWriter.write(movies +  "\n");
                    bufferedWriter.flush();
                }


            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            bufferedReader.close();
            bufferedWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return moviesList;
    }
}
