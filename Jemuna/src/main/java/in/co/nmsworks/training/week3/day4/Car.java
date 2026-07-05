package in.co.nmsworks.training.week3.day4;

public class Car {
    private Integer id;
    private String name;
    private String Manufacturer;
    private Integer YearOfProduction;
    private String Status;


    public Car(Integer id, String name, String manufacturer, Integer yearOfProduction, String status) {
        this.id = id;
        this.name = name;
        Manufacturer = manufacturer;
        YearOfProduction = yearOfProduction;
        Status = status;
    }

    public Car() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return Manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        Manufacturer = manufacturer;
    }

    public Integer getYearOfProduction() {
        return YearOfProduction;
    }

    public void setYearOfProduction(Integer yearOfProduction) {
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
        return "Car{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Manufacturer='" + Manufacturer + '\'' +
                ", YearOfProduction=" + YearOfProduction +
                ", Status='" + Status + '\'' +
                '}';
    }
}
