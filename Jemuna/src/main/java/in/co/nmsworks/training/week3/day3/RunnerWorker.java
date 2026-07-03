package in.co.nmsworks.training.week3.day3;

import java.io.*;
import java.util.*;

public class RunnerWorker {
    public static void main(String[] args) {

        readAttendanceRecord();
        generateWorkerReport();
    }

    private static void generateWorkerReport() {

        Collection<Worker> indivWorker = readAttendanceRecord();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("C:/Users/jemun/Downloads/IndividualWorkerDetails-Collection.txt"))) {

            String[] months = {
                    "Jan", "Feb", "Mar", "Apr", "May", "Jun",
                    "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"
            };
            for (Worker worker : indivWorker) {
                writer.write("=====================================================");
                writer.newLine();
                writer.write("Worker : W" + String.format("%03d", worker.getWorkerID()));
                writer.newLine();
                writer.write("Name : " + worker.getWorkerName());
                writer.newLine();
                writer.write("Dept : " + worker.getDepartment());
                writer.newLine();
                int total =0;
                for (String month : months) {
                    int days = worker.getAttendance().getOrDefault(month,0);
                    writer.write(month +" : "+ days);
                    writer.newLine();
                    total+=days;
                }
                writer.write("Today Days Worked : "+ total);
                writer.newLine();

            }


        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static Set<Worker> readAttendanceRecord() {
        Map<Integer, Worker> workerListMap = new HashMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("C:/Users/jemun/Downloads/WorkerDetails-Collection.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] list = line.split("\\|");
                System.out.println(Arrays.toString(list));
                int workerId = Integer.parseInt(list[0].replace("W", "").trim());
                String workerName = list[1];
                String dept = list[2];
                String month = list[3];
                int days = Integer.parseInt(list[4]);
                if (workerListMap.containsKey(workerId)) {
                    Worker existingWorker = workerListMap.get(workerId);
                    existingWorker.getAttendance().put(month, days);
                } else {
                    Map<String,Integer> attendance = new HashMap<>();
                    attendance.put(month,days);
                    Worker worker = new Worker(workerId, workerName, dept, attendance);
                    workerListMap.put(workerId, worker);
                }
            }
            System.out.println("List of workers : ");

            for (Map.Entry<Integer, Worker> entry : workerListMap.entrySet()) {


            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return new HashSet<>(workerListMap.values());

    }
}


