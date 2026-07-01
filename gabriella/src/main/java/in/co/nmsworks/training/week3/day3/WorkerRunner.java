package in.co.nmsworks.training.week3.day3;

import java.io.*;
import java.util.*;

public class WorkerRunner {
    public static void main(String[] args) {
        WorkerRunner workerRunner = new WorkerRunner();
        List<String> workerList = getWorkerList();
        //System.out.println(workerList);

        Set<Worker> workerSet = getWorkerSet(workerList);
        System.out.println(workerSet);

        workerRunner.writeAttendanceReport(workerSet);

    }

    private void writeAttendanceReport(Set<Worker> workerSet) {
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter("/home/nms-training/Desktop/attendance-report.txt"));
            for (Worker worker : workerSet) {
                bufferedWriter.write("=========================================================" + "\n");
                bufferedWriter.write("Worker: " + worker.getWorkerId() + "\n");
                bufferedWriter.write("Name: " + worker.getWorkerName() + "\n");
                bufferedWriter.write("Dept: " + worker.getDepartment() + "\n" + "\n");
                for (String s : worker.getAttendance().keySet()) {
                    bufferedWriter.write(s + ": " + worker.getAttendance().get(s) + "\n");
                }
                Integer totalDays = 0;
                for (Integer value : worker.getAttendance().values()) {
                    totalDays += value;
                }
                bufferedWriter.write("Total Days Worked: " + totalDays + "\n");
                bufferedWriter.write("=========================================================" + "\n" + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.flush();
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    private static Set<Worker> getWorkerSet(List<String> workerList) {
        Set<Worker> workerSet = new HashSet<>();
        Map<String, Worker> workerMap = new HashMap<>();
        for (String s : workerList) {

            String[] splitS = s.split("\\|");
            String id = splitS[0];
            String name = splitS[1];
            String dept = splitS[2];
            String month = splitS[3];
            Integer days = Integer.valueOf(splitS[4]);

            Worker worker = workerMap.get(id);
            if (worker == null){
                Map<String, Integer> attendance = new HashMap<>();
                attendance.put(month, days);
                worker = new Worker(id, name, dept ,attendance);
                workerMap.put(id, worker);
            } else {
                worker.getAttendance().put(month, days);
            }
            workerSet.add(worker);

        }
        return workerSet;
    }

    private static List<String> getWorkerList() {
        List<String> workers = new ArrayList<>();
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader("/home/nms-training/Desktop/attendance.txt"));
            String line = "";
            bufferedReader.readLine();
            while ((line = bufferedReader.readLine()) != null) {
                workers.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return workers;
    }


}
