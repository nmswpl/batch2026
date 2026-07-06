package in.co.nmsworks.training.week4.day1;


import java.io.*;
        import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;

public class FileParsing {

    private static final String FILE_PATH = "/home/nms-training/Downloads/annual-enterprise-survey-2025.csv";

    public static void main(String[] args) {
        FileParsing fp = new FileParsing();
        List<String[]> records = fp.parseCsvFile();
        System.out.println("Total parsed lines: " + records.size());
        fp.toDB(records);
    }

    private void toDB(List<String[]> records) {
        String sqlCount = "INSERT INTO countBased (year, code, name, rmeSize, variable, value) VALUES (?, ?, ?, ?, ?, ?)";
        String sqlDollar = "INSERT INTO dollarBased (year, code, name, rmeSize, variable, value) VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "");
             PreparedStatement psCount = con.prepareStatement(sqlCount);
             PreparedStatement psDollar = con.prepareStatement(sqlDollar)) {

            int countRows = 0;
            int dollarRows = 0;

            for (String[] row : records) {

                if (row.length >= 7) {
                    String unitColumn = row[6] != null ? row[6].trim().toUpperCase() : "";

                    if ("COUNT".equals(unitColumn)) {
                        insertIntoTable(psCount, row);
                        countRows++;
                    } else if ("DOLLARS".equals(unitColumn) || "DOLLAR".equals(unitColumn)) {
                        insertIntoTable(psDollar, row);
                        dollarRows++;
                    }
                }
            }
            System.out.println("Successfully inserted " + countRows + " rows into countBased.");
            System.out.println("Successfully inserted " + dollarRows + " rows into dollarBased.");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private void insertIntoTable(PreparedStatement ps, String[] row) throws SQLException {
        try {
            ps.setInt(1, Integer.parseInt(row[0].trim()));
        } catch (NumberFormatException e) {
            ps.setInt(1, 0);
        }
        ps.setString(2, row[1]);
        ps.setString(3, row[2]);
        ps.setString(4, row[3]);
        ps.setString(5, row[4]);
        ps.setString(6, row[5]);
        ps.executeUpdate();
    }

    public List<String[]> parseCsvFile() {
        List<String[]> list = new ArrayList<>();
        String line;

        try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {
            br.readLine();

            while ((line = br.readLine()) != null) {
                String[] words = line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1);
                for (int i = 0; i < words.length; i++) {
                    words[i] = words[i].replaceAll("^\"|\"$", "").trim();
                }
                list.add(words);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return list;
    }
}



