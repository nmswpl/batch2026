package in.co.nmsworks.training.Week3.Map.Day3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

public class WorkerDetails {

    public static Map<String, Worker> readWorkers() {

        Map<String, Worker> workers = new LinkedHashMap<>();

        try (BufferedReader br = new BufferedReader(
                new FileReader("/home/nms-training/Downloads/WorkerDetails-Collection.txt"))) {

            br.readLine();

            String line;

            while ((line = br.readLine()) != null) {

                String[] data = line.split("\\|");

                if (data.length != 5) {
                    continue;
                }

                String id = data[0].trim();
                String name = data[1].trim();
                String department = data[2].trim();
                String month = data[3].trim();
                int days = Integer.parseInt(data[4].trim());

                workers.putIfAbsent(id, new Worker(id, name, department));

                workers.get(id).getAttendance().put(month, days);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return workers;
    }

    public static void writeReport(Map<String, Worker> workers) {

        String[] months = {
                "Jan", "Feb", "Mar", "Apr",
                "May", "Jun", "Jul", "Aug",
                "Sep", "Oct", "Nov", "Dec"
        };

        try (BufferedWriter bw = new BufferedWriter(
                new FileWriter("/home/nms-training/Desktop/report.txt"))) {

            for (Worker worker : workers.values()) {

                bw.write("=================================================");
                bw.newLine();

                bw.write("Worker : " + worker.getWorkerId());
                bw.newLine();

                bw.write("Name   : " + worker.getWorkerName());
                bw.newLine();

                bw.write("Dept   : " + worker.getDepartment());
                bw.newLine();

                int total = 0;

                for (String month : months) {

                    Integer days = worker.getAttendance().get(month);

                    if (days != null) {
                        bw.write(month + " : " + days);
                        bw.newLine();
                        total += days;
                    }
                }

                bw.write("Total Days Worked : " + total);
                bw.newLine();

                bw.write("=================================================");
                bw.newLine();
                bw.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}