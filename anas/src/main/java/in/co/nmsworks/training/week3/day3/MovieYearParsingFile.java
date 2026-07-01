package in.co.nmsworks.training.week3.day3;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MovieYearParsingFile {
    public static void main(String[] args) {
        MovieYearParsingFile movieYearParsingFile = new MovieYearParsingFile();
        List<String> moviesYearsList = movieYearParsingFile.readFile();
        Map<Integer,List<String> > map = movieYearParsingFile.mapMovies(moviesYearsList);
        movieYearParsingFile.writeFile(map);
    }

    private void writeFile(Map<Integer, List<String>> map) {
        BufferedWriter bw = null;
        try {
            FileWriter fw = new FileWriter("/home/nms-training/Downloads/NewMovieNameAndYear.txt");
            bw = new BufferedWriter(fw);
            for (Map.Entry<Integer, List<String>> data : map.entrySet()) {
                bw.write("year : " + data.getKey());
                bw.write("----movies : " + data.getValue());
                bw.write("\n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bw.flush();
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private Map<Integer, List<String>> mapMovies(List<String> moviesYearsList) {
        Map<Integer, List<String>> map = new HashMap<>();
        for (String s : moviesYearsList) {
            int year = Integer.parseInt(s.substring(s.length()-4));
            String movieName = s.substring(0,s.lastIndexOf("-"));
            map.putIfAbsent(year, new ArrayList<>());
            map.get(year).add(movieName);
        }
        return map;
    }

    private List<String> readFile() {
        List<String> words = null;
        try {
            FileReader fr = new FileReader("/home/nms-training/Downloads/MovieNameAndYear.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            words = new ArrayList<>();

            while ((line = br.readLine()) != null) {
                line = line.replace("\"", "").replace(",", "").trim();
                words.add(line);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return words;
    }
}
