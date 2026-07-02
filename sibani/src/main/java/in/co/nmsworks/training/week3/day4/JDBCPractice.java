package in.co.nmsworks.training.week3.day4;

import java.sql.*;

public class JDBCPractice {
    public static void main(String[] args) {
        JDBCPractice jdbcPractice = new JDBCPractice();

//        jdbcPractice.executeUpdateExample();
//        jdbcPractice.executeQueryExample();

        jdbcPractice.updateUsingPrepStatement();
        jdbcPractice.selectUsingPrepStatement();
    }

    private void selectUsingPrepStatement() {
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "");
             PreparedStatement ps = con.prepareStatement("select * from studentinfo where id = ?")) {
            ps.setInt(1, 50);
            ResultSet result = ps.executeQuery();
            while (result.next()){
                int id = result.getInt(1);
                String name = result.getString(2);
                String city = result.getString(3);
                float cgpa = result.getFloat(4);
                String dept = result.getString(5);
                String dob = result.getString("dob");
                long phno = result.getLong(7);
                System.out.println("Id : " + id + " Name : " + name + " City : " + city + " CGPA : " + cgpa + " Dept : " + dept + " DOB : " + dob + " Phone Number : " + phno);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private void updateUsingPrepStatement() {
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "");
            PreparedStatement ps = con.prepareStatement("update studentinfo set name = ? where id = ?")) {
            ps.setString(1, "Sujaritha");
            ps.setInt(2, 50);
            ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private void executeUpdateExample() {
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "");
             Statement stmt = con.createStatement()) {
            int rs = stmt.executeUpdate("insert into studentinfo values(51, 'Sanjeev', 'India', 8.70, 'CSE', '2004-09-15',9876550880 )");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private void executeQueryExample() {
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "");
             Statement stmt = con.createStatement()) {
            ResultSet rs = stmt.executeQuery("select * from studentinfo");
            while (rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString(2);
                String city = rs.getString(3);
                float cgpa = rs.getFloat(4);
                String dept = rs.getString(5);
                String dob = rs.getString("dob");
                long phno = rs.getLong(7);
                System.out.println("Id : " + id + " Name : " + name + " City : " + city + " CGPA : " + cgpa + " Dept : " + dept + " DOB : " + dob + " Phone Number : " + phno);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
