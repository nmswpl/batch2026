package in.co.nmsworks.training.week3.day4;

public class CarInfo {
    private Integer id;
    private String Name;
    private String manufacturer;
    private Integer year;
    private String status;

    public CarInfo() {
    }

    public CarInfo(Integer id, String name, String manufacturer, Integer year, String status) {
        this.id = id;
        Name = name;
        this.manufacturer = manufacturer;
        this.year = year;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "CarInfo{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", year=" + year +
                ", status='" + status + '\'' +
                '}';
    }
}
