package in.co.nmsworks.training.week3.day3;

import java.io.*;
import java.util.*;

public class WorkerRun {
    public static void main(String[] args) {
        WorkerRun wr=new WorkerRun();
        wr.getWorkerDetails("/home/nms-training/Downloads/WorkerDetails-Collection.txt");

    }

    private void getWorkerDetails(String path) {
        BufferedReader bufferedReader=null;
        BufferedWriter bufferedWriter=null;
//        List<Worker> workerList=new ArrayList<>();
        try {
            bufferedReader=new BufferedReader(new FileReader(path));
            bufferedWriter=new BufferedWriter(new FileWriter("/home/nms-training/Downloads/WorkerOutput.txt"));
            bufferedReader.readLine();
            String line="";


            Map<String, Worker> workerMap=new HashMap<>();
            while ((line=bufferedReader.readLine())!=null)
            {
                String [] arr=line.split("\\|");
                Worker worker=workerMap.get(arr[0]);
                if(worker==null)
                {
                    worker=new Worker(arr[0],arr[1],arr[2],new HashMap<>());
                    workerMap.put(arr[0],worker);
                }

                worker.getAttendance().put(arr[3],Integer.parseInt(arr[4]));

            }
            List<Worker> workerList=new ArrayList<>((workerMap.values()));

            for (Worker worker : workerList) {
                bufferedWriter.write("Worker Id "+worker.getWorkerId()+" \nWorker Name : "+worker.getWorkerName()+"\n");
                bufferedWriter.write("Dept : "+worker.getDept()+"\n");

                Integer workingDays=0;
                for (Map.Entry<String, Integer> entry : worker.getAttendance().entrySet()) {
                    bufferedWriter.write(" "+entry.getKey()+" : "+entry.getValue()+" ");
                    workingDays += entry.getValue();
                }

                bufferedWriter.write("\nTotal Days worked: "+workingDays+"\n");
                bufferedWriter.write("======================================\n");
            }

                bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                bufferedReader.close();
                bufferedWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
