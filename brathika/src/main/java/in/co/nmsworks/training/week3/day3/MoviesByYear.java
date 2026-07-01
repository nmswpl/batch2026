package in.co.nmsworks.training.week3.day3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MoviesByYear {
    public static void main(String[] args) {
        MoviesByYear moviesByYear = new MoviesByYear();
        List<String> movies = moviesByYear.readMoviesFile();
        Map<Integer, List<String>> yearToMovies = moviesByYear.listToMap(movies);
        System.out.println(yearToMovies);
        moviesByYear.noOfMovies(yearToMovies);
    }

    private void noOfMovies(Map<Integer, List<String>> yearToMovies) {
        for (Map.Entry<Integer, List<String>> entry : yearToMovies.entrySet()) {
            int count = entry.getValue().size();
            System.out.println("Year: "+entry.getKey()+" "+count+" movies");
        }
    }

    private Map<Integer, List<String>> listToMap(List<String> movies) {
        Map<Integer, List<String>> yearToMovies = new HashMap<>();
        for (String movie : movies) {
            String string = movie;
            int n = string.length();
            string = string.substring(1, n-2);
            String[] array = string.split("-");
            Integer year = Integer.valueOf(array[1]);
            List<String> movieToYear = yearToMovies.get(year);
            if (movieToYear == null) {
                movieToYear = new ArrayList<>();
                yearToMovies.put(year,movieToYear);
            }
            String name = array[0];
            movieToYear.add(name);
        }

        return yearToMovies;
    }

    private List<String> readMoviesFile() {
        List<String> moviesByYear = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("/home/nms-training/Downloads/MovieNameAndYear.txt"));
            String text = "";
            while ((text = reader.readLine()) != null) {
                moviesByYear.add(text);
            }
            reader.close();
            System.out.println(moviesByYear);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return moviesByYear;
    }
}
