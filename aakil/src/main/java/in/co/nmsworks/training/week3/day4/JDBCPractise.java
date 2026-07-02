package in.co.nmsworks.training.week3.day4;

import java.sql.*;

public class JDBCPractise {
    public static void main(String[] args) {
        JDBCPractise practise = new JDBCPractise();
//        practise.executeUpdateExample();
//        practise.executeQueryExample();

        practise.updateQuery("Sujaritha");
        practise.selectQuery(50);

    }

    private void selectQuery(int id) {
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "");
             PreparedStatement ps = con.prepareStatement("select * from student_info where id  = ?")) {

            ps.setInt(1, id);
            try (ResultSet resultSet = ps.executeQuery()){
                if(resultSet.next()){
                    System.out.println(resultSet.getInt(1) + " , " + resultSet.getString(2) + " , " + resultSet.getString(3));
                }else {
                    System.out.println("no student with id : " + id);
                }
            } catch (SQLException e) {
                System.err.println("ERROR : " +  e.getMessage());
            }
        }catch (Exception e){
            System.err.println("error : " + e.getMessage());
        }
    }

    private void updateQuery(String name) {
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "");
             PreparedStatement ps = con.prepareStatement("update student_info set name = ? where id = ?")) {
            ps.setString(1, name);
            ps.setInt(2, 50);

            int rowsAffected = ps.executeUpdate();
            System.out.println(rowsAffected);
        }catch (Exception e){
            System.err.println("error : " + e.getMessage());
        }
    }

    private void executeUpdateExample() {
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "");
             Statement statement = con.createStatement()) {
            String sql = "INSERT INTO student_info VALUES (50, 'Bob', 'Chennai', 34, 'CSE', '8.45', '7896543218', '2001-08-08')";
            statement.executeUpdate(sql);
        }catch (Exception e){

        }
    }

    private void executeQueryExample() {
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "");
             Statement statement = con.createStatement();
             ) {
            ResultSet resultSet = statement.executeQuery("select * from student_info");
            while (resultSet.next()){
                System.out.print("\nID =  " + resultSet.getInt("id"));
                System.out.print(", NAME = " + resultSet.getString("name"));
                System.out.print(", DATE OF BIRTH = " + resultSet.getDate("dob"));
                System.out.print(", CITY = " + resultSet.getString("city"));
            }
        } catch (SQLException e) {
            System.err.println("Error : " + e.getMessage());
        }
    }
}
