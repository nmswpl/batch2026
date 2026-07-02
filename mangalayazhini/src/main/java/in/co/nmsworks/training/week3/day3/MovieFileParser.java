package in.co.nmsworks.training.week3.day3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MovieFileParser {
    public static void main(String[] args) {

        MovieFileParser movieParser = new MovieFileParser();
        String[] listOfMovies = movieParser.collectMovieData("/home/nms-training/Downloads/MovieNameAndYear.txt");
        Map<String, List<String>> yearWiseMoviesMap = movieParser.yearWiseMovieMapping(listOfMovies);

        System.out.println("Year wise movie list");
        for(String year : yearWiseMoviesMap.keySet()){
            System.out.println(year + " : " + yearWiseMoviesMap.get(year));
        }

        Map<String,Integer> yearWiseMovieCount = movieParser.yearWiseMovieCountMapping(yearWiseMoviesMap);
        System.out.println("Year wise movie count list");
        for(String year : yearWiseMovieCount.keySet()){
            System.out.println(year + " : " + yearWiseMovieCount.get(year));
        }

    }

    private Map<String, Integer> yearWiseMovieCountMapping(Map<String, List<String>> yearWiseMoviesMap) {

        Map<String, Integer> yearWiseMovieCountMap = new HashMap<>();
        Integer noOfMovies;
        for(String year : yearWiseMoviesMap.keySet()){
            noOfMovies = yearWiseMoviesMap.get(year).size() ;
            yearWiseMovieCountMap.put(year, noOfMovies);
        }

//        for(String year : yearWiseMovieCountMap.keySet()){
//            System.out.println(year + " : " + yearWiseMovieCountMap.get(year));
//        }

        return yearWiseMovieCountMap;
    }


    private Map<String, List<String>> yearWiseMovieMapping(String[] listOfMovies) {
        Map<String,String> moviesYearMap = new HashMap<>();
        for(String movieData : listOfMovies){

            String[] individualMovieDetails = movieData.split("-");
            moviesYearMap.put(individualMovieDetails[0].replace("\"",""),individualMovieDetails[1].replace("\"",""));

        }


        Map<String, List<String>> yearMoviesMap = new HashMap<>();
        for(String key : moviesYearMap.keySet()){
            String year = moviesYearMap.get(key);
            List<String> yearWiseMovieList = yearMoviesMap.get(year);

            if(yearWiseMovieList == null){
                yearWiseMovieList = new ArrayList<>();
                yearMoviesMap.put(year,yearWiseMovieList);
            }
            yearWiseMovieList.add(key);

        }

        System.out.println("length of year wise movie list : " + yearMoviesMap.size());

//        System.out.println("Year wise movie list");
//        for(String year : yearMoviesMap.keySet()){
//            System.out.println(year + " : " + yearMoviesMap.get(year));
//        }
        return yearMoviesMap;
    }

//    }

//    private void collectMovieData(String path) {
//        BufferedReader readerObj= null;
//        String data ;
//        String completeData = "";
//        String[] completeDataList = null;
//        Map<String, List<String>> yearMoviesMap = new HashMap<>();
//
//        try {
//            readerObj = new BufferedReader(new FileReader(path));
//            while((data = readerObj.readLine()) != null){
//                System.out.println("data : " + data);
//                completeData += data ;
//            }
//
//            completeDataList  = completeData.split(",");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
////        System.out.println("Complete Data : ");
////        System.out.println(completeData);
////        System.out.println("length : " +completeData.length());
////        System.out.println("Complete Data List: ");
////        System.out.println(completeDataList);
////        System.out.println("length : " +completeDataList.length);
////        System.out.println("len of each string : "+ completeDataList[3].length() );
//
//        System.out.println("Complete Data List : " + completeDataList.length);
//        Map<String,String> moviesYearMap = new HashMap<>();
//        for(String movieData : completeDataList){
//
//            String[] individualMovieDetails = movieData.split("-");
//            moviesYearMap.put(individualMovieDetails[0].replace("\"",""),individualMovieDetails[1].replace("\"",""));
//
//        }
//
////        System.out.println("Map : ");
////        System.out.println(moviesYearMap.size());
////        for(String key : moviesYearMap.keySet()){
////            System.out.println(key + " : " + moviesYearMap.get(key));
////
////        }
////
////        System.out.print("testing : ");
////        System.out.println("Nizhalgal : "+moviesYearMap.get("Nizhalgal"));
////
////        for(String key : moviesYearMap.keySet()){
////            String year = moviesYearMap.get(key);
////            List<String> yearWiseMovieList = yearMoviesMap.get(year);
////
////            if(yearWiseMovieList == null){
////                yearWiseMovieList = new ArrayList<>();
////                yearMoviesMap.put(year,yearWiseMovieList);
////            }
////            yearWiseMovieList.add(key);
////
////        }
////
////        System.out.println("length of year wise movie list : " + yearMoviesMap.size());
////
////        System.out.println("Year wise movie list");
////        for(String year : yearMoviesMap.keySet()){
////            System.out.println(year + " : " + yearMoviesMap.get(year));
////        }
//
//    }



    private String[] collectMovieData(String path)
    {
        BufferedReader readerObj= null;
        String data ;
        String completeData = "";
        String[] completeDataList = null;
        Map<String, List<String>> yearMoviesMap = new HashMap<>();

        try {
            readerObj = new BufferedReader(new FileReader(path));
            while((data = readerObj.readLine()) != null){
                // System.out.println("data : " + data);
                completeData += data ;
            }

            completeDataList  = completeData.split(",");
        } catch (Exception e) {
            e.printStackTrace();
        }



        System.out.println("Complete Data List : " + completeDataList.length);

        return completeDataList;
    }

}
