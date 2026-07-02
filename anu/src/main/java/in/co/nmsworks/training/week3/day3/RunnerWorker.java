package in.co.nmsworks.training.week3.day3;

import java.io.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RunnerWorker {
    public static void main(String[] args) {
        RunnerWorker rw = new RunnerWorker();
        rw.printDetails();
    }

    private void printDetails() {
        Map<String, Worker> workerMap = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader("/home/nms-training/Downloads/WorkerDetails-Collection.txt"));
             BufferedWriter bw = new BufferedWriter (new FileWriter("/home/nms-training/Downloads/attendance-report.txt"))
        )
        {
            br.readLine();
            String line = " ";
            while ((line = br.readLine()) != null) {
                String separate = line.replace("|",",");
                String[] data=separate.split(",");

                String workerId = data[0];
                String workerName = data[1];
                String department = data[2];
                String month = data[3];
                int daysWorked = Integer.parseInt(data[4]);

                Worker worker = workerMap.get(workerId);
                if (worker == null) {
                    worker = new Worker();
                    worker.setWorkerId(workerId);
                    worker.setWorkerName(workerName);
                    worker.setDepartment(department);

                    workerMap.put(workerId, worker);
                }
                worker.getAttendance().put(month, daysWorked);
            }

            Set<Worker> workerSet = new HashSet<>(workerMap.values());

            for (Worker worker : workerSet) {
                int total = 0;
                for (Integer days : worker.getAttendance().values()) {
                    total += days;
                }
                bw.write("\n");
                bw.write("Worker Id : " + worker.getWorkerId() + "\n");
                bw.write("Worker Name : " + worker.getWorkerName() + "\n");
                bw.write("Department : " + worker.getDepartment() + "\n");
                bw.write("Attendance : " + worker.getAttendance() + " \n");
                bw.write("Total Days Worked : " + total +"\n");
                bw.write("-----------------");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}