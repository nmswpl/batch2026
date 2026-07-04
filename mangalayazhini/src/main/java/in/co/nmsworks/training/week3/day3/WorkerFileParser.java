package in.co.nmsworks.training.week3.day3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class WorkerFileParser {
    public static void main(String[] args) {

        WorkerFileParser workerFileParser = new WorkerFileParser();
        Map<Worker,Map<String, Integer>> workerObjMappedAttendence  = workerFileParser.readFromFile("/home/nms-training/Downloads/WorkerDetails-Collection.txt");

        for (Worker worker : workerObjMappedAttendence.keySet()) {
            System.out.println("Id : " + worker.getId());
            System.out.println("Name : " + worker.getName());
            System.out.println("Dept : " + worker.getDept());
            System.out.println(workerObjMappedAttendence.get(worker));
            Collection<Integer> workedDays =  workerObjMappedAttendence.get(worker).values();
            int noOfWorkedDays = 0 ;
            for (Integer workedDay : workedDays) {
                noOfWorkedDays += workedDay;
            }
            System.out.println("Total worked days : " + noOfWorkedDays);
        }

//        workerFileParser.generateAttendReport();


    }

//    private void generateAttendReport(Worker worker ,Map<Worker,Map<String, String>> workerObjMappedAttendence) {
//        System.out.println(worker);
//        workerObjMappedAttendence.get(worker);
//    }


    private Map<Worker,Map<String,Integer>> readFromFile(String path) {
        Map<Worker, Map<String,Integer>> workerAttMap = new HashMap<>();
        String str;
        try(BufferedReader readerObj = new BufferedReader(new FileReader(path))){
            while((str = readerObj.readLine()) != null){
                String[] strList = str.split("\\|");
                System.out.println(strList[0] + " " + strList[1] + " " + strList[2] + " " + strList[3] + " " + strList[4]);
                Worker worker = new Worker(strList[0],strList[1], strList[2]);
                Map<String,Integer> attMap = workerAttMap.get(worker);
                if(attMap == null){
                    attMap = new HashMap<>();
                    workerAttMap.put(worker,attMap);
                }
                attMap.put(strList[3],Integer.parseInt(strList[4]));

            }
            System.out.println("length : " + workerAttMap.size());

        }catch(Exception e){
            e.printStackTrace();
        }

        return workerAttMap;
    }


}
