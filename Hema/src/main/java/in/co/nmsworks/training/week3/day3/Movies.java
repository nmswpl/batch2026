package in.co.nmsworks.training.week3.day3;


import java.io.*;
import java.util.*;

public class Movies {

    public static void main(String[] args) throws IOException {
        List<String> moviesStringList;

        moviesStringList = readFromFile();
        Map<Integer,List<String>> yearsToMoviesMap = yearsToMovie(moviesStringList);
        Map<Integer,Integer> yearsToMoviesCountMap = yearsToMoviesCount(yearsToMoviesMap);

        for (Map.Entry<Integer, Integer> entry : yearsToMoviesCountMap.entrySet()) {
            System.out.println(entry);
        }
    }

    private static Map<Integer, Integer> yearsToMoviesCount(Map<Integer, List<String>> map) {
        Map<Integer,Integer> countMap = new HashMap<>();

        for (Integer year : map.keySet()) {
            countMap.put(year,map.get(year).size());
        }

        return countMap;
    }

    private static Map<Integer, List<String>> yearsToMovie(List<String> moviesStringList) {
        Map<Integer,List<String>> yearsToMoviesMap = new HashMap<>();

        for (String line : moviesStringList) {
            String[] row = line.split(",");

            if( yearsToMoviesMap.containsKey(Integer.parseInt(row[1])) )
            {
                yearsToMoviesMap.get(Integer.parseInt(row[1])).add(row[0]);
                continue;
            }
            yearsToMoviesMap.put(Integer.parseInt(row[1]),new ArrayList<>(Arrays.asList(row[0])));
        }

        return yearsToMoviesMap;
    }

    private static List<String> readFromFile() throws IOException {

        List<String> moviesStringList = new ArrayList<>();
        List<Integer> yearList = new ArrayList<>();

        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;

        try {
            bufferedReader = new BufferedReader( new FileReader("/home/nms-training/Downloads/MovieNameAndYear.txt"));
            bufferedWriter = new BufferedWriter( new FileWriter("/home/nms-training/Downloads/MovieNameAndYear_cleaned.txt"));

            String line = "";
            while ( ( line = bufferedReader.readLine())!= null)
            {
                line = line.replace("\"", "");
                line = line.replace(",","");
                line = line.replace("-",",");

                bufferedWriter.write(line+"\n");
                bufferedWriter.flush();

//                String[] oneLine = line.split(",");

                moviesStringList.add(line);
//                yearList.add(Integer.parseInt(oneLine[1]));

//                for (String s : oneLine) {
//                    System.out.print("ONE LINE => "+s);
//                }
//                System.out.println();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if( bufferedReader != null )
            {
                bufferedReader.close();
            }
            if( bufferedWriter != null )
            {
                bufferedReader.close();
            }
        }

        return moviesStringList;
    }
}
