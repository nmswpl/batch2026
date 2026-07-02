package in.co.nmsworks.training.week3.day4;

import java.sql.*;

public class JDBCPractice {
    public static void main(String[] args) {
        JDBCPractice jdbcPractice = new JDBCPractice();
        jdbcPractice.executeQueryExample();
        jdbcPractice.executeUpdateExample();
        int idToFind = 50;
        String nameToUpdate = "Sujaritha";
        jdbcPractice.updateData(idToFind, nameToUpdate);
        jdbcPractice.retrieveDataUsingPrepareStatement(idToFind);
    }

    private void retrieveDataUsingPrepareStatement(int idToFind) {
        String url = "jdbc:mysql://localhost:3306/training";

        try (Connection connection = DriverManager.getConnection(url, "nms-training", "");
             PreparedStatement ps = connection.prepareStatement("select id, name, city, dept from studentinfo where id = ?")){

            ps.setInt(1, idToFind);

            ResultSet resultSet = ps.executeQuery();

            if(resultSet.next()) {
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                String city = resultSet.getString(3);
                String dept = resultSet.getString(4);

                System.out.println("ID : " + id + " | Name : " + name + " | " + city + " | " + dept);
            }

        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void updateData(int idToFind, String nameToUpdate) {
        String url = "jdbc:mysql://localhost:3306/training";

        try (Connection connection = DriverManager.getConnection(url, "nms-training", "");
        PreparedStatement ps = connection.prepareStatement("update studentinfo set name = ? where id = ?")){

            ps.setString(1, "Sujaritha");
            ps.setInt(2, idToFind);

            ps.executeUpdate();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }


    private void executeUpdateExample() {
        String url = "jdbc:mysql://localhost:3306/training";

        try (Connection connection = DriverManager.getConnection(url, "nms-training", "");
             Statement statement = connection.createStatement();) {

            String sql = "insert into studentinfo values (50, 'Sanjeev', 'Velachery', 'IT', 8, '1995-01-01', 998748292)";
            statement.executeUpdate(sql);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void executeQueryExample() {
        String url = "jdbc:mysql://localhost:3306/training";

        try (Connection connection = DriverManager.getConnection(url, "nms-training", "");
             Statement statement = connection.createStatement();) {

            String sql = "select * from studentinfo";
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
