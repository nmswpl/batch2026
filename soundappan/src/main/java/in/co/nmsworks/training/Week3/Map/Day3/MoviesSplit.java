package in.co.nmsworks.training.Week3.Map.Day3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class MoviesSplit {
    public static void main(String[] args) {
        try {
            Map<Integer, List<String>>movies=new HashMap<>();
            BufferedReader br=new BufferedReader(new FileReader("/home/nms-training/Desktop/MovieNameAndYear.txt"));
            String line ="";
            while ((line=br.readLine())!=null){
                String info=line.replace(",","");
                String value=info.replace("\"","");
                String []word=value.split("-");
                String movie=word[0];
                Integer year=Integer.parseInt(word[1]);
                List<String>mov=movies.get(year);
                if(mov==null){
                    mov=new ArrayList<>();
                    movies.put(year,mov);
                }
                movies.get(year).add(movie);
            }
            System.out.println("--------------------------");
            System.out.println("Year wise count of movies");
            System.out.println("--------------------------");
            for (Map.Entry<Integer,List<String>>ent: movies.entrySet()){
                System.out.println(ent.getKey() +" "+ ent.getValue().size());
            }
            System.out.println("---------------------");
            System.out.println("Year wise movies list");
            System.out.println("---------------------");
            for (Map.Entry<Integer,List<String>>ent: movies.entrySet()){
                System.out.println(ent.getKey() +" "+ ent.getValue());
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
