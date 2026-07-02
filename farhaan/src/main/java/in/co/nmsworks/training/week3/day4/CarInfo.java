package in.co.nmsworks.training.week3.day4;

import java.util.Objects;

public class CarInfo {
    private Integer id;
    private String name;
    private String manufacturer;
    private Integer year;
    private Status status;

    public CarInfo(Integer id, String name, String manufacturer, Integer year, Status status) {
        this.id = id;
        this.name = name;
        this.manufacturer = manufacturer;
        this.year = year;
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        CarInfo carInfo = (CarInfo) o;
        return Objects.equals(id, carInfo.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return name;
    }

    public CarInfo() {
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

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
