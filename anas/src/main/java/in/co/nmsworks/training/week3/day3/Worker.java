package in.co.nmsworks.training.week3.day3;

import java.util.Map;

public class Worker {
    private String id;
    private String name;
    private String dept;
    private String month;
    private int daysWorked;
    Map<String, Integer> attendance;

    public Worker(){}


    public void setAttendance(Map<String, Integer> attendance, String month, int daysWorked) {
        attendance.put(month, daysWorked);
    }

    public Map<String, Integer> getAttendance() {
        return attendance;
    }

    public Worker(String id, String name, String dept, Map<String, Integer> attendance) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.attendance = attendance;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public int getDaysWorked() {
        return daysWorked;
    }

    public void setDaysWorked(int daysWorked) {
        this.daysWorked = daysWorked;
    }
}
