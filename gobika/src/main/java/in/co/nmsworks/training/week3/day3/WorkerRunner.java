package in.co.nmsworks.training.week3.day3;

import java.io.*;
import java.util.*;

public class WorkerRunner {
    public static void main(String[] args) {
        WorkerRunner workerRunner = new WorkerRunner();
        Set<Worker> workerSet = workerRunner.readFile();
        workerRunner.writeReport(workerSet);
    }

    private void writeReport(Set<Worker> workerSet) {
        for (Worker worker : workerSet) {
            try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("/home/nms-training/Documents/Worker_Details/"+worker.getWorkerId() +".txt"))){
                bufferedWriter.write("=========================================================================\nWorker : " + worker.getWorkerId() +"\nName : " + worker.getWorkerName() + "\nDept : "+ worker.getDept() );
                Integer totalNoOfDays = 0;
                List<String> months = Arrays.asList("Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec");
                for (String month : months) {
                    bufferedWriter.write("\n"+month +" = "+worker.getAttendance().get(month));
                    totalNoOfDays += worker.getAttendance().get(month);
                }
                bufferedWriter.write("\nTotal number of Days : "+ totalNoOfDays + "\n======================================================================");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private Set<Worker> readFile() {
        Set<Worker> workerSet = new HashSet<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("/home/nms-training/Downloads/WorkerDetails-Collection.txt"));){
            Map<String,Map<String,Integer>> attendanceMap = new HashMap<>();
            String line = bufferedReader.readLine();
            while ((line = bufferedReader.readLine()) != null) {
                String[] worker = line.split("\\|");

                Worker workerObj = null;
                String id = worker[0];
                String name = worker[1];
                String dept = worker[2];
                String month = worker[3];
                Integer days = Integer.valueOf(worker[4]);
                Map<String,Integer> attendance = attendanceMap.get(id);
                if (attendance == null){
                    attendance = new HashMap<>();
                    attendanceMap.put(id,attendance);
                    workerObj = new Worker(id, name, dept, attendance);
                    workerSet.add(workerObj);
                }
                attendance.put(month, days);

            }
            for (Worker worker : workerSet) {
                System.out.println(worker);
            }
        }
        catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return workerSet;
    }
}
