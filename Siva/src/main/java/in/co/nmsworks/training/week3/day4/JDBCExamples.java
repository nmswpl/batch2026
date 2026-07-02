package in.co.nmsworks.training.week3.day4;

import java.sql.*;

public class JDBCExamples {
    public static void main(String[] args) {
        JDBCExamples jd = new JDBCExamples();
//        jd.executeQueryMethod();
//        jd.executeUpdateMethod();
        jd.updateDataInStudentInfo(216, "Sujaritha");
        jd.getDataBasedOnId(216);

    }

    private void getDataBasedOnId(int id) {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training","");
             PreparedStatement ps = connection.prepareStatement("select * from studentinfo where id = ?")) {
            ps.setInt(1, id);
            ResultSet resultSet = ps.executeQuery();
            if (resultSet.next()) {
                Integer idFromDB = resultSet.getInt(1);
                String name = resultSet.getString(2);
                String city = resultSet.getString(3);
                Double cgpa = resultSet.getDouble(4);
                String department = resultSet.getString(5);
                Date dob = resultSet.getDate(6);
                String phoneNumber = resultSet.getString(7);
                System.out.println("Id = "+idFromDB+"\nName = "+name+"\nCity = "+city+"\nCGPA = "+cgpa+"\nDepartment = "+department+"\nDate of Birth = "+dob+"\nPhone Number = "+phoneNumber);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void updateDataInStudentInfo(int id, String name) {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training","");
            PreparedStatement ps = connection.prepareStatement("UPDATE studentinfo set name = ? where id = ?")) {
            ps.setString(1, name);
            ps.setInt(2, id);
            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void executeUpdateMethod() {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training","");
             Statement statement = connection.createStatement();) {
            int number = statement.executeUpdate("insert into studentinfo values (216,'Rahul','bangalore',8.5,'CSE','2004-10-10','43567893')");
            System.out.println(number);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void executeQueryMethod() {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training","");
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("select * from studentinfo")) {
            while (resultSet.next()) {
                Integer id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                String city = resultSet.getString(3);
                Double cgpa = resultSet.getDouble(4);
                String department = resultSet.getString(5);
                Date dob = resultSet.getDate(6);
                String phoneNumber = resultSet.getString(7);
                System.out.println("Id = "+id+"\nName = "+name+"\nCity = "+city+"\nCGPA = "+cgpa+"\nDepartment = "+department+"\nDate of Birth = "+dob+"\nPhone Number = "+phoneNumber);
                System.out.println("-------------------------------------------------------");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
