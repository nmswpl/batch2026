package in.co.nmsworks.training.week3.day3;

import java.io.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RunnerWorker {
    public static void main(String[] args) {
        RunnerWorker runnerWorker =new RunnerWorker();
        runnerWorker.printDetails();

    }

    private void printDetails() {
        Set<String> setWork = new HashSet<>();
        Map<Integer,Worker> mapWork = new HashMap<>();

        BufferedReader br= null;
        BufferedWriter bw=null;

        try{
            br = new BufferedReader(new FileReader("/home/nms-training/Downloads/WorkerDetails-Collection.txt"));
            String line =" ";
            br.readLine();
            while((line = br.readLine()) !=  null){
                String data = line.replace("|",",");
                String[] separate=data.split(",");
                Worker works = new Worker();
                works.setWorkerId(separate[0]);
                works.setWorkerName(separate[1]);
                works.setDepartment(separate[2]);


                System.out.println(works);

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
