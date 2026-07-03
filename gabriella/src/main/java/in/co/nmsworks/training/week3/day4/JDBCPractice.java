package in.co.nmsworks.training.week3.day4;

import java.sql.*;

public class JDBCPractice {
    public static void main(String[] args) {
        JDBCPractice jdbcPractice = new JDBCPractice();
        jdbcPractice.executeQueryExample();
        jdbcPractice.executeUpdateExample();
        String name = "Sujaritha";
        int id = 24;
        jdbcPractice.preparedUpdate(name, id);
        jdbcPractice.preparedQuery(id);
    }

    private void preparedQuery(int id) {
        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "");
            PreparedStatement statement = con.prepareStatement("select * from studentinfo where id = ?")){
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                System.out.println("Name: " + resultSet.getString("name"));
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    private void preparedUpdate(String name, int id) {
        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "");
            PreparedStatement statement = con.prepareStatement("update studentinfo set name = ? where id = ?")){
            statement.setString(1, name);
            statement.setInt(2, id);
            statement.executeUpdate();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    private void executeUpdateExample() {
        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "");
            Statement statement = con.createStatement();){
            int result = statement.executeUpdate("insert into studentinfo values(24, \"abc\", \"Chennai\", 7.2, \"CSE\", \"2005-09-25\", 7893256098)");
            System.out.println(result);
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    private void executeQueryExample() {
        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "");
            Statement statement = con.createStatement();){
            ResultSet resultSet = statement.executeQuery("select * from studentinfo");
            while(resultSet.next()){
                System.out.println(resultSet.getInt("id"));
                System.out.println(resultSet.getString("name") + ", "+ resultSet.getString("city") + ", " + resultSet.getString("dept"));

            }

        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
