package in.co.nmsworks.training.week3.day4;

public class CarInfo {
    private int id;
    private String name;
    private String manufacturer;
    private int yearOfProduction;
    private String status;

    public CarInfo() {
    }

    public CarInfo(int id, String name, String manufacturer, int yearOfProduction, String status) {
        this.id = id;
        this.name = name;
        this.manufacturer = manufacturer;
        this.yearOfProduction = yearOfProduction;
        this.status = status;
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

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
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
                ", name='" + name + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", status='" + status + '\'' +
                '}';
    }
}
