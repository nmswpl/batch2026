package in.co.nmsworks.training.week3.day3;

import java.util.HashMap;
import java.util.Map;

public class Worker {
    String workerId;
    String workerName;
    String workerDepartment;
    Map<String, Integer> attendence = new HashMap<>();

    public Worker() {
    }

    public Worker(String workerId, String workerName, String workerDepartment, Map<String, Integer> attendence) {
        this.workerId = workerId;
        this.workerName = workerName;
        this.workerDepartment = workerDepartment;
        this.attendence = attendence;
    }

    public String getWorkerId() {
        return workerId;
    }

    public void setWorkerId(String workerId) {
        this.workerId = workerId;
    }

    public String getWorkerName() {
        return workerName;
    }

    public void setWorkerName(String workerName) {
        this.workerName = workerName;
    }

    public String getWorkerDepartment() {
        return workerDepartment;
    }

    public void setWorkerDepartment(String workerDepartment) {
        this.workerDepartment = workerDepartment;
    }

    public Map<String, Integer> getAttendence() {
        return attendence;
    }

    public void setAttendence(Map<String, Integer> attendence) {
        this.attendence = attendence;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "workerId=" + workerId +
                ", workerName='" + workerName + '\'' +
                ", workerDepartment='" + workerDepartment + '\'' +
                ", attendence=" + attendence +
                '}';
    }
}
