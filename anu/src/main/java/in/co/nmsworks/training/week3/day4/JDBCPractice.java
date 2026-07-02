package in.co.nmsworks.training.week3.day4;

import java.sql.*;

public class JDBCPractice {
    public static void main(String[] args) throws SQLException {
        JDBCPractice jdbcPractice =new JDBCPractice();
        try(Connection con = DriverManager.getConnection("jdbc:mysql://localHost:3306/training","nms-training","");
            Statement stml = con.createStatement()) {
//            jdbcPractice.excuteExample(stml);
//            jdbcPractice.excuteQueryExample(stml);
            jdbcPractice.excuteUpdateExample(con);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void excuteUpdateExample(Connection con)  {
        try(
        PreparedStatement prep =con.prepareStatement("update studentinfo set name ='sujaritha' where id= ? "))
        {
            prep.setString(1,"25");
            int a= prep.executeUpdate();
            System.out.println(a);
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    private void excuteExample(Statement stml) {
        try
        {
            int updateValue =stml.executeUpdate("INSERT INTO studentinfo values(25,'thayuman','bangalore',9.00,'cse','2005-3-24',1234567891)");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void excuteQueryExample(Statement stml) {
        int id = 0;
        String name =" ";
        String city= "";
        try
        {
            ResultSet resultSet =stml.executeQuery("SELECT * from studentinfo ");
            while (resultSet.next()){
                id =resultSet.getInt("id");
                name = resultSet.getString(2);
                city = resultSet.getString("city");
                System.out.println("id : " + id + " Name : " + name + " City : " + city);
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
