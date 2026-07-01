package in.co.nmsworks.training.week3.Day3;

import java.io.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WorkerRunner {
    public static void main(String[] args) throws IOException {
        WorkerRunner wr = new WorkerRunner();
        wr.workerDetails();
    }

    private void workerDetails() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("/home/nms-training/Downloads/WorkerDetails-Collection.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("/home/nms-training/Downloads//attendance-report.txt"));
        String line = "";
        Map<String, Worker> workerMap = new HashMap<>();
        br.readLine();
        try {
            while ((line = br.readLine()) != null) {

                String[] empData = line.split("\\|");
                String workerId = empData[0];
                String workerName = empData[1];
                String department = empData[2];
                String month = empData[3].trim();
                Integer daysWorked = Integer.valueOf(empData[4].trim());

                if (!workerMap.containsKey(workerId)) {
                    Map<String, Integer> attendance = new HashMap<>();
                    Worker wk = new Worker(workerId, workerName, department, attendance);
                    workerMap.put(workerId, wk);
                }

                if (workerMap.containsKey(workerId)) {
                    workerMap.get(workerId).getAttendance().put(month, daysWorked);
                }


            }
            Set<Worker> wkSet = new HashSet<>();
            for (Map.Entry<String, Worker> attendence : workerMap.entrySet()) {
                wkSet.add(attendence.getValue());
                System.out.println(attendence.getValue());

            }

            for (Worker wk : wkSet) {
                int totalDaysWorked = 0;
                for (int days : wk.getAttendance().values()) {
                    totalDaysWorked += days;
                }
                bw.write("Employee ID: " + wk.getWorkerId() + " | ");
                bw.write("Employee Name: " + wk.getWorkerName() + " | ");
                bw.write("Department: " + wk.getDepartment() + " | ");
                bw.write("Total Days Worked: " + totalDaysWorked);
                bw.write("\n");
            }
            br.close();
            bw.close();
            //System.out.println(wkSet);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
