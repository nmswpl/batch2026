package in.co.nmsworks.training.week3.Day3;

import java.util.Map;
import java.util.Objects;

public class Worker {
    private String workerId;
    private String workerName;
    private String department;
    private Map<String, Integer> attendance;

    public Worker() {
    }

    public Worker(String workerId, String workerName, String department, Map<String, Integer> attendance) {
        this.workerId = workerId;
        this.workerName = workerName;
        this.department = department;
        this.attendance = attendance;
    }

    public void setWorkerId(String workerId) {
        this.workerId = workerId;
    }

    public String getWorkerId() {
        return workerId;
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
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Worker worker = (Worker) o;
        return Objects.equals(workerId, worker.workerId) && Objects.equals(workerName, worker.workerName) && Objects.equals(department, worker.department) && Objects.equals(attendance, worker.attendance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workerId, workerName, department, attendance);
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
