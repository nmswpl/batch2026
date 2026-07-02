package in.co.nmsworks.training.week3.day4;

public class CarInfo {
    private Integer id ;
    private String Name ;
    private String Manufacturer ;
    private Integer YearOfProduction ;
    private String Status ;

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
        return "CarInfo{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", Manufacturer='" + Manufacturer + '\'' +
                ", YearOfProduction=" + YearOfProduction +
                ", Status='" + Status + '\'' +
                '}';
    }
}
