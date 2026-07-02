package in.co.nmsworks.training.week3.day3;

import java.io.*;
import java.util.*;

public class WorkerFileParsing {
    public static void main(String[] args) {
        WorkerFileParsing workerFileParsing = new WorkerFileParsing();
        workerFileParsing.readWriteFile();

    }



    private void readWriteFile() {
//        Set<Worker> workerSetist = null;
        Map<String, Worker> idWorkerMap = new HashMap<>();


        BufferedWriter bw = null;
        try {
            FileReader fr = new FileReader("/home/nms-training/Downloads/WorkerDetails-Collection.txt");
            BufferedReader br = new BufferedReader(fr);
            FileWriter fw = new FileWriter("/home/nms-training/Downloads/attendanceReport.txt");
            bw = new BufferedWriter(fw);


            String line = "";
            Set<Worker> workerSet = new HashSet<>();
            String[] details = null;
            int totalDaysWorked = 0;

            while ((line = br.readLine()) != null) {
                details = line.split("\\|");


                String id = details[0];
                String name = details[1];
                String dept = details[2];
                String month = details[3];
                int daysWorked = Integer.parseInt(details[4]);

                Map<String, Integer> attendanceMap = new HashMap<>();


                if (!idWorkerMap.containsKey(id)) {
                    Worker worker = new Worker(id, name, dept, attendanceMap);
                    worker.getAttendance().put(month, daysWorked);
                    workerSet.add(worker);
                    idWorkerMap.put(id, worker);
                }
                idWorkerMap.get(id).getAttendance().put(month, daysWorked);

                for (Worker worker : workerSet) {
                    bw.write("id : "+ worker.getId() + "\n");
                    bw.write("name : " + worker.getName() + "\n");
                    bw.write("dept : " + worker.getDept() + "\n");
                    for (Map.Entry<String, Integer> data : attendanceMap.entrySet()) {
                        bw.write("month : " + data.getKey() + " : " + data.getValue());
                        totalDaysWorked += data.getValue();
                    }
                    bw.write("worked days : " + totalDaysWorked);

                }

            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {
                bw.flush();
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
