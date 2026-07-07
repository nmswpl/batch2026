package in.co.nmsworks.training.week3.day3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WorkerRunner {
    public static void main(String[] args) {
        WorkerRunner workerRunner = new WorkerRunner();
        Set<Worker> workerObject = workerRunner.readFromFile();
        Set<Worker> workerObject1 = workerRunner.writeReport(workerObject);


    }

    private Set<Worker> writeReport(Set<Worker> workerObject) {
        return null ;
    }

    private Set<Worker> readFromFile() {
        BufferedReader bufferedReader = null;
        Set<Worker> workerObject = new HashSet<>();
        Map<String, Worker> workerMap = new HashMap<>();

        try {
            bufferedReader = new BufferedReader(new FileReader("/home/nms-training/Downloads/WorkerDetails-Collection.txt"));
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                 String[] workers = line.split("\\|");
                    String id = workers[0];
                    String name = workers[1];
                    String dept = workers[2];
                    String month = workers[3];
                    Integer days = Integer.parseInt(workers[4]);
                    if (workerMap.containsKey(id)) {
                        Worker existingWorker = workerMap.get(id);
                        existingWorker.getAttendance().put(month,days);
                        workerObject.add(existingWorker);
                    }
                    else {
                        Map<String,Integer> attendance = new HashMap<>();
                        attendance.put(month, days);
                        Worker worker = new Worker(id, name, dept, attendance);
                        workerMap.put(id, worker);
                        workerObject.add(worker);
                    }
            }
            System.out.println(workerObject.toString());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
               e.printStackTrace();
            }
        }
        return workerObject;
    }
}
