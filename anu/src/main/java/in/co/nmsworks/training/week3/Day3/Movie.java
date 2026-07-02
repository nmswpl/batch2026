package in.co.nmsworks.training.week3.Day3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Movie {
    public static void main(String[] args) {
        Movie movie =new Movie();

        List<String> movieName = new ArrayList<>();
        List<String> movieYear = new ArrayList<>();

        movie.movieReaderFileMethod(movieName,movieYear);
        Map<String,List<String>> yearCount = movie.movieYearWiseCount(movieYear);

        Map<String,List<String>> yearMovie = movie.movieYearWiseList(movieYear,movieName);

    }

    private Map<String,List<String>> movieYearWiseCount(List<String> movieYear) {
        Map<String ,List<String>> countOfMovie = new HashMap<>();

        for (String year : movieYear) {

            List<String> moviesForThisYear = countOfMovie.get(year);

            if (moviesForThisYear == null) {

                moviesForThisYear = new ArrayList<>();
                countOfMovie.put(year, moviesForThisYear);
            }
            moviesForThisYear.add(year);
        }

        for (String year : countOfMovie.keySet()) {
            System.out.println("Year: " + year + " Count: " + countOfMovie.get(year).size());
        }

        return countOfMovie;

    }

    private Map<String, List<String>> movieYearWiseList(List<String> movieName, List<String> movieYear) {
        Map<String, List<String>> listMovie = new HashMap<>();

        for (int i = 0; i < movieYear.size(); i++) {

            String yearKey = movieYear.get(i);
            String nameValue = movieName.get(i);

            List<String> moviesListYear = listMovie.get(yearKey);

            if (moviesListYear == null) {

                moviesListYear = new ArrayList<>();
                listMovie.put(yearKey, moviesListYear);
            }

            moviesListYear.add(nameValue);
        }


        for (String name : listMovie.keySet()) {

            List<String> movieOfYear = listMovie.get(name);

            System.out.println("name of movie " + name + " year : " + movieOfYear);
        }

        return listMovie;
    }

    private void movieReaderFileMethod(List<String> movieName,List<String> movieYear) {
        BufferedReader br = null;
        try{
            br = new BufferedReader(new FileReader("/home/nms-training/Downloads/MovieNameAndYear.txt"));

            String line = " ";

            while((line = br.readLine()) != null){
                String splitValue = line.replace("\"", "");
                String[] separate = splitValue.split(",");
                for (String s : separate) {
                    if(s.contains("-")){
                        String[] separateMovie = s.split("-");
                        movieName.add(separateMovie[0].trim());
                        movieYear.add(separateMovie[1].trim());
                    }
                }
            }
            System.out.println(movieName);
            System.out.println(movieYear);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
