package in.co.nmsworks.training.week3.day3;
import java.io.*;
import java.util.*;

public class WorkerRunner {

    public static void main(String[] args) {

        Set<Worker> workers = new HashSet<>();
        Map<String, Worker> workerMap = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader("/home/nms-training/Downloads/WorkerDetails-Collection.txt"))) {

            String line;

            while ((line = br.readLine()) != null) {

                String[] data = line.split("\\|");
                for(String s : data){
                System.out.println(s);}
                String id = data[0];
                String name = data[1];
                String dept = data[2];
                String month = data[3];
                int daysWorked = Integer.parseInt(data[4]);

                Worker worker;

                if (workerMap.containsKey(id)) {
                    worker = workerMap.get(id);
                } else {
                    worker = new Worker(id, name, dept);
                    workerMap.put(id, worker);
                    workers.add(worker);
                }

                worker.addAttendance(month, daysWorked);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try (PrintWriter pw = new PrintWriter(new FileWriter("/home/nms-training/Downloads/attendance-report.txt"))) {

            String[] months = {"Jan","Feb","Mar","Apr","May","Jun",
                    "Jul","Aug","Sep","Oct","Nov","Dec"};

            for (Worker worker : workers) {

                pw.println("==================================================");
                pw.println("Worker : " + worker.getWorkerId());
                pw.println("Name   : " + worker.getWorkerName());
                pw.println("Dept   : " + worker.getDepartment());

                for (String month : months) {
                    int days = worker.getAttendance().getOrDefault(month, 0);
                    pw.println(month + " : " + days);
                }

                pw.println("Total Days Worked : " + worker.getTotalDaysWorked());
                pw.println("==================================================");
                pw.println();
            }

            System.out.println("Attendance report generated successfully.");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}


