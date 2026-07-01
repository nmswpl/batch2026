package in.co.nmsworks.training.week3.day3;

import javafx.scene.effect.SepiaTone;

import java.io.*;
import java.util.*;

import static java.lang.Integer.parseInt;

public class WorkerRunner {
    public static void main(String[] args) {
        WorkerRunner workerRunner = new WorkerRunner();
        Set<Worker> workers = workerRunner.printDetails();
        String id = "W007";
        workerRunner.generateReport(workers, id);

    }

    private void generateReport(Set<Worker> workers, String id) {
        for (Worker worker : workers) {
            if (worker.getWorkerId().equals(id)){
                try {
                    int total = 0;

                    for (String key : worker.getAttendance().keySet()){

                        total += worker.getAttendance().get(key);
                    }

                    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("/home/nms-training/Desktop/attendanceReports.txt"));
                    bufferedWriter.write("Id "+worker.getWorkerId());
                    bufferedWriter.newLine();
                    bufferedWriter.write("name "+worker.getWorkerName());
                    bufferedWriter.newLine();
                    bufferedWriter.write("dept "+worker.getDepartment());
                    bufferedWriter.newLine();
                    bufferedWriter.write("Attendance "+worker.getAttendance().toString());
                    bufferedWriter.newLine();
                    bufferedWriter.write("total : "+String.valueOf(total));
                    bufferedWriter.close();

                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                return;
            }

        }
    }

    private static Set<Worker> printDetails() {
        int total = 0;
        Set<Worker> set = new LinkedHashSet();
        try {
            FileReader fileReader = new FileReader("/home/nms-training/Downloads/WorkerDetails-Collection.txt");

            Map<String, Integer> attendance = new HashMap<>();
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                String[] strArray = line.split("\\|");


                if (strArray[4].length() > 0) {
                    attendance.put(strArray[3], Integer.valueOf(strArray[4]));

                }


                set.add(new Worker(strArray[0], strArray[1], strArray[2], attendance));


            }
            for (Worker worker : set) {


                for (String s : worker.attendance.keySet()) {
                    total += attendance.get(s);

                }
                System.out.println("Id :" + worker.getWorkerId() + " Name: " + worker.getWorkerName() + " Dept :" + worker.getDepartment() + " month: " + worker.getAttendance() + "total " + total);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return set;

    }
}
