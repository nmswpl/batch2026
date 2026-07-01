package in.co.nmsworks.training.week3.day3;

import java.io.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WorkerReport {
    public static void main(String[] args) {
        try {
            WorkerReport report = new WorkerReport();
            Set<Worker> workers = report.generateWorkerSet();
            workers.forEach(System.out::println);
            String workerId = "W001";
            report.generateReport(workers,workerId);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void generateReport(Set<Worker> workers, String workerId) throws IOException {
        Worker worker = getWorker(workers, workerId);
        BufferedWriter writer = new BufferedWriter(new FileWriter("/home/nms-training/Desktop/attendance-report.txt"));
        writer.write("ATTENDANCE REPORT\n");
        writer.write("Worker ID  : " + worker.getWorkerId() + "\n");
        writer.write("Name       : " + worker.getWorkerName() + "\n");
        writer.write("Department  : " + worker.getDepartment() + "\n");
        writer.write("--------------------------------------------------------------------------------\n");
        for (String month : worker.getAttendance().keySet()) {
            writer.write(month + " : " + worker.getAttendance().get(month) + "\n");
        }
        int count = 0;
        for (Worker w : workers) {
            if(w.getWorkerId().equals(workerId)){
                for (String s : w.getAttendance().keySet()) {
                    count += w.getAttendance().get(s);
                }
            }
        }
        writer.write("Total no of days Count for " + workerId + " :: " + count);
        System.out.println("Finished");
        writer.close();
    }

    private Worker getWorker(Set<Worker> workers, String id) {
        Worker w = new Worker(id);
        for (Worker worker : workers) {
            if (w.equals(worker)) {
                return worker;
            }
        }
        return null;
    }

    private Set<Worker> generateWorkerSet() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("/home/nms-training/Downloads/attendance.txt"));
        Set<Worker> workers= new HashSet<>();
        String line = "";
        reader.readLine();
        while((line= reader.readLine()) != null){
            String[] words = line.split("\\|");
            Worker worker = getWorker(workers,words[0]);
            if(worker==null) {
                Map<String, Integer> map = new HashMap<>();
                worker = new Worker(words[0], words[1], words[2], map);
                workers.add(worker);
            }
            worker.getAttendance().put(words[3],Integer.parseInt(words[4]));
        }
        return workers;
    }
}
