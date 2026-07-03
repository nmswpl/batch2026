package in.co.nmsworks.training.week3.day4;

import com.google.gson.stream.JsonToken;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.*;
import java.io.*;


public class CarDetails {

    public static void main(String[] args) {
        List<CarInfo> details = new ArrayList<>();
        convertDbToList(details);
        Map<String,List<CarInfo>> infoMap= convertListToMap(details);
        convertMapToFile(infoMap);
    }

    public static void convertMapToFile(Map<String, List<CarInfo>> infoMap) {

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("/home/nms-training/Desktop/NewCarInfo.txt"));

            for (Map.Entry<String,List<CarInfo>> entry: infoMap.entrySet()) {
                String line=""+entry;
                bw.write(line+"\n\n");
                bw.flush();
            }
            bw.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static  Map<String,List<CarInfo>> convertListToMap(List<CarInfo> details) {

        Map<String,List<CarInfo>> infoMap = new HashMap<>();
        for (CarInfo detail : details) {
            String key = detail.getManufacturer();
            List<CarInfo> list;
            if(infoMap.containsKey(key))
            {
                list = infoMap.get(key);
            }
            else {
                list = new ArrayList<>();
                infoMap.put(key,list);
            }
            list.add(detail);
        }
        return infoMap;
    }

    public static void convertDbToList(List<CarInfo> details) {

        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/candidates","nms-training",""); PreparedStatement ps = con.prepareStatement("select* from CarInfo"))
        {
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                CarInfo ci = new CarInfo();
                ci.setId(rs.getInt("Id"));
                ci.setName(rs.getString("Name"));
                ci.setManufacturer(rs.getString("Manufacturer"));
                ci.setYearOfProduction(rs.getInt("YearOfProduction"));
                String sta = rs.getString("Status");

                Status status;
                        if(sta.equals("Active"))
                        {
                            status = Status.Active;
                        }
                        else
                        {
                            status = Status.Discontinued;
                        }
                ci.setStatus(status);
                details.add(ci);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(details.size());
    }
}
