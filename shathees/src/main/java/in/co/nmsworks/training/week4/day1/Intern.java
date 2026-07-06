package in.co.nmsworks.training.week4.day1;

import java.util.Objects;

public class Intern {
    private String name;
    private int sal;

    public Intern(String name, int sal) {
        this.name = name;
        this.sal = sal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "Intern{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                '}';
    }
}


