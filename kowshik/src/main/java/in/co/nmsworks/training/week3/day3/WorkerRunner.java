package in.co.nmsworks.training.week3.day3;

import java.io.*;
import java.util.*;

public class WorkerRunner {
    public static void main(String[] args) {

        WorkerRunner workerRunner = new WorkerRunner();
        Set<Worker> workerSet = workerRunner.getWorkerSetFromFile();
        workerRunner.writeWorkerDataToFile(workerSet);
    }

    private void writeWorkerDataToFile(Set<Worker> workerSet) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;

        try {
            fileWriter = new FileWriter("/home/nms-training/Desktop/attendance-report.txt");
            bufferedWriter = new BufferedWriter(fileWriter);

            for (Worker worker : workerSet) {

                for (int i = 0; i < 50; i++) {
                    bufferedWriter.write("=");
                }

                bufferedWriter.write("\n");
                bufferedWriter.write("ID : " + worker.getId() + "\n");
                bufferedWriter.write("Name : " + worker.getName() + "\n");
                bufferedWriter.write("Department : " + worker.getDept() + "\n");
                bufferedWriter.write("\n");

                int totalDaysWorked = 0;
                for (Map.Entry<String, Integer> entry : worker.getAttendance().entrySet()) {
                    bufferedWriter.write(entry.getKey() + " : " + entry.getValue() + "\n");
                    totalDaysWorked += entry.getValue();
                }

                bufferedWriter.write("\n");
                bufferedWriter.write("Total days worked : " + totalDaysWorked);
                bufferedWriter.write("\n");
            }

            for (int i = 0; i < 50; i++) {
                bufferedWriter.write("=");
            }

            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileWriter.close();
                bufferedWriter.close();
            }catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private Set<Worker> getWorkerSetFromFile() {
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        Set<Worker> workerSet = new HashSet<>();
        Map<String, Worker> idToWorkerMap = new HashMap<>();

        try {
            fileReader = new FileReader("/home/nms-training/Downloads/WorkerDetails-Collection.txt");
            bufferedReader = new BufferedReader(fileReader);

            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                String[] data = line.split("\\|");
                System.out.println(Arrays.toString(data));

                String workerId = data[0];
                System.out.println("Worker Id : " + workerId);

                if(!idToWorkerMap.containsKey(workerId)){
                    Worker worker = createWorkerObject(data);
                    workerSet.add(worker);
                    idToWorkerMap.put(workerId, worker);
                }

                idToWorkerMap.get(workerId).getAttendance().put(data[3], Integer.valueOf(data[4]));
            }

            System.out.println("ID TO WORKER MAP : " + idToWorkerMap);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
                bufferedReader.close();
            }catch (Exception e) {
                e.printStackTrace();
            }
        }

        System.out.println("Worker set size : " + workerSet.size());
        return workerSet;
    }

    private Worker createWorkerObject(String[] data) {
        Worker worker = new Worker(data[0], data[1], data[2]);
        worker.getAttendance().put(data[3], Integer.valueOf(data[4]));
        return worker;
    }
}
