package in.co.nmsworks.training.week3.day4;

public class CarInfo {
    private int id;
    private String name;
    private String manufacture;
    private int YearOfProduction;
    private String Status;

    public CarInfo(int id, String name, String manufacture, int yearOfProduction, String status) {
        this.id = id;
        this.name = name;
        this.manufacture = manufacture;
        YearOfProduction = yearOfProduction;
        Status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public int getYearOfProduction() {
        return YearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        YearOfProduction = yearOfProduction;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    @Override
    public String toString() {
        return "CarInfo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", manufacture='" + manufacture + '\'' +
                ", YearOfProduction=" + YearOfProduction +
                ", Status='" + Status + '\'' +
                '}';
    }
}
