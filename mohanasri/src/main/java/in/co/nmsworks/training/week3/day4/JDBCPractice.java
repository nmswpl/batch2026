package in.co.nmsworks.training.week3.day4;

import java.sql.*;

public class JDBCPractice {
    public static void main(String[] args) {
        JDBCPractice jp = new JDBCPractice();
        //jp.executeQueryExample();
        //jp.executeInsertExample();
        //jp.executeQueryPS();
        jp.selectQueryPS();

    }

    private void selectQueryPS() {
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "");
             PreparedStatement preparedStatement = con.prepareStatement("Select * from StudentInfo where ID = ?")) {
            preparedStatement.setInt(1, 24);
            ResultSet rs = preparedStatement.executeQuery();
            if (rs.next()) {
                System.out.println(rs.getString("NAME"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

        void executeQueryPS () {
            try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "");
                 PreparedStatement preparedStatement = con.prepareStatement("update StudentInfo set name = ? where id = ?")) {
                preparedStatement.setString(1, "Sujaritha");
                preparedStatement.setInt(2, 24);
                preparedStatement.executeUpdate();


            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

         void executeInsertExample () {
            try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "");
                 Statement statement = con.createStatement()) {
                int insertQ = statement.executeUpdate("insert into StudentInfo values (24, 'Tavira', 'Salem', 8.9, 'cse', '2005-09-12' , 9445636278  )");
                System.out.println(insertQ);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

         void executeQueryExample () {
            try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "");
                 Statement statement = con.createStatement()) {
                ResultSet resultSet = statement.executeQuery("Select * from StudentInfo");
                while (resultSet.next()) {
                    System.out.println("ID : " + (resultSet.getInt("ID")));
                    System.out.println("Name : " + (resultSet.getString(2)));
                    System.out.println("City : " + (resultSet.getString(3)));
                }

            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
