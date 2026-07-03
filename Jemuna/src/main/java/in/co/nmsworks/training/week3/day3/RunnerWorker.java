package in.co.nmsworks.training.week3.day3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class RunnerWorker {
    public static void main(String[] args) {
        RunnerWorker runnerWorker = new RunnerWorker();
        runnerWorker.readFile();

        Worker worker = new Worker();

    }

    private void readFile() {
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new BufferedReader(new FileReader("/home/nms-training/Downloads/WorkerDetails-Collection.txt")));
            Map<String ,Integer> workerMap = new HashMap<>();
            String line;
            while((line=bufferedReader.readLine())!=null){
                String[] array = line.split("\\|");
                System.out.println("Worker Data : "+array);

                int id = Integer.parseInt(array[0].trim());
                String name = array[1].trim();
                String dept = array[2].trim();
                String month = array[3].trim();
                int days = Integer.parseInt(array[4].trim());
                Worker worker = null;
                if (workerMap.containsKey(id)) {
                    worker.setWorkerID( workerMap.get(id));
                } else {
                    worker = new Worker(id, name, dept, new HashMap<>());
                    //workerMap.put(worker, id);
                }
                worker.getAttendance().put(month, days);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
