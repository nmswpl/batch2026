package in.co.nmsworks.training.week3.day3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Movies {
    public static void main(String[] args) {
        Movies movies = new Movies();

        List<String> movieList = movies.readMovies();
        System.out.println(movieList);

        Map<Integer,List<String>> yearWiseMovies = getYearWiseMovies(movieList);
        System.out.println(yearWiseMovies);

    }

    private static Map<Integer, List<String>> getYearWiseMovies(List<String> movieList) {
        Map<Integer, List<String>> yearToMovies = new HashMap<>();
        for (String movies : movieList) {
            String[] movie = movies.split("-");
            Integer year = Integer.parseInt(movie[1].replace('"',' ').trim());
            List<String> movieNameList = yearToMovies.get(year);
            if (movieNameList == null){
                movieNameList = new ArrayList<>();
                yearToMovies.put(year,movieNameList);
            }
            movieNameList.add(movie[0]);
        }
        return yearToMovies;
    }

    private List<String> readMovies() {
        BufferedReader bufferedReader = null;
        List<String> moviesList = new ArrayList<>();
        try {
            bufferedReader = new BufferedReader(new FileReader("/home/nms-training/Downloads/MovieNameAndYear.txt"));
            String movies = "";
            while ((movies = bufferedReader.readLine()) != null) {
                String[] movieArray = movies.split(",");
                for (String movie : movieArray) {
                    moviesList.add(movie);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    return moviesList;
    }
}
