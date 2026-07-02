package in.co.nmsworks.training.week3.day3;

import java.io.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WorkerRunner {
    public static void main(String[] args) {
        WorkerRunner workerRunner =  new WorkerRunner();
        workerRunner.fileParsing();
    }

    private void fileParsing() {
        Set<Worker> workerSet = new HashSet<>();
        Map<String,Worker> workerMap = new HashMap<>();

        try(BufferedReader reader = new BufferedReader(new FileReader("/home/nms-training/Desktop/WorkerDetails-Collection.txt"))) {
            String line = reader.readLine();
            while ((line = reader.readLine()) != null) {
                String[] eachLine = line.split("\\|");

                String id = eachLine[0];
                String name = eachLine[1];
                String dept = eachLine[2];
                String month = eachLine[3];
                Integer daysWorked = Integer.parseInt(eachLine[4]);

                Worker worker = workerMap.get(id);
                if(worker == null){
                    worker = new Worker(id,name,dept);
                    Map<String,Integer> attendence = new HashMap<>();
                    attendence.put(month,daysWorked);

                    worker.setAttendance(attendence);

                    workerMap.put(id,worker);
                }
                else{
                    worker.getAttendance().put(month,daysWorked);
                }

            }
            workerSet.addAll(workerMap.values());
            writeToFile(workerSet);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void writeToFile(Set<Worker> workerSet) {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("/home/nms-training/Desktop/WorkerInfo.txt"))){
            for (Worker worker : workerSet) {
                int total = 0;
                writer.write("Id: " + worker.getWorkerId());
                writer.newLine();
                writer.write("Name: " + worker.getWorkerName());
                writer.newLine();
                writer.write("Dept: " + worker.getWorkerDept());
                writer.newLine();
                for (Integer value : worker.getAttendance().values()) {
                    total+=value;
                }
                writer.write("Total working days: "+ total);
                writer.newLine();
                writer.newLine();
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
