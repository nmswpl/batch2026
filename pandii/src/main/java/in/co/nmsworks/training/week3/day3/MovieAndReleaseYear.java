package in.co.nmsworks.training.week3.day3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class MovieAndReleaseYear {
    public static void main(String[] args) {
        MovieAndReleaseYear movieAndReleaseYear=new MovieAndReleaseYear();
        movieAndReleaseYear.getmovieFile("/home/nms-training/Downloads/MovieNameAndYear.txt");
    }

    private void getmovieFile(String filepath) {
        BufferedReader bufferedReader=null;
        try {
            bufferedReader=new BufferedReader(new FileReader(filepath));
            String line="";
//            Map<Integer, List<String>> movieMap=new HashMap<>();
            List<Movie> moviesList=new ArrayList<>();
            String[] arr;
            while((line=bufferedReader.readLine())!=null)
            {
                line=line.replaceAll("\"","");
                line=line.replaceAll(",","");
                arr=line.split("-");
                moviesList.add(new Movie(Integer.parseInt(arr[1]),arr[0]));
            }
//            System.out.println(moviesList);
            Map<Integer,Set<String>> movieMap = yearToMovie(moviesList);
            System.out.println(movieMap);

        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private Map<Integer, Set<String>> yearToMovie(List<Movie> moviesList) {
        Map<Integer,Set<String>> moviesMap=new HashMap<>();

        for (Movie movie : moviesList) {
            Integer releaseYear = movie.getReleaseYear();

            if(moviesMap.containsKey(releaseYear))
            {
                moviesMap.get(releaseYear).add(movie.getMovieName());           //adding to moviesList
            }
            else {
                Set<String> moviesName=new HashSet<>();
                moviesName.add(movie.getMovieName());
                moviesMap.put(releaseYear,moviesName);
            }
        }
        return moviesMap;
    }
}
