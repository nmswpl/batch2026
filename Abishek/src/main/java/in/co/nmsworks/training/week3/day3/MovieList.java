package in.co.nmsworks.training.week3.day3;

import org.apache.commons.collections.BagUtils;

import java.io.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class MovieList {

    public static void listOfMovies() {

        try {
            BufferedReader br = new BufferedReader(new FileReader("/home/nms-training/Downloads/MovieNameAndYear (1).txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("/home/nms-training/Downloads/MovieNameAndYear (1).txt"));
            String line="";
            while ((line = br.readLine()) != null)
            {
                System.out.println(line);
            }
            String split[] = line.split("-");
            for (String s : split) {
                System.out.println(s);
            }
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
