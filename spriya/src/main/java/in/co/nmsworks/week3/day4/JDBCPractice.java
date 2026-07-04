package in.co.nmsworks.week3.day4;

import java.sql.*;

public class JDBCPractice {

    public void executeQueryMethod() {
        try {
            try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "");
                 Statement stmt = con.createStatement();) {

                ResultSet rs = stmt.executeQuery("select * from studentinfo;");
                while (rs.next()) {
                    System.out.println("Name :" + rs.getString("name") + "  ID : " + rs.getInt("id") + "   City  :" + rs.getString("city"));
                }


            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


    public void executeUpdateMethod() {
        try {
            try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "");
                 Statement stmt = con.createStatement();) {

                int res = stmt.executeUpdate("insert into studentinfo values(24,'Raja','Chennai',8.9,'CSE','2005-09-12',1234567892)");
                ResultSet rs = stmt.executeQuery("select * from studentinfo;");
                while (rs.next()) {
                    System.out.println("Name :" + rs.getString("name") + "  ID : " + rs.getInt("id") + "   City  :" + rs.getString("city"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void executePreparedMethod(){
        try {
            try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "");
                 PreparedStatement preparedStatement= con.prepareStatement("update studentinfo set name=? where id=?")){
                preparedStatement.setInt(2,24);
                preparedStatement.setString(1,"Sujaritha");

               preparedStatement.executeUpdate();

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void executePreparedQuery(){

        try {
            try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "");
                PreparedStatement preparedStatement= con.prepareStatement("select id, name from studentinfo where id=?")){

                preparedStatement.setInt(1,24);
                ResultSet rs=preparedStatement.executeQuery();

                while (rs.next()) {
                    System.out.println( "  ID : " + rs.getInt(1) +"Name "+ rs.getString(2) );
                }


            }
        } catch (SQLException e) {
           e.printStackTrace();
        }
    }


}
