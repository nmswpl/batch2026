package in.co.nmsworks.training.week3.day3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MoviesFile {
    public static void main(String[] args) {
        MoviesFile moviesFile = new MoviesFile();
        moviesFile.getMoviesNameFromFile();
    }

    private void getMoviesNameFromFile() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/home/nms-training/Downloads/MovieNameAndYear.txt"));
            Map<String, List<String>> movieMap = new HashMap<>();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String cleanedLine = line.replaceAll(",", "").replaceAll("\"", "").trim();
                if (cleanedLine.isEmpty()) {
                    continue;
                }
                String[] cleanedMovieArray = cleanedLine.split("-");
                if (cleanedMovieArray.length >= 2) {
                    String year = cleanedMovieArray[cleanedMovieArray.length - 1].trim();
                    String moviesName = cleanedMovieArray[0].trim();

                    if (!movieMap.containsKey(year)) {
                        List<String> listOfMovies = new ArrayList<>();
                        listOfMovies.add(moviesName);
                        movieMap.put(year, listOfMovies);
                    } else {
                        movieMap.get(year).add(moviesName);
                    }
                }
            }
            bufferedReader.close();

            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("/home/nms-training/Downloads/OutputMovieNameAndYear.txt"));
            bufferedWriter.write("Year-wise Movies List and Total Counts:");
            bufferedWriter.newLine();

            for (Map.Entry<String, List<String>> entry : movieMap.entrySet()) {
                String year = entry.getKey();
                List<String> moviesList = entry.getValue();
                int totalCount = moviesList.size();

                bufferedWriter.write("Year: " + year + " Count: " + totalCount + " Movies: " + moviesList);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
