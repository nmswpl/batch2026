package in.co.nmsworks.training.week3.day3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;


public class MovieName{


    public static void main(String[] args) {
        MovieName movieName = new MovieName();
        movieName.yearWiseMoviePrint();
       // movieName.yearWiseMovieCount();
    }



    private void yearWiseMoviePrint() {
        try {
            List<String> list ;
            Map<Integer, List<String>> map = new HashMap<>();
            FileReader fileReader = new FileReader("/home/nms-training/Downloads/MovieNameAndYear.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                String doub = line.replace("\"", "").replace(",", "");
                String[] strArray = doub.split("-");
                Integer year = Integer.parseInt(strArray[1]);
                String name = strArray[0];
                List<String> namelist;

                map.putIfAbsent(year, new ArrayList<>());
                map.get(year).add(name);


            }
            for (Map.Entry<Integer, List<String>> integerListEntry : map.entrySet()) {
                System.out.println(integerListEntry.getKey());
                System.out.println(integerListEntry.getValue());

            }
            System.out.println();
            for (Map.Entry<Integer, List<String>> integerListEntry : map.entrySet()) {
                System.out.println(integerListEntry.getKey());
                System.out.println(integerListEntry.getValue().size());

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


