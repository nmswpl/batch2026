package in.co.nmsworks.training.week4.day1;

import java.util.List;

public class FileDBRunner {
    public static void main(String[] args) {
        FileDBWriter DBObj = new FileDBWriter();
        List<String[]> fileData =  DBObj.read("/home/nms-training/Downloads/annual-enterprise-survey-2025-financial-year-provisional-size-bands.csv");


        DBObj.writeToCountData(fileData);
        DBObj.writeToAmountData(fileData);


    }
}

