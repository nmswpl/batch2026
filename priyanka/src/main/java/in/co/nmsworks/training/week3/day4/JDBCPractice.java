package in.co.nmsworks.training.week3.day4;

import java.sql.*;

public class JDBCPractice {
    public static void main(String[] args) {
        JDBCPractice jdbc = new JDBCPractice();
//        jdbc.executeQuerySelectExample();
//        jdbc.executeUpdateInsertExample();
//        jdbc.executeUpdateValueExample();
//        jdbc.executeQuerySelectExample();
        jdbc.selectUpdatedRow();

    }

    private void selectUpdatedRow() {
        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training","");
            PreparedStatement preparedStatement = con.prepareStatement("select * from student_info where id = ? ");
        ){
            preparedStatement.setInt(1,24);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                System.out.println(resultSet.getInt(1));
                System.out.println(resultSet.getString(2));
            }


        }catch (Exception e ){
            e.printStackTrace();
        }
    }


    private void executeUpdateValueExample() {
        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training","");
        PreparedStatement preparedStatement = con.prepareStatement("update student_info set name = ? where id = ? ");
        ){

            preparedStatement.setString(1,"sujaritha");
            preparedStatement.setInt(2,24);
            preparedStatement.executeUpdate();


        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    private void executeUpdateInsertExample() {
        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training","");Statement statement = con.createStatement()){

            String sql = "INSERT INTO student_info values(28,\"Priyo\",\"Villupuram\",8.9,\"IT\",\"2005/04/20\",\"1234567890\")";
            int row = statement.executeUpdate(sql);
            System.out.println("Row affected: " + row);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private void executeQuerySelectExample() {
        try(Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training",""); Statement statement = con.createStatement();){
            ResultSet resultSet = statement.executeQuery("SELECT * FROM student_info");
            while (resultSet.next()){
                System.out.println("Id: " + resultSet.getInt("id"));
                System.out.println("Name: " + resultSet.getString("name"));
                System.out.println("City: " + resultSet.getString("city"));
                System.out.println("Cgpa: " + resultSet.getFloat("cgpa"));
            }

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
