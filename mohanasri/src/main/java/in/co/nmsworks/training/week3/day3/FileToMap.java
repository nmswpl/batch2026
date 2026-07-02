package in.co.nmsworks.training.week3.day3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class FileToMap {
    public static void main(String[] args) throws Exception{
         List<String> moviesList = fileToList();

        HashMap<Integer, List<String>> moviesListMap = createMoviesListMap(moviesList);
        HashMap<Integer, Integer> moviesCountMap = createMoviesCountMap(moviesListMap);

        printResults(moviesListMap, moviesCountMap);
    }

    private static List<String> fileToList() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("/home/nms-training/Downloads/MovieNameAndYear.txt"));
        String line = "";
        List<String> moviesList = new ArrayList<>();
        String[] ar;
        while((line = br.readLine()) != null){
            ar = line.replace("\"", "").split(",");
            for(String s : ar) {
                moviesList.add(s);
            }
        }
        //System.out.println(moviesList);
        return moviesList;
    }

    public static HashMap<Integer, List<String>> createMoviesListMap(List<String> rawMovies) {
        HashMap<Integer, List<String>> movieMap = new HashMap<>();

        for (String entry : rawMovies) {
            String[] parts = entry.split("-");
            int lastIndex = parts.length - 1;
            String yearText = parts[lastIndex];

            String title = parts[0];
            for (int i = 1; i < lastIndex; i++) {
                title = title + "-" + parts[i];
            }

            int year = Integer.parseInt(yearText);

            if (!movieMap.containsKey(year)) {
                movieMap.put(year, new ArrayList<>());
            }

            List<String> currentList = movieMap.get(year);

            if (!currentList.contains(title)) {
                currentList.add(title);
            }
        }
        return movieMap;
    }

    public static HashMap<Integer, Integer> createMoviesCountMap(HashMap<Integer, List<String>> moviesListMap) {
        HashMap<Integer, Integer> countMap = new HashMap<>();

        for (int year : moviesListMap.keySet()) {
            int numberOfMovies = moviesListMap.get(year).size();
            countMap.put(year, numberOfMovies);
        }
        return countMap;
    }

    public static void printResults(HashMap<Integer, List<String>> listMap, HashMap<Integer, Integer> countMap) {
        System.out.println("--- Year Wise Movies List ---");
        System.out.println(listMap);
        System.out.println();

        System.out.println("--- Year Wise Count of Movies ---");
        System.out.println(countMap);
    }
}

    

