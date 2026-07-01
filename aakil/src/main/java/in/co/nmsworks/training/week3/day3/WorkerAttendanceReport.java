package in.co.nmsworks.training.week3.day3;

import java.io.*;
import java.util.*;

public class WorkerAttendanceReport {
    public static void main(String[] args) {
        WorkerAttendanceReport report = new WorkerAttendanceReport();
        Set<Worker> workers = report.getWorkerDetails();
        workers.forEach(System.out::println);

        String workerId = "W004";
        report.generateReport(workers, workerId);
    }

    private void generateReport(Set<Worker> workers, String workerId) {
        BufferedWriter writer = null;

        try {
            Worker worker = getWorker(workers, workerId);
            writer = new BufferedWriter(new FileWriter("src/main/java/in/co/nmsworks/training/week3/day3/data/attendance-report.txt"));
            writer.write("*******************************************************************************\n");
            writer.write("\t\t\tATTENDANCE REPORT\n");
            writer.write("********************************************************************************\n");
            writer.write("WORKER ID   : " + worker.getWorkerId() + "\n");
            writer.write("NAME        : " + worker.getWorkerName() + "\n");
            writer.write("DEPARTMENT  : " + worker.getDepartment() + "\n");
            writer.write("--------------------------------------------------------------------------------\n");

            for (String month : worker.getAttendance().keySet()) {
                writer.write(month + " : " + worker.getAttendance().get(month) + "\n");
            }
            writer.write("--------------------------------------------------------------------------------\n");

            int totalDays = worker.getAttendance().values().stream().mapToInt(Integer::intValue).sum();
            writer.write("TOTAL DAYS WORKED = " + totalDays + "\n");
            writer.write("======================================================================================n");
        } catch (Exception e) {
            System.err.println("ERROR : " + e.getMessage());
        } finally {
            try {
                writer.close();
            } catch (IOException e) {
                System.err.println("ERROR : " + e.getMessage());
            }
        }
    }

    private static Worker getWorker(Set<Worker> workers, String workerId) {
        Worker w = new Worker(workerId);
        for (Worker worker : workers) {
            if (worker.equals(w)) {
                return worker;
            }
        }
        return null;
    }

    private Set<Worker> getWorkerDetails() {
        Set<Worker> workers = new HashSet<>();
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader("src/main/java/in/co/nmsworks/training/week3/day3/data/WorkerDetails-Collection.txt"));
            String line;
            reader.readLine();
            while((line = reader.readLine()) != null){
                String[] details = line.split("\\|");
                Worker worker = getWorker(workers, details[0]);

                if(worker == null){
                    Map<String, Integer> attendance = new HashMap<>();
                    worker = new Worker(details[0], details[1], details[2], attendance);
                    workers.add(worker);
                }
                worker.getAttendance().put(details[3], Integer.valueOf(details[4]));
            }
        } catch (Exception e) {
            System.err.println("ERROR : " + e.getMessage());
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                System.err.println("ERROR : " + e.getMessage());
            }
        }
        return workers;
    }
}
