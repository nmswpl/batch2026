package in.co.nmsworks.training.week3.day4;

import java.util.List;

public class CarInfo {
    private Integer id;
    private String name;
    private String manufacturer;
    private List<String>list;


    public CarInfo(Integer id, String name, String manufacturer,String  Status) {
        this.id = id;
        this.name = name;
        this.manufacturer = manufacturer;



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

    @Override
    public String toString() {
        return "CarInfo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
