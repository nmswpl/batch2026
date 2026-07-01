package in.co.nmsworks.training.week3.day3;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Worker {
    private String id;
    private String name;
    private String dept;
    private Map<String, Integer> attendance;

    public Worker() {
    }

    public Worker(String id, String name, String dept) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.attendance = new HashMap<>();
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

    public Map<String, Integer> getAttendance() {
        return attendance;
    }

    public void setAttendance(Map<String, Integer> attendance) {
        this.attendance = attendance;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", attendance=" + attendance +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Worker worker = (Worker) o;
        return Objects.equals(id, worker.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
