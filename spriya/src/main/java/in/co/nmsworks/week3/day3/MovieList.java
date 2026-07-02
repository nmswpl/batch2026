package in.co.nmsworks.week3.day3;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class MovieList {
    public void readFile() {

        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        try {
            bufferedReader = null;
            bufferedWriter = null;

            bufferedReader = new BufferedReader(new FileReader("/home/nms-training/Downloads/MovieNameAndYear.txt"));
            bufferedWriter = new BufferedWriter(new FileWriter("/home/nms-training/Desktop/MovieListOutput.txt"));


            String line = "";

            while ((line = bufferedReader.readLine()) != null) {

                String[] arr1 = line.split(",");
                String[] arr2 = arr1[0].split("\"");
                for (int i = 0; i < arr2.length; i++) {
                    bufferedWriter.write(arr2[i]);
                    bufferedWriter.write("\n");
                }


            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                bufferedReader.close();
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }


    public void yearWiseCount() {

        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader("/home/nms-training/Desktop/MovieListOutput.txt"));
            Map<Integer, Integer> countYear = new HashMap<>();
            String line = " ";

            while ((line = bufferedReader.readLine()) != null) {

                if (line.isEmpty()) {
                    continue;
                }

                String[] res = line.split("-");
                countYear.put(Integer.valueOf(res[1]), countYear.getOrDefault(Integer.valueOf(res[1]), 0) + 1);

            }
            System.out.println("COUNT OF MOVIES");
            for (Map.Entry<Integer, Integer> e : countYear.entrySet()) {
                System.out.println(e.getKey() + " -> " + e.getValue());
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public void yearWiseMoviesList() {

        BufferedReader bufferedReader = null;
        try {

            bufferedReader = new BufferedReader(new FileReader("/home/nms-training/Desktop/MovieListOutput.txt"));

            Map<Integer, List<String>> moviesList = new HashMap<>();
            String line = "";

            while ((line = bufferedReader.readLine()) != null) {

                if (line.isEmpty()) {
                    continue;
                }
                String[] res = line.split("-");
                Integer year = Integer.valueOf(res[1]);

                List<String> list = moviesList.getOrDefault(year, new ArrayList<>());
                list.add(res[0]);
                moviesList.put(year, list);
            }

            System.out.println("YEAR WISE MOVIES");
            for (Map.Entry<Integer, List<String>> e : moviesList.entrySet()) {
                System.out.println(e.getKey() + " -> " + e.getValue());
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
