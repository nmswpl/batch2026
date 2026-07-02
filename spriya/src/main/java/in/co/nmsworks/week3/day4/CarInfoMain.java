package in.co.nmsworks.week3.day4;

import java.util.List;
import java.util.Map;

public class CarInfoMain {
    public static void main(String[] args) {
        CarInfo carInfo = new CarInfo();

        Map<String, List<String>> map = carInfo.readFromDb();
        carInfo.writeToFile(map);
    }
}
