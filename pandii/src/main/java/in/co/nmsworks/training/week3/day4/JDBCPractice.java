package in.co.nmsworks.training.week3.day4;

import java.sql.*;

public class JDBCPractice {
    public static void main(String[] args) {
//        JDBCPractice jdbc=new JDBCPractice();
        executeUpdate();
//        executeQuery();
        updateQuery();
        executeQuery();
        selectQuery(25);
    }

    private static void selectQuery(int id) {
        try (Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/training");
             PreparedStatement ps=connection.prepareStatement("select * from student_info where id=?"))
        {
            ps.setInt(1,id);
            ResultSet rs=ps.executeQuery();
            while(rs.next())
            {
                System.out.println("ID: "+rs.getInt(1)+"Name : "+rs.getString(2));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    private static void updateQuery() {
        try (Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/training");
             PreparedStatement ps=connection.prepareStatement("update student_info set name=? where id=?")) {
                 ps.setString(1,"Sujaritha");
                 ps.setInt(2,25);

                 ps.executeUpdate();
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }


    private static void executeUpdate() {
        try (Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/training");
             Statement stmt=connection.createStatement())
        {
            int n=stmt.executeUpdate("INSERT INTO student_info values (29,'pandi','salem','8.2','IT','2005-09-12','1234567888')");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static void executeQuery() {
        try (Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/training");
            Statement stmt=connection.createStatement();
            ResultSet rs=stmt.executeQuery("select * from student_info;"))
        {
                    while(rs.next())
                    {
                        System.out.println("ID: "+rs.getInt(1)+" NAME: "+rs.getString(2));
                    }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
