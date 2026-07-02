package in.co.nmsworks.training.week3.day3;

import java.util.HashMap;
import java.util.Map;

public class Worker {

    private String workerId;
    private String workerName;
    private String department;
    private Map<String, Integer> attendance = new HashMap<>();

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
}