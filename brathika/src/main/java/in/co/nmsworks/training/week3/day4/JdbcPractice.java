package in.co.nmsworks.training.week3.day4;

import java.sql.*;

public class JdbcPractice {
    public static void main(String[] args) {
        JdbcPractice jdbcPractice = new JdbcPractice();
        jdbcPractice.executeQuery();
      //  jdbcPractice.executeUpdate();
        jdbcPractice.updateUsingPreparedStatement();
        jdbcPractice.selectUpdatedValue();
    }

    private void selectUpdatedValue() {
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training","");
            PreparedStatement ps = con.prepareStatement("select * from Studentinfo where ID = ?")) {
            ps.setInt(1,24);
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("ID");
                String name = resultSet.getString("name");
                String city = resultSet.getString("city");
                float cpga = resultSet.getFloat("cgpa");
                String department = resultSet.getString("department");
                System.out.println("ID: "+id+" Name: "+name+" City: "+city+" CGPA: "+cpga+" Department: "+department);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private void updateUsingPreparedStatement() {
        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training","");
            PreparedStatement ps = con.prepareStatement("update Studentinfo set name = ? where id = ?")) {
            ps.setString(1,"Sujaritha");
            ps.setInt(2,24);
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private void executeUpdate() {
        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training","");
            Statement statement = con.createStatement()) {
            statement.executeUpdate("INSERT INTO Studentinfo values (24,'Anu','Trichy',9.8,'cse','1982-12-24',7373658883)");


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void executeQuery() {
        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training","");
            Statement statement = con.createStatement())
        {
            ResultSet resultSet =  statement.executeQuery("select id, name, city, cgpa, department from Studentinfo");
            while (resultSet.next()) {
                int id = resultSet.getInt("ID");
                String name = resultSet.getString("name");
                String city = resultSet.getString("city");
                float cpga = resultSet.getFloat("cgpa");
                String department = resultSet.getString("department");
                System.out.println("ID: "+id+" Name: "+name+" City: "+city+" CGPA: "+cpga+" Department: "+department);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
