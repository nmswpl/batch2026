package in.co.nmsworks.training.week3.Day3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Movies {
    public static void main(String[] args) throws FileNotFoundException {
        Movies mv = new Movies();
        List<MovieData> allMovies = mv.getMovies();
        mv.getYearWiseMovieList(allMovies);
        mv.getYearWiseMovieCount(allMovies);


    }

    public void getYearWiseMovieCount(List<MovieData> listToProcess) {
        Map<Integer, List<String>> uniqueMap = new HashMap<>();

        for (MovieData movie : listToProcess) {
            if (!uniqueMap.containsKey(movie.getYear())) {
                uniqueMap.put(movie.getYear(), new ArrayList<>());
            }
            if (!uniqueMap.get(movie.getYear()).contains(movie.getName())) {
                uniqueMap.get(movie.getYear()).add(movie.getName());
            }
        }

        Map<Integer, Integer> countMap = new HashMap<>();
        for (Integer year : uniqueMap.keySet()) {
            int totalUniqueMovies = uniqueMap.get(year).size();
            countMap.put(year, totalUniqueMovies);
        }

        System.out.println("\n=== Year Wise Unique Movie Count ===");
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            System.out.println(entry.getKey() + "  " + entry.getValue() + " movies Released");
        }
    }

    private void getYearWiseMovieList(List<MovieData> allMovies) {

        Map<Integer,List<String>>yearWiseMap=new HashMap<>();

        for (MovieData movie : allMovies) {
            Integer year=movie.getYear();
            String name=movie.getName();

            if (!yearWiseMap.containsKey(year)){
                yearWiseMap.put(year,new ArrayList<>());
            }

            if (!yearWiseMap.get(year).contains(name)){
                yearWiseMap.get(year).add(name);
            }

        }
        System.out.println("\n=== Year Wise Movies List ===");
        for (Map.Entry<Integer, List<String>> entry : yearWiseMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }

    private List<MovieData> getMovies() throws FileNotFoundException {

        BufferedReader br = new BufferedReader(new FileReader("/home/nms-training/Downloads/MovieNameAndYear.txt"));
        String line = "";
        List<MovieData> cleanMovieList = new ArrayList<>();

        try {
            while ((line = br.readLine()) != null) {
                String ReplaceDoubleQuotes = line.replace("\"", " ");
                String cleanedLine=ReplaceDoubleQuotes.replace(",", " ").trim();
                //System.out.println(cleanedLine);
                String[] fullData = cleanedLine.split("-");

                String movieName=fullData[0];
                Integer yearPart= Integer.valueOf(fullData[1]);
                //System.out.println(movieName);
                //System.out.println(yearPart);

                String finalMovieName="";
                if (movieName.contains("'s")){
                    String[] moviesName=movieName.split("'s");

                    finalMovieName=moviesName[1].trim();

                }
                else {
                    finalMovieName=movieName.trim();
                }
                MovieData singleMovie = new MovieData(finalMovieName, yearPart);
                cleanMovieList.add(singleMovie);

            }
            br.close();
            return cleanMovieList;

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
