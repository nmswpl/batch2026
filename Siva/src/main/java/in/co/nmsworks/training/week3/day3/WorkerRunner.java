package in.co.nmsworks.training.week3.day3;

import java.io.*;
import java.util.*;

public class WorkerRunner{
    public static void main(String[] args) {
        WorkerRunner wr = new WorkerRunner();
        wr.readFile("/home/nms-training/Downloads/WorkerDetails-Collection.txt");
    }

    private void readFile(String filePath) {
        Map<String, Map<String, Integer>> idToAttendance=  new HashMap<>();
        Map<String, Worker> idToWorker = new HashMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath));) {
            String text = "";
            reader.readLine();
            while ((text = reader.readLine()) != null) {
                String[] eachWorkerInfo = text.split("\\|");
                String id = eachWorkerInfo[0];
                String name = eachWorkerInfo[1];
                String dept = eachWorkerInfo[2];
                Worker worker = new Worker(id,name,dept,null);
                idToWorker.put(id, worker);
                Map<String, Integer> currentAttendance = idToAttendance.get(id);
                if (currentAttendance == null) {
                    currentAttendance = new HashMap<>();
                    idToAttendance.put(id, currentAttendance);
                }
                currentAttendance.put(eachWorkerInfo[3],Integer.parseInt(eachWorkerInfo[4]));
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        for (String key : idToAttendance.keySet()) {
            Worker worker = idToWorker.get(key);
            worker.setAttendance(idToAttendance.get(key));
        }
        for (String key : idToWorker.keySet()) {
            System.out.println(idToWorker.get(key));
        }
        WorkerRunner wr = new WorkerRunner();
        for (String id : idToWorker.keySet()) {
            wr.generateReport(idToWorker.get(id));
        }

    }

    private void generateReport(Worker worker) {
        String filePath = "/home/nms-training/Desktop/"+worker.getWorkerId()+"Report.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));){
            writer.write("============================================================================\n");
            writer.write("Worker : "+worker.getWorkerId()+"\nName : "+worker.getWorkerName()+"\nDept : "+worker.getDepartment()+"\n\n");
            Integer countDays = 0;
            for (String month : worker.getAttendance().keySet()) {
                writer.write(month+" : "+worker.getAttendance().get(month)+"\n");
                countDays += worker.getAttendance().get(month);
            }
            writer.write("\nTotalDays Worked : "+countDays);
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
