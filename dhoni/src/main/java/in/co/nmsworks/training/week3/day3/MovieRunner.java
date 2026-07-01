package in.co.nmsworks.training.week3.day3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MovieRunner {
    public static void main(String[] args) {

        MovieRunner movieRunner = new MovieRunner();
        List<Movie> movieList = movieRunner.getMovieList();

        Map<Integer,List<String>> movieMap = movieRunner.getMovieMap(movieList);
        movieRunner.printMovieYearWise(movieMap);

        Map<Integer,Integer> movieYearWiseCount = movieRunner.getYearWiseCount(movieMap);
        movieRunner.printMovieYearWiseCount(movieYearWiseCount);

    }

    private void printMovieYearWiseCount(Map<Integer, Integer> movieYearWiseCount) {
        for(Map.Entry<Integer, Integer> movie : movieYearWiseCount.entrySet()){
            System.out.println(" year : " + movie.getKey() + " count : " + movie.getValue());
        }
    }

    private void printMovieYearWise(Map<Integer, List<String>> movieMap) {
        for(Map.Entry<Integer,List<String>> movie : movieMap.entrySet()){
            System.out.println(" year : " + movie.getKey() + " list : " + movie.getValue());
        }
    }

    private Map<Integer, Integer> getYearWiseCount(Map<Integer, List<String>> movieMap) {
        Map<Integer, Integer> yearWiseCount = new HashMap<>();

        for(Map.Entry<Integer,List<String>> movie : movieMap.entrySet()){
            yearWiseCount.put(movie.getKey(), movie.getValue().size());
        }

        return yearWiseCount;
    }

    private Map<Integer, List<String>> getMovieMap(List<Movie> movieList) {
        Map<Integer, List<String>> movieMap = new HashMap<>();

        for (Movie movie : movieList){
            movieMap.putIfAbsent(movie.getYear(), new ArrayList<>());
            movieMap.get(movie.getYear()).add(movie.getMovieName());
        }
        return movieMap;
    }

    private List<Movie> getMovieList() {
        BufferedReader bufferedReader = null;
        List<Movie> movieList = new ArrayList<>();

        try {
            bufferedReader = new BufferedReader(new FileReader("/home/nms-training/Downloads/MovieNameAndYear.txt"));

            String line = "";
            String newLine = "";

            while((line = bufferedReader.readLine()) != null){
                newLine = line.replace("\"","");
                newLine = newLine.replace(",","");
                String[] elements =newLine.split("-");
                //System.out.println(elements[0] + " " + elements[1]);
                movieList.add(new Movie(elements[0], Integer.parseInt(elements[1])));
            }

        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
        return movieList;
    }
}
