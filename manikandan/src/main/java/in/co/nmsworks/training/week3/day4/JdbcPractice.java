package in.co.nmsworks.training.week3.day4;

import java.sql.*;

public class JdbcPractice {
    public static void main(String[] args) {
        JdbcPractice practice = new JdbcPractice();
        //practice.executeQueryExample();
        //practice.executeQueryUpdate();
        practice.preparedStatement();
        practice.preparedStatement1();


    }

    private void preparedStatement1() {
        String url1 = "jdbc:mysql://localhost:3306/training"; // Lowercase jdbc is standard
        String user1 = "nms-training";
        String pwd1 = "";

        String query = "SELECT * FROM Students WHERE id = ?";

        try (Connection con = DriverManager.getConnection(url1, user1, pwd1); PreparedStatement smt = con.prepareStatement(query)) {

            smt.setInt(1, 1);
            try (ResultSet rs = smt.executeQuery()) {
                if (rs.next()) {
                    int id = rs.getInt("id");
                    String name = rs.getString("name");

                    System.out.println("Student Found -> ID: " + id + ", Name: " + name);
                } else {
                    System.out.println("No student found with ID 1");
                }
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private void preparedStatement() {

        String url1 = "JDBC:mysql://localhost:3306/training";
        String user1 = "nms-training";
        String pwd1 = "";
        try (Connection con = DriverManager.getConnection(url1, user1, pwd1);
             PreparedStatement smt = con.prepareStatement("update Students SET name=? where id=? ")) {
             smt.setString(1,"SUJARITHA");
             smt.setInt(2,101);
             int st = smt.executeUpdate();
             System.out.println("UPDATED "+st);


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private void executeQueryUpdate() {
        String url1 = "JDBC:mysql://localhost:3306/training";
        String user1 = "nms-training";
        String pwd1 = "";
        try (Connection con = DriverManager.getConnection(url1, user1, pwd1);
             Statement smt = con.createStatement()) {


            String disp = "Insert into Students VALUES (145,'MAD','POLLACHI',8,'CYS','2004-08-27','9994961184')";

            int r = smt.executeUpdate(disp);
            System.out.println(r);


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

       private void executeQueryExample() {
        String url = "JDBC:mysql://localhost:3306/training";
        String user = "nms-training";
        String pwd = "";
        try (Connection con = DriverManager.getConnection(url, user, pwd);
             Statement smt = con.createStatement()) {
            String disp = "select * from Students";
            ResultSet rs = smt.executeQuery(disp);
            while (rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString(2);
                String city = rs.getString(3);
                int cgpa = rs.getInt(4);
                String department = rs.getString(5);
                Date date_of_birth = rs.getDate(6);
                String phone_number = rs.getString(7);
                System.out.println(id + " " + name + " " + city + " " + cgpa + " " + department + " " + date_of_birth + " " + phone_number);

            }

        } catch (SQLException ex) {
            throw new RuntimeException(ex);

        }
    }
}


