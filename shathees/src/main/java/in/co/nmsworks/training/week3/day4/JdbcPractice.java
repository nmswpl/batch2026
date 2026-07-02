package in.co.nmsworks.training.week3.day4;


import java.math.BigInteger;
import java.sql.*;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.*;

public class JdbcPractice {

        public static void main(String[] args) throws SQLException {
            JdbcPractice jdbcPractice = new JdbcPractice();
            jdbcPractice.readDb();
            //jdbcPractice.executeUpdate();
            jdbcPractice.updateQueryExample();
            jdbcPractice.readQueryExample(50);

        }
    private void readQueryExample(int ids) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/training";
        String user = "nms-training";
        String password = "";
        String query = "select * from studentinfo where id = ?";

        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement ps = connection.prepareStatement(query)) {

            ps.setInt(1, ids);

            try (ResultSet resultSet = ps.executeQuery()) {
                if (resultSet.next()) {
                    System.out.println(resultSet.getInt(1));
                    System.out.println(resultSet.getString(2));
                } else {
                    System.out.println("No student found with ID: " + ids);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    private void updateQueryExample() {
            String query ="update studentinfo set name = ? where id = ?";
            try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training","");PreparedStatement ps = connection.prepareStatement(query);) {
                ps.setString(1,"sujaritha");
                ps.setInt(2,50);
                int val = ps.executeUpdate();
                System.out.println("prepare statement excuted"+val);
                readDb();
            } catch (SQLException e) {
                e.printStackTrace();
            }
    }

    private void executeUpdate() {
            try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training",""); Statement statement = connection.createStatement();) {
                int res = statement.executeUpdate("insert into studentinfo(id,name,city,cgpa) values (94,'rajiv','chennai',9.9)");

                System.out.println(res);
                readDb();


            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
    }

    private void readDb() {
            try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","nms-training",""); Statement statement = connection.createStatement()){
                ResultSet resultSet = statement.executeQuery("select  * from studentinfo");
                while (resultSet.next()){
                    int id = resultSet.getInt(1);
                    String name = resultSet.getString(2);
                    String city = resultSet.getString(3);
                    double cgpa = resultSet.getDouble(4);
                    String dept = resultSet.getString(5);
                    Date dob = resultSet.getDate(6);
                    BigInteger ph = BigInteger.valueOf(resultSet.getLong((7)));
                    System.out.println("-------------");
                    System.out.println("id "+id);
                    System.out.println("name : "+name);
                    System.out.println("City :"+city);
                    System.out.println("cgpa :"+cgpa);
                    System.out.println("dept : "+dept);
                    System.out.println("Dob : "+dob);
                    System.out.println("ph : "+ph);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }


