package in.co.nmsworks.training.week3.day4;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCPractice {

    public static void main(String[] args) {
        updatePractice();
        executePractice();

    }

    private static void updatePractice() {

//        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training","");Statement stmt = con.createStatement())
//        {
//            int number = stmt.executeUpdate("INSERT INTO Book values (106,'Essay','Shek',110,10)");
//            System.out.println(number);
//        }
//        catch (Exception e) {
//            throw new RuntimeException(e);
//        }
        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training","");PreparedStatement ps = con.prepareStatement("Update Book Set Author = ? where BookId = ? "))
        {

            ps.setString(1,"Sujaritha");
            ps.setInt(2,106);
            ps.executeUpdate();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    private static void executePractice() {

        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training","");
        Statement stmt = con.createStatement()) {
            ResultSet rs = stmt.executeQuery("select* from Book where BookId = 106");
            while (rs.next()) {
                System.out.print(rs.getInt("BookId")+" ");
                System.out.print(rs.getString("Title")+" ");
                System.out.print(rs.getString("Author")+" ");
                System.out.print(rs.getString("price")+" ");
                System.out.println(rs.getString("Discount")+" ");
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
