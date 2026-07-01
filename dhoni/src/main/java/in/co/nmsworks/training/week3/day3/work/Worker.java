package in.co.nmsworks.training.week3.day3.work;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Worker {
    private String workerId;
    private String workerName;
    private String department;
    private Map<String, Integer> attendance;

    public Worker(String workerId, String workerName, String department) {
        this.workerId = workerId;
        this.workerName = workerName;
        this.department = department;
        attendance = new LinkedHashMap<>();
        attendance.put("Jan",null);
        attendance.put("Feb",null);
        attendance.put("Mar",null);
        attendance.put("Apr",null);
        attendance.put("May",null);
        attendance.put("Jun",null);
        attendance.put("Jul",null);
        attendance.put("Aug",null);
        attendance.put("Sep",null);
        attendance.put("Oct",null);
        attendance.put("Nov",null);
        attendance.put("Dec",null);
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
                "workerId=" + workerId +
                ", workerName='" + workerName + '\'' +
                ", department='" + department + '\'' +
                ", attendance=" + attendance +
                '}';
    }
}
