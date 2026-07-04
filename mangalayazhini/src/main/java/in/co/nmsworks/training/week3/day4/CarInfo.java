package in.co.nmsworks.training.week3.day4;

public class CarInfo {
    private Integer id;
    private String name;
    private String manufacturer;
    private String yearOfProduction;
    private String status;

    public CarInfo(Integer id, String name, String manufacturer, String yearOfProduction, String status) {
        this.id = id;
        this.name = name;
        this.manufacturer = manufacturer;
        this.yearOfProduction = yearOfProduction;
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(String yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    @Override
    public String toString() {
        return "CarInfo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", yearOfProduction='" + yearOfProduction + '\'' +
                ", status='" + status + '\'' +
                '}';
    }


}
