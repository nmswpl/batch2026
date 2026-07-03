package in.co.nmsworks.training.week3.day4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class DiscontinuedCars implements CarProcessor{
    @Override
    public void write(List<CarInfo> cars) {
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter("/home/nms-training/Desktop/Discontinued.txt"));
            bufferedWriter.write("ID   |  NAME   |  MANUFACTURER  |  YEAR OF PRODUCTION");
            for (CarInfo car : cars) {
                if (car.getStatus().equals("Discontinued")){
                    bufferedWriter.write("\n" + car.getId() + "| " + car.getName() + "| " + car.getManufacturer() + "| " + car.getYearOfProduction());
                }
            }
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
