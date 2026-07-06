package in.co.nmsworks.training.week3.day6;

import java.sql.*;

public class PracticeRunner {
    public static void main(String[] args) {
//        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training","");
//            Statement stsm = con.createStatement()){
//            String query = "select * from student_info";
//            ResultSet rs = stsm.executeQuery(query);
//            while(rs.next()){
//                System.out.println(rs.getInt(1)+" : "+rs.getString(2));
//        }

//        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training");PreparedStatement pstm = con.prepareStatement("select * from table where id =?")){
//            pstm.setInt(1,1);
//            ResultSet rs = pstm.executeQuery();
//        }

        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training","");
        PreparedStatement pstm = con.prepareStatement("insert into student_info where name=?")){
            pstm.setString(1,"Banu");

            pstm.executeUpdate();


            //alter table student_info
            //rename column salary to salary_month;

            //create table student_info(
            //name varchar(100),
            //price double,
            //id int primary key,
            //marks decimal(10,2),
            //dateOfBirth date);

            //insert into student_info values ("Jems", 560000,1,98.20,'2005-09-27');


        }

        catch(SQLException e){
                e.printStackTrace();

        }




    }
}
