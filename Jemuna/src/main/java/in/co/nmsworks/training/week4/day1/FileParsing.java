package in.co.nmsworks.training.week4.day1;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FileParsing {

    public static void main(String[] args) {
        FileParsing fp = new FileParsing();
        List<SingleRecord> singleRecordList = new ArrayList<>();
        fp.parsing(singleRecordList);
        fp.writeToDB(singleRecordList);
    }

    public void writeToDB(List<SingleRecord> singleRecordList) {
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "");
             PreparedStatement pstmCount = con.prepareStatement("insert into Count values(?,?,?,?,?,?)");
             PreparedStatement pstmDollar = con.prepareStatement("insert into Dollar values(?,?,?,?,?,?)")) {

            for (SingleRecord singleRecord : singleRecordList) {
                PreparedStatement pstm;
                if (singleRecord.getUnit().contains("COUNT")) {
                    pstm = pstmCount;
                }
                else {
                    pstm = pstmDollar;
                }
                pstm.setInt(1, singleRecord.getYear());
                pstm.setString(2, singleRecord.getIndustryCode());
                pstm.setString(3, singleRecord.getIndustryName());
                pstm.setString(4, singleRecord.getRme());
                pstm.setString(5, singleRecord.getVariable());
                pstm.setString(6, singleRecord.getValue());
                pstm.executeUpdate();
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void parsing(List<SingleRecord> singleRecordList) {
        try (BufferedReader reader = new BufferedReader(new FileReader("/home/nms-training/Downloads/annual-enterprise-survey-2025-financial-year-provisional-size-bands.csv"))) {
            String line;
            reader.readLine();
            while ((line = reader.readLine()) != null) {
                reader.readLine();
                String[] fileArray = line.split(",");
                int year = Integer.parseInt(fileArray[0]);
                String industryCode = fileArray[1];
                String industryName = fileArray[2];
                String rme = fileArray[3];
                String variable = fileArray[4];
                String value = fileArray[5];
                String unit = fileArray[6];
                SingleRecord singleRecord = new SingleRecord(year,industryCode,industryName,rme,variable,value,unit);
                singleRecordList.add(singleRecord);
            }

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}





