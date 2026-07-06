package in.co.nmsworks.training.Week3.Map.Day3;

import java.util.Map;

public class WorkerRunner {

    public static void main(String[] args) {

        Map<String, Worker> workers = WorkerDetails.readWorkers();

        for (Worker worker : workers.values()) {
            System.out.println(worker);
        }

        WorkerDetails.writeReport(workers);

        System.out.println("Report Generated Successfully");
    }
}