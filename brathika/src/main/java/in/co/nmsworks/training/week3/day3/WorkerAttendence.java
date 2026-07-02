package in.co.nmsworks.training.week3.day3;

import java.io.*;
import java.util.*;

public class WorkerAttendence {
    public static void main(String[] args) {
        WorkerAttendence workerAttendence = new WorkerAttendence();
        Set<String> workerSet = workerAttendence.readFile();
        Set<Worker> workerSet2 = workerAttendence.writeReport(workerSet);
        System.out.println(workerSet2);
//        List<Worker> workerList = new ArrayList<>();
//        workerList.addAll(workerSet2);
//        System.out.println(workerList);
        workerAttendence.countNoOfDaysPresent(workerSet2);
    }

    private void countNoOfDaysPresent(Set<Worker> workerSet2) {
        for (Worker worker : workerSet2) {
            System.out.println("Worker: "+worker.getWorkerId());
            System.out.println("Name: "+worker.getWorkerName());
            System.out.println("Department: "+worker.getWorkerDepartment());
            Map<String, Integer> monthToDays = worker.getAttendence();
            int count = 0;
            for (Map.Entry<String, Integer> entry : monthToDays.entrySet()) {
                count += entry.getValue();
                System.out.println(entry.getKey()+" - "+entry.getValue());

            }
            System.out.println("Total number of days: "+count);
        }
    }


    private Set<Worker> writeReport(Set<String> workerSet) {
        Set<Worker> workerSet1 = new HashSet<>();
        try {
            Map<String, Map<String, Integer >> attendenceMaptoId = new HashMap<>();
            BufferedWriter writer = new BufferedWriter(new FileWriter("/home/nms-training/Desktop/Attendence.txt"));
            for (String s : workerSet) {


                String[] array = s.split("\\|");
                String id = array[0];
                String name = array[1];
                String dept = array[2];
                Map<String, Integer> attendence = attendenceMaptoId.get(id);
                if (attendence == null ){
                    attendence = new HashMap<>();
                    attendenceMaptoId.put(id,attendence);
                }
                attendence.put(array[3],Integer.valueOf(array[4]));

                Worker worker = new Worker(id,name,dept,attendence);
                workerSet1.add(worker);
             //   System.out.println(worker);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return workerSet1;
    }

    private Set<String> readFile() {
        Set<String> workerSet = new HashSet<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("/home/nms-training/Downloads/WorkerDetails-Collection.txt"));
            reader.readLine();
            String text = "";
            while ((text = reader.readLine()) != null) {
                workerSet.add(text);

            }
            reader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return workerSet;
    }

}
