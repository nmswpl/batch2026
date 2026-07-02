package in.co.nmsworks.training.week3.day4;

import java.math.BigDecimal;
import java.sql.*;

public class JdbcPractice {
    public static void main(String[] args) {
        executeUpdateExample();
        executeQueryExample();
        updateQueryUsingPrepared();
        selectQueryUsingPrepared(25);
    }

    private static void selectQueryUsingPrepared(int id) {
        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training","");
            PreparedStatement pstm = con.prepareStatement("SELECT * from student_info where id = ?"))
        {

            pstm.setInt(1,id);
            ResultSet resultSets = pstm.executeQuery();
            while(resultSets.next()){
                System.out.println("Name : " + resultSets.getString("name"));
                System.out.println("ID : " + resultSets.getInt("id"));
                System.out.println("City : "+ resultSets.getString("city"));
                System.out.println("Phone Number : "+ resultSets.getString("phone_number"));
                System.out.println("Department : "+ resultSets.getString("dept"));
                System.out.println("Date of Birth : "+resultSets.getDate("dob"));
                System.out.println("CGPA : "+resultSets.getBigDecimal("cgpa"));
                System.out.println("-------------------------------------------------------------");
            }
            } catch (SQLException ex) {
                ex.printStackTrace();
        }

    }

    private static void updateQueryUsingPrepared() {
        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training","");
            PreparedStatement ps = con.prepareStatement("INSERT INTO student_info values(?,?,?,?,?,?,?)"))
        {
            ps.setInt(1,25);
            ps.setString(2,"Sujaritha");
            ps.setString(3,"Chennai");
            ps.setBigDecimal(4, BigDecimal.valueOf(9.00));
            ps.setString(5,"CSE");
            ps.setDate(6, Date.valueOf("2000-03-27"));
            ps.setString(7,"1234567898");
            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


    private static void executeQueryExample() {
        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training","");
            Statement stm = con.createStatement())
        {
            ResultSet resultSet = stm.executeQuery("select * from student_info");
            while(resultSet.next()){
                System.out.println("Name : " + resultSet.getString("name"));
                System.out.println("ID : " + resultSet.getInt("id"));
                System.out.println("City : "+ resultSet.getString("city"));
                System.out.println("Phone Number : "+ resultSet.getString("phone_number"));
                System.out.println("Department : "+ resultSet.getString("dept"));
                System.out.println("Date of Birth : "+resultSet.getDate("dob"));
                System.out.println("CGPA : "+resultSet.getBigDecimal("cgpa"));
                System.out.println("-------------------------------------------------------------");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void executeUpdateExample() {
        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training","");
            Statement stm = con.createStatement())
        {
            int i = stm.executeUpdate("insert into student_info values (24,'Kavi','Trichy',8.00,'CSE','2006-02-23','2345678901')");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
