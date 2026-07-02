package in.co.nmsworks.training.week3.day3;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MovieMapRunner {
    public static void main(String[] args) {
        MovieMapRunner movieMaps= new MovieMapRunner();
        movieMaps.fileParsing();
    }
    private Map<Integer,List<String>> getYearToMovies(List<MovieMaps> list ){
        Map<Integer,List<String>> map = new HashMap<>();
        for (MovieMaps movies : list) {
            int year = movies.getYear();
            List<String> movieNames = map.get(year);
            if(movieNames == null){
                movieNames = new ArrayList<>();
                map.put(year,movieNames);
            }
            movieNames.add(movies.getName());
        }
        System.out.println("Yaer to movies map....");
        for (Integer i : map.keySet()) {
            System.out.println(i + "--->" + map.get(i));
        }
        return map;
    }
    private void fileParsing() {
        BufferedReader reader = null;
        BufferedWriter writer = null;
        try {
            reader = new BufferedReader(new FileReader(("/home/nms-training/Desktop/MovieNameAndYear.txt")));
            writer = new BufferedWriter(new FileWriter("/home/nms-training/Desktop/MovieNameAndYearCleaned.txt"));
            List<MovieMaps> list = new ArrayList<>();
            String line = "";
            while ((line = reader.readLine()) != null) {
                line = line.replace("\"", "").replace(",", "");
                writer.write(line);
                writer.newLine();

                String[] movies = line.split("-");
                String name = movies[0];
                int year = Integer.parseInt(movies[1]);
                MovieMaps m = new MovieMaps(name, year);

                list.add(m);

            }
            Map<Integer, List<String>> map = getYearToMovies(list);
            getYearToMoviesCount(map);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void getYearToMoviesCount(Map<Integer,List<String>> map) {
        System.out.println("Year to moviesCount map...");
        for (Integer i : map.keySet()) {
            System.out.println(i + "---->" + map.get(i).size());
        }
    }
}
