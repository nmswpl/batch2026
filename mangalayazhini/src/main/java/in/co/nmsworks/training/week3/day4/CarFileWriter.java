package in.co.nmsworks.training.week3.day4;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.util.List;

public class CarFileWriter implements CarProcessor{
    public void write(List<CarInfo> carsList){

        String path = "/home/nms-training/Downloads/discontinuedCars.txt";
        try(BufferedWriter writerObj = new BufferedWriter(new FileWriter(path))){

            for (CarInfo carInfo : carsList) {
                writerObj.write(carInfo.getId() + " , " + carInfo.getName() + " , " + carInfo.getManufacturer() + " , " + carInfo.getYearOfProduction() + "\n");
            }
        }catch(Exception e){

        }
    }
}
