package in.co.nmsworks.training.week3.day4;

import java.util.Objects;

public class CarInfo {
    Integer id;
    String name;
    String manufacturer;
    Integer yearOfProduction;

    @Override
    public String toString() {
        return
                "id=" + id +
                ", name='" + name + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", status='" + status + '\''+ '\n'
                ;
    }

    String status;

    public CarInfo(Integer id, String name, String manufacturer, Integer yearOfProduction, String status) {
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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        CarInfo carInfo = (CarInfo) o;
        return Objects.equals(id, carInfo.id) && Objects.equals(name, carInfo.name) && Objects.equals(manufacturer, carInfo.manufacturer) && Objects.equals(yearOfProduction, carInfo.yearOfProduction) && Objects.equals(status, carInfo.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, manufacturer, yearOfProduction, status);
    }
}
