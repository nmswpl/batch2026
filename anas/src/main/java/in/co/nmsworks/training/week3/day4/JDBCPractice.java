package in.co.nmsworks.training.week3.day4;

import java.sql.*;

public class JDBCPractice {
    public static void main(String[] args) {
        JDBCPractice jdbc = new JDBCPractice();
//        jdbc.executeQueryExample();
//        jdbc.executeUpdateExample();
        jdbc.executePreparedUpdate();
        jdbc.executePreparedQuery();
    }

    private void executePreparedQuery() {
        String url = "jdbc:mysql://localhost:3306/training";

        try (Connection connection = DriverManager.getConnection(url, "nms-training", "");
             PreparedStatement ps = connection.prepareStatement("select * from stdin where id = ?;");) {


            ps.setInt(1,77);
            ResultSet rs = ps.executeQuery();

            while(rs.next()){
                int id = rs.getInt(1);
                String name = rs.getString(2);
                System.out.println("id : " + id + " name : " + name);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void executePreparedUpdate() {
        String url = "jdbc:mysql://localhost:3306/training";

        try (Connection connection = DriverManager.getConnection(url, "nms-training", "");
             PreparedStatement ps = connection.prepareStatement("update stdin set name = ? where id = ?;");) {


            ps.setString(1,"sujaritha");
            ps.setInt(2,77);
            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    private void executeUpdateExample() {
        String url = "jdbc:mysql://localhost:3306/training";

        try (Connection connection = DriverManager.getConnection(url, "nms-training", "");
             Statement statement = connection.createStatement();) {

            String sql = "insert into stdin values(77, 'anas', 'india', 9, 'ct', '2004-08-15', 8072033455)";
            statement.executeUpdate(sql);

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


    private void executeQueryExample() {
        String url = "jdbc:mysql://localhost:3306/training";

        try (Connection connection = DriverManager.getConnection(url, "nms-training", "");
             Statement statement = connection.createStatement();) {

            String sql = "select * from stdin";
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                String name = resultSet.getString("name");
                String city = resultSet.getString("city");
                String dept = resultSet.getString(4);

                System.out.println("ID : " + id + " | Name : " + name + " | " + city + " | " + dept);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
