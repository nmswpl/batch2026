package in.co.nmsworks.training.week3.day3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MovieFileRead {
    public static void main(String[] args) {
        MovieFileRead fr = new MovieFileRead();
        fr.fileRead();
    }

    private void fileRead() {

        String filePath = "/home/nms-training/Downloads/Movies.txt";
        List<Movies> movieList = new ArrayList<>();

        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader(filePath));
            String line;

            while ((line = br.readLine()) != null) {
                line = line.trim();
                if (line.isEmpty()) {
                    continue;
                }

                if (line.startsWith("\"")) {
                    line = line.substring(1);
                }
                if (line.endsWith("\",") || line.endsWith("\"")) {
                    line = line.substring(0, line.lastIndexOf("\""));
                }
                int hyphenIndex = line.lastIndexOf("-");
                if (hyphenIndex != -1) {
                    String name = line.substring(0, hyphenIndex).trim();
                    Integer year = Integer.valueOf(line.substring(hyphenIndex + 1).trim());

                    Movies movie = new Movies(name, year);
                    movieList.add(movie);
                }
            }
            System.out.println("Total Movies Added to List: " + movieList.size() + "\n");
            for (Movies m : movieList) {
                System.out.println(m);
            }

        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Data format error (Could not parse Year column): " + e.getMessage());
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException ex) {
                System.err.println("Error closing BufferedReader: " + ex.getMessage());
            }
        }
    }
}