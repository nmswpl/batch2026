package in.co.nmsworks.training.week3.day4;

import java.sql.*;

public class JDBCPractice {
    public static void main(String[] args) {
        JDBCPractice jdbcPractice = new JDBCPractice();

//        jdbcPractice.executeQueryExample();
//        jdbcPractice.executeUpdateExample();
        jdbcPractice.updateUsingPreparedStmt();
        jdbcPractice.selectUsingPreparedStmt();

    }

    private void selectUsingPreparedStmt() {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training","");
             PreparedStatement preparedStatement = conn.prepareStatement("select  * from studentinfo where id = ? ");) {
            preparedStatement.setInt(1,24);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                System.out.println("Id : "+ resultSet.getInt("id") + " | Name : "+resultSet.getString("name") + " | Dept : "+resultSet.getString("dept") + " | City : " + resultSet.getString("city"));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private void updateUsingPreparedStmt() {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training","");
             PreparedStatement preparedStatement = conn.prepareStatement("UPDATE studentinfo set name = ? where id = ?");) {
            preparedStatement.setString(1,"Sujaritha");
            preparedStatement.setInt(2,24);
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }



    private void executeUpdateExample() {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training","");
             Statement stmt = conn.createStatement();){

            int result = stmt.executeUpdate("INSERT INTO studentinfo values (25,'Roshika','Pattukkottai',8.9,'IT','2002-07-20',1234567890)");
            System.out.println(result);
            }

        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void executeQueryExample() {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training","");
             Statement stmt = conn.createStatement();){

            try (ResultSet resultSet = stmt.executeQuery("SELECT * FROM studentinfo")) {
                while (resultSet.next()) {
                    System.out.println("Id : "+ resultSet.getInt("id") + " | Name : "+resultSet.getString("name") + " | Department : "+resultSet.getString("dept"));
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
