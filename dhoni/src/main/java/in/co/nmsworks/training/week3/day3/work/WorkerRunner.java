package in.co.nmsworks.training.week3.day3.work;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class WorkerRunner {
    public static void main(String[] args) throws IOException {

        WorkerRunner workerRunner = new WorkerRunner();
        Map<String,Worker> map = workerRunner.getMapOfWorks();
        Set<Worker> workSet = workerRunner.getSet(map);

        workerRunner.printWorkerAttendance(workSet);
    }

    private  Set<Worker> getSet(Map<String, Worker> map) {
        Set<Worker> workSet = new HashSet<>();
        for(Map.Entry<String,Worker> m : map.entrySet()){
            //System.out.println(m.getKey() + " " + m.getValue());
            workSet.add(m.getValue());
        }
        return workSet;
    }

    private void printWorkerAttendance(Set<Worker> workSet) {

        System.out.println("Worker Attendance");
        for(Worker worker : workSet){
            System.out.println();
            System.out.println("Worker : " + worker.getWorkerId());
            System.out.println("Name : " + worker.getWorkerName());
            System.out.println("Dept : " + worker.getDepartment());

            int totalDays = 0;
            for(Map.Entry<String, Integer> months : worker.getAttendance().entrySet()){
                System.out.println(months.getKey() + " : " + months.getValue());
                totalDays = totalDays + months.getValue();
            }

            System.out.println("Total Days Worked : " + totalDays);
            System.out.println();
        }

    }

    private Map<String,Worker> getMapOfWorks() throws IOException {

        Map<String, Worker > map = new HashMap<>();
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader("/home/nms-training/Downloads/WorkerDetails-Collection.txt"));
            String line = "";

            while((line = bufferedReader.readLine()) != null){
                //System.out.println(line);
                String[] elements = line.split("\\|");
                //System.out.println(elements[0] + " " + elements[1] + " " + elements[2] + " " + elements[3]);

                map.putIfAbsent(elements[0], new Worker(elements[0],elements[1],elements[2]));
                map.get(elements[0]).getAttendance().replace(elements[3],Integer.parseInt(elements[4]));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return map;
    }
}
