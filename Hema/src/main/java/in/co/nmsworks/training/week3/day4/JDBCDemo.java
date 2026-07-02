package in.co.nmsworks.training.week3.day4;

import java.sql.*;

public class JDBCDemo {
    public static void main(String[] args) {
        try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training","");
            Statement statement = connection.createStatement();)
        {
            executeQueryExample(statement);
            executeUpdateTable(statement);


        } catch (SQLException e) {
            e.printStackTrace();
        }

        executePreparedUpdate();
        executePreparedQuery();

    }

    private static void executePreparedQuery() {
        try( Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training","");
             PreparedStatement preparedStatement = connection.prepareStatement("select * from Student_Info where id = ?" ) )
        {

            preparedStatement.setInt(1,25);
            ResultSet resultSet = preparedStatement.executeQuery();

            while(resultSet.next())
            {

                System.out.println("ID = "+resultSet.getInt("id"));
                System.out.println("Name = "+resultSet.getString("name"));
                System.out.println("city = "+resultSet.getString("city"));
            }



        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    private static void executePreparedUpdate() {
        try( Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training","");
             PreparedStatement preparedStatement = connection.prepareStatement("insert into Student_Info values (?,?,?,?,?,?,?)"); )
        {

            preparedStatement.setInt(1, 25);
            preparedStatement.setString(2,"Sujaritha");
            preparedStatement.setString(3,"Chennai");
            preparedStatement.setFloat(4,9);
            preparedStatement.setString(5,"ECE");
            preparedStatement.setDate(6,new Date(1L));
            preparedStatement.setFloat(7,0);

            preparedStatement.executeUpdate();


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private static void executeUpdateTable(Statement statement) {
        try {
            int value = statement.executeUpdate("insert into Student_Info (id, name, city) values ( 24,'Sanjeev','Salem' )");
            System.out.println("Value = "+value);



            ResultSet resultSet = statement.executeQuery("select * from Student_Info where id = 24");

            System.out.println("Data in ID(24) = > "+resultSet);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void executeQueryExample(Statement statement) throws SQLException {
        ResultSet resultSet = statement.executeQuery("select * from Student_Info");
        while ( resultSet.next() )
        {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            String city = resultSet.getString("city");
            Float cgpa = resultSet.getFloat("cgpa");
            String dept = resultSet.getString("dept");

            System.out.println("\nid = "+id+"\nname = "+name+"\ncity = "+city+"\ncgpa = "+cgpa+"\ndept = "+dept);

        }
    }
}
