package in.co.nmsworks.training.week3.day3;

import java.util.Map;
import java.util.Objects;

public class Worker {
    private String id;
    private String name;
    private String dept;


    public Worker(String id, String name, String dept ) {
        this.dept = dept;
        this.name = name;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
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
        return Objects.hash(id, name, dept);
    }

    //    @Override
//    public boolean equals(Object o) {
//        if (o == null || getClass() != o.getClass()) return false;
//        Worker worker = (Worker) o;
//
////        return Objects.equals(id, worker.id) ;
//    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(id, name, dept, workedDaysInMonth);
//    }
}
