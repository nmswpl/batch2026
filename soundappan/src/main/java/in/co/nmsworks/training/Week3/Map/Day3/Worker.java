package in.co.nmsworks.training.Week3.Map.Day3;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

public class Worker {

    private String workerId;
    private String workerName;
    private String department;
    private Map<String, Integer> attendance;

    public Worker() {
        attendance = new LinkedHashMap<>();
    }

    public Worker(String workerId, String workerName, String department) {
        this.workerId = workerId;
        this.workerName = workerName;
        this.department = department;
        this.attendance = new LinkedHashMap<>();
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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
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
                "workerId='" + workerId + '\'' +
                ", workerName='" + workerName + '\'' +
                ", department='" + department + '\'' +
                ", attendance=" + attendance +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Worker)) return false;
        Worker worker = (Worker) o;
        return Objects.equals(workerId, worker.workerId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workerId);
    }
}