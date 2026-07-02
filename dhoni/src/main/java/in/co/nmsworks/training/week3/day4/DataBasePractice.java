package in.co.nmsworks.training.week3.day4;

import java.sql.*;

public class DataBasePractice {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/training";
        String user = "nms-training";
        String password ="";

        DataBasePractice dataBasePractice = new DataBasePractice();
        //dataBasePractice.executeQueryPrintRows(url,user,password);
        //dataBasePractice.executeUpdate(url,user,password);

        //dataBasePractice.executeQueryPrintRows(url,user,password);
        //dataBasePractice.updateQuery(url,user,password);

        //dataBasePractice.executeQueryPrintRows(url,user,password);
        dataBasePractice.executeFindIdPrepared(url,user,password);



    }

    private void executeFindIdPrepared(String url, String user, String password) {
        try(Connection connection = DriverManager.getConnection(url,user,password);
            Statement statement = connection.createStatement();

        )
        {
            String findById = "select * from studentinfo where id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(findById);
            preparedStatement.setInt(1,23);

            ResultSet resultSet = preparedStatement.executeQuery();

            if(resultSet.next()){
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                String city = resultSet.getString(3);
                String dept = resultSet.getString(4);
                String cgpa = String.valueOf(resultSet.getFloat(5));
                Date dob = resultSet.getDate(6);
                long phoneNumber = resultSet.getLong(7);

                System.out.println(
                        "id : " + id + " name : " + name+ " city : " + city +
                                " dept : " + dept + " cgpa : " + cgpa + " dob : " + dob
                                + " phone number : " + phoneNumber
                );
            }

        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    private void updateQuery(String url, String user, String password) {

        try(Connection connection = DriverManager.getConnection(url,user,password);
            Statement statement = connection.createStatement();

        )
        {
            String insert = "update studentinfo set name = ? where id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(insert);

            preparedStatement.setString(1,"Sujaritha");
            preparedStatement.setInt(2,50);

            preparedStatement.executeUpdate();
            preparedStatement.close();
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    private void executeUpdate(String url, String user, String password) {
        try(Connection connection = DriverManager.getConnection(url,user,password);
            Statement statement = connection.createStatement();

        )
        {
            String insert = "insert into studentinfo value(50,'karthic','salem','CSE',8.2,'2004-11-30',9443234544)";
            int resultSet = statement.executeUpdate(insert);
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    private void executeQueryPrintRows(String url, String user, String password) {

        try(Connection connection = DriverManager.getConnection(url,user,password);
            Statement statement = connection.createStatement();

        )
        {
            String display = "select * from studentinfo";
            ResultSet resultSet = statement.executeQuery(display);

            while (resultSet.next()){
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                String city = resultSet.getString(3);
                String dept = resultSet.getString(4);
                String cgpa = String.valueOf(resultSet.getFloat(5));
                Date dob = resultSet.getDate(6);
                long phoneNumber = resultSet.getLong(7);

                System.out.println(
                        "id : " + id + " name : " + name+ " city : " + city +
                                " dept : " + dept + " cgpa : " + cgpa + " dob : " + dob
                                + " phone number : " + phoneNumber
                );
            }

            resultSet.close();
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
