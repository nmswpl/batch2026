package in.co.nmsworks.training.week3.day3;


import java.io.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WorkerFileParsing {

    public static void main(String[] args) {

        Set<Worker> workerSet = readFromFile();
        writeReport(workerSet);

    }

    private static void writeReport(Set<Worker> set) {
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("/home/nms-training/Downloads/attendance-report.txt")))
        {
            bufferedWriter.write("WORKER ATTENDANCE DETAILS : \n\n");

            for (Worker worker : set) {

                int totalWorkingDays = 0;

                for (Integer value : worker.getAttendance().values()) {
                    totalWorkingDays += value;
                }

                bufferedWriter.write("WorkerId = "+worker.getWorkerId()+"\n");
                bufferedWriter.write("WorkerName = "+worker.getWorkerName()+"\n");
                bufferedWriter.write("WorkerName = "+worker.getDepartment()+"\n");
                bufferedWriter.write("Attendance for month = "+worker.getAttendance()+"\n");
                bufferedWriter.write("\nTotal working Days = "+totalWorkingDays+"\n");
                bufferedWriter.write("\n\n=======================================================================\n\n");

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Set<Worker> readFromFile() {
        Set<Worker> set = new HashSet<>();

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("/home/nms-training/Downloads/WorkerDetails-Collection.txt")))
        {
            bufferedReader.readLine();
            String line = "";

            while ((line = bufferedReader.readLine()) != null)
            {
                String[] oneLine = line.split("\\|");

                String id = oneLine[0];
                String name = oneLine[1];
                String department = oneLine[2];
                boolean isAttendancePresent = false;

                for (Worker worker : set) {
                    if( worker.getWorkerId().equals(id) )
                    {
                        worker.getAttendance().put(oneLine[3], Integer.parseInt(oneLine[4]));
                        isAttendancePresent = true;
                        break;
                    }
                }

                if(isAttendancePresent == false)
                {
                    Map<String,Integer> oneMonthAttendance = new HashMap<>();
                    oneMonthAttendance.put(oneLine[3], Integer.parseInt(oneLine[4]));

                    set.add(new Worker(id,name,department,oneMonthAttendance));
                }

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return set;
    }

}
