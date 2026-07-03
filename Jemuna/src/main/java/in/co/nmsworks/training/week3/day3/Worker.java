package in.co.nmsworks.training.week3.day3;

import java.util.Map;

public class Worker {
    private Integer workerID;
    private String workerName;
    private String department;
    private Map<String,Integer> attendance;

    public Worker(Integer workerID, String workerName, String department, Map<String, Integer> attendance) {
        this.workerID = workerID;
        this.workerName = workerName;
        this.department = department;
        this.attendance = attendance;
    }

    public Worker(){

    }

    public Integer getWorkerID() {
        return workerID;
    }

    public void setWorkerID(Integer workerID) {
        this.workerID = workerID;
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
                "workerID=" + workerID +
                ", workerName='" + workerName + '\'' +
                ", department='" + department + '\'' +
                ", attendance=" + attendance +
                '}';
    }
}
