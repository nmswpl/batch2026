package in.co.nmsworks.training.week4.day1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

public class DbWriter {
    public static void main(String[] args) {
        List<String> data = readDataFromFile();
        getDataForDb(data);
    }

    static void getDataForDb(List<String> datas) {

        System.out.println("length : " + datas.size());

        for (String data : datas) {
            String[] words = data.split(",");

            if (words[6].equals("COUNT")) {
                insertIntoDb("COUNT", words);
            }
            else {
                insertIntoDb("DOLLARS(millions)", words);
            }
        }
    }

    static void insertIntoDb(String dbType, String[] words) {

        String sql = "";
        if ("COUNT".equals(dbType)) {
            sql = "insert into count_data values (?,?,?,?,?,?)";
        }
        else {
            sql = "insert into dollars_data values (?,?,?,?,?,?)";
        }

        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "");
             PreparedStatement ps = connection.prepareCall(sql)){

            ps.setInt(1, Integer.parseInt(words[0]));
            ps.setString(2, words[1]);
            ps.setString(3, words[2]);
            ps.setString(4, words[3]);
            ps.setString(5, words[4]);
            ps.setString(6, words[5]);

            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static List<String> readDataFromFile() {

        List<String> datas = new ArrayList<>();

        try (FileReader fileReader = new FileReader("/home/nms-training/Downloads/annual-enterprise-survey-2025-financial-year-provisional-size-bands.csv");
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String line = "";
            bufferedReader.readLine();
            while ((line = bufferedReader.readLine()) != null) {
                    line = line.replaceAll("[^a-zA-Z0-9,]", "");
                    datas.add(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(datas.size());

        return datas;
    }
}
