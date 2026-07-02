package in.co.nmsworks.training.week3.day3;

import java.util.Map;
import java.util.Objects;

public class Worker {
    private String workerId;
    private String workerName;
    private String workerDept;
    private Map<String,Integer> attendance;

    public Worker() {
    }

    public Worker(String workerId, String workerName, String workerDept) {
        this.workerId = workerId;
        this.workerName = workerName;
        this.workerDept = workerDept;
    }

    public Worker(String workerId, String workerName, String workerDept, Map<String, Integer> attendance) {
        this.workerId = workerId;
        this.workerName = workerName;
        this.workerDept = workerDept;
        this.attendance = attendance;
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

    public String getWorkerDept() {
        return workerDept;
    }

    public void setWorkerDept(String workerDept) {
        this.workerDept = workerDept;
    }

    public Map<String, Integer> getAttendance() {
        return attendance;
    }

    public void setAttendance(Map<String, Integer> attendance) {
        this.attendance = attendance;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "workerId=" + workerId +
                ", workerName='" + workerName + '\'' +
                ", workerDept='" + workerDept + '\'' +
                ", attendance=" + attendance +
                '}';
    }

//    @Override
//    public boolean equals(Object o) {
//        if (o == null || getClass() != o.getClass()) return false;
//        Worker worker = (Worker) o;
//        return Objects.equals(workerId, worker.workerId);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hashCode(workerId);
//    }
}
