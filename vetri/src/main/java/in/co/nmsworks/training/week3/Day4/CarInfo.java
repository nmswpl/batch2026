package in.co.nmsworks.training.week3.Day4;

import java.util.Objects;

public class CarInfo {
    private Integer Id;
    private String Name;
    private String Manufacturer;
    private Integer YearOfProduction;
    private String Status;

    public CarInfo() {
    }

    public CarInfo(Integer id, String name, String manufacturer, Integer yearOfProduction, String status) {
        Id = id;
        Name = name;
        Manufacturer = manufacturer;
        YearOfProduction = yearOfProduction;
        Status = status;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
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
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        CarInfo carInfo = (CarInfo) o;
        return Objects.equals(Id, carInfo.Id) && Objects.equals(Name, carInfo.Name) && Objects.equals(Manufacturer, carInfo.Manufacturer) && Objects.equals(YearOfProduction, carInfo.YearOfProduction) && Objects.equals(Status, carInfo.Status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id, Name, Manufacturer, YearOfProduction, Status);
    }

    @Override
    public String toString() {
        return "CarInfo{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", Manufacturer='" + Manufacturer + '\'' +
                ", YearOfProduction=" + YearOfProduction +
                ", Status='" + Status + '\'' +
                '}';
    }
}
