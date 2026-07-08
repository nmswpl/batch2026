package in.co.nmsworks.training.week3.day4;

import java.sql.*;

public class JDBCPractice {
    public static void main(String[] args) {
        JDBCPractice practice = new JDBCPractice();
        practice.executeUpdateExample();
        practice.executeQueryExample();
        practice.updateQueryExample();
        practice.getUpdatedExample();
    }

    private void getUpdatedExample() {
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "");
             PreparedStatement statement = con.prepareStatement("select * from studentinfo where id = ?")) {
            int id = 50;
            statement.setInt(1, id);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    System.out.println(resultSet.getInt(1) + " , " + resultSet.getString(2) + " , " + resultSet.getString(3));
                } else {
                    System.out.println("no student with id : " + id);
                }
            } catch (Exception e) {
                System.err.println("ERROR : " + e.getMessage());
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private void updateQueryExample() {
        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training","");
            PreparedStatement statement = con.prepareStatement("update studentinfo set name = ? where id = ?")){
            String name = "Sujaritha";
            statement.setString(1, name);
            statement.setInt(2,50);
            int rows = statement.executeUpdate();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    private void executeUpdateExample() {
        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training","");
            Statement stmnt = con.createStatement()){
            int rowsAffected = stmnt.executeUpdate("insert into studentinfo(id, name, city) values(40, \"Sanjeev\", \"India\")");
            System.out.println("The affected rows are :: " + rowsAffected);
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }

    private void executeQueryExample() {
        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training","");
            Statement stmnt = con.createStatement())
        {
            ResultSet set = stmnt.executeQuery("select * from studentinfo");
            while(set.next()){
                System.out.println(" Id :: " + set.getString(1) + " Name :: " + set.getString(2) + " Location :: " + set.getString(3) + " CGPA :: " +  set.getString(4) + " DOB :: " + set.getString("dob") + " Phone number :: " + set.getString("PhNo"));
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
