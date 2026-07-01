package in.co.nmsworks.training.week3.day3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class AttendanceReportGenerator {
    public static void main(String[] args) {
        String inputFilePath = "/home/nms-training/Downloads/WorkerDetails-Collection.txt";
        String outputFilePath = "/home/nms-training/Downloads/attendance-report.txt";

        Map<String, Worker> workerMap = new HashMap<>();


        try (BufferedReader br = new BufferedReader(new FileReader(inputFilePath))) {
            String line;
            boolean isFirstLine = true;

            while ((line = br.readLine()) != null) {
                line = line.trim();


                if (line.isEmpty() || isFirstLine) {
                    isFirstLine = false;
                    continue;
                }


                String[] data = line.split("\\|");

                if (data.length == 5) {
                    String workerId = data[0].trim();
                    String workerName = data[1].trim();
                    String department = data[2].trim();
                    String month = data[3].trim();
                    int daysWorked = Integer.parseInt(data[4].trim());

                    Worker worker = workerMap.get(workerId);
                    if (worker == null) {
                        worker = new Worker(workerId, workerName, department);
                        workerMap.put(workerId, worker);
                    }

                    worker.addAttendance(month, daysWorked);
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading the input file: " + e.getMessage());
            return;
        } catch (NumberFormatException e) {
            System.err.println("Error parsing days worked: " + e.getMessage());
            return;
        }


        Set<Worker> workerSet = new HashSet<>(workerMap.values());


        String[] monthOrder = {"Jan", "Feb", "Mar", "Apr", "May", "Jun",
                "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputFilePath))) {
            for (Worker worker : workerSet) {
                bw.write("\n\n");
                bw.write("Worker : " + worker.getWorkerId() + "\n");
                bw.write("Name   : " + worker.getWorkerName() + "\n");
                bw.write("Dept   : " + worker.getDepartment() + "\n");


                for (String month : monthOrder) {
                    if (worker.getAttendance().containsKey(month)) {
                        bw.write(month + " : " + worker.getAttendance().get(month) + "\n");
                    }
                }

                bw.write("Total Days Worked : " + worker.getTotalDaysWorked() + "\n");
            }

            System.out.println("Report successfully generated: " + outputFilePath);

        } catch (IOException e) {
            System.err.println("Error writing to the output file: " + e.getMessage());
        }
    }
}