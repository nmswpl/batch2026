package in.co.nmsworks.training.week3.day4;

public class CarInfo {
    private int id;
    private String name;
    private String Manufacturer;
    private int year;
    private String status;

    public CarInfo(int id, String name, String manufacturer, int year, String status) {
        this.id = id;
        this.name = name;
        Manufacturer = manufacturer;
        this.year = year;
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
        return Manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        Manufacturer = manufacturer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
