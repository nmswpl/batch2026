package in.co.nmsworks.training.week3.day3;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

public class Worker {
    String workerId;
    String workerName;
    String department;
    Map<String, Integer> attendance = new HashMap<>();

    public Worker( String  workerId , String workerName, String department ) {
        this.attendance = new LinkedHashMap<>();
        this.department = department;
        this.workerName = workerName;
        this.workerId = workerId;
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

    public Object getTotalDaysWorked() {
        int total = 0;
        for (int days :attendance.values()){
            total += days;
        }
        return total;
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

    public void addAttendance(String month, int daysWorked) {
        attendance.put(month,daysWorked);
    }
}
