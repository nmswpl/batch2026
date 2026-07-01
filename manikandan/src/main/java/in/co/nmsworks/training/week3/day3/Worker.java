package in.co.nmsworks.training.week3.day3;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Worker {
    private String workerId;
    private String workerName;
    private String department;
    private Map<String, Integer> attendance;

    public Worker(String workerId, String workerName, String department) {
        this.workerId = workerId;
        this.workerName = workerName;
        this.department = department;
        this.attendance = new HashMap<>();
    }

    public String getWorkerId() {
        return workerId;
    }

    public String getWorkerName() {
        return workerName;
    }

    public String getDepartment() {
        return department;
    }

    public Map<String, Integer> getAttendance() {
        return attendance;
    }

    public void addAttendance(String month, int days) {
        this.attendance.put(month, days);
    }

    public int getTotalDaysWorked() {
        int total = 0;
        for (int days : attendance.values()) {
            total += days;
        }
        return total;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Worker worker = (Worker) o;
        return Objects.equals(workerId, worker.workerId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workerId);
    }
}
