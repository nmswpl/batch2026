package in.co.nmsworks.training.week3.day4;

public class Car {
    private Integer id;
    private String name;
    private String manufacturer;
    private Integer yearOfProduction;
    private String status;

    public Car(Integer id, String name, String manufacturer, Integer yearOfProduction, String status) {
        this.id = id;
        this.name = name;
        this.manufacturer = manufacturer;
        this.yearOfProduction = yearOfProduction;
        this.status = status;
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
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Integer getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(Integer yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
