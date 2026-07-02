package in.co.nmsworks.training.week3.Day4;

import java.sql.*;

public class JdbcPractice {
    public static void main(String[] args) throws SQLException {
        JdbcPractice jd = new JdbcPractice();
        //jd.excecuteQueryExample();
        //jd.executeUpdateExample();
        //jd.preparedStatementUpdate("Sujaritha");
        jd.displaySelect(24);

    }

    private void displaySelect(int ID) throws SQLException {

        String url = "jdbc:mysql://localhost:3306/TRAINING";
        String userName = "nms-training";
        String passWord = "";
        //String query = "UPDATE STUDENT_INFO SET NAME=? WHERE ID=24";
        String selectQuery = "SELECT * FROM STUDENT_INFO WHERE ID=?";

        try (Connection conn = DriverManager.getConnection(url, userName, passWord);
             PreparedStatement statement = conn.prepareStatement(selectQuery)) {

            statement.setInt(1, ID);
            //String query="DELETE FROM STUDENT_INFO WHERE ID=24";
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                String city = resultSet.getString(3);
                int cgpa = resultSet.getInt(4);
                String department = resultSet.getString(5);
                Date dob = resultSet.getDate(6);
                String phNo = resultSet.getString(7);

                System.out.println("Id: " + id);
                System.out.println("Name: " + name);
                System.out.println("city: " + city);
                System.out.println("cgpa: " + cgpa);
                System.out.println("department: " + department);
                System.out.println("dob: " + dob);
                System.out.println("phNo: " + phNo);
                System.out.println("\n");

            }
        }
    }
}


//    private void preparedStatementUpdate(String name) throws SQLException {
//        String url = "jdbc:mysql://localhost:3306/TRAINING";
//        String userName = "nms-training";
//        String passWord = "";
//        String query = "UPDATE STUDENT_INFO SET NAME=? WHERE ID=24";
//        String selectQuery="SELECT * FROM STUDENT_INFO WHERE ID=?";
//
//        try (Connection conn = DriverManager.getConnection(url, userName, passWord);
//             PreparedStatement statement = conn.prepareStatement(query)) {
//
//            statement.setString(1, name);
//            //String query="DELETE FROM STUDENT_INFO WHERE ID=24";
//            statement.executeUpdate();
//        }
//    }
//}

//    private void executeUpdateExample() throws SQLException {
//        String url = "jdbc:mysql://localhost:3306/TRAINING";
//        String userName = "nms-training";
//        String passWord = "";
//
//        try (Connection conn = DriverManager.getConnection(url, userName, passWord);
//             Statement statement = conn.createStatement()) {
//
//            String query = "INSERT INTO STUDENT_INFO(ID,NAME,CITY,CGPA,DEPT,DOB,PH_NO) VALUES (24,'HARIHARAN','CHENNAI',8.0,'IT','2004-05-26',8525028811)";
//            //String query="DELETE FROM STUDENT_INFO WHERE ID=24";
//            statement.executeUpdate(query);
//
//        }
//    }
//}

//    private void excecuteQueryExample() {
//
//        String url = "jdbc:mysql://localhost:3306/TRAINING";
//        String userName = "nms-training";
//        String passWord = "";
//
//        try (Connection conn = DriverManager.getConnection(url, userName, passWord);
//             Statement statement = conn.createStatement()) {
//
//            String query="SELECT * FROM STUDENT_INFO";
//            ResultSet resultSet = statement.executeQuery(query);
//
//            while (resultSet.next()) {
//                int id = resultSet.getInt(1);
//                String name = resultSet.getString(2);
//                String city = resultSet.getString(3);
//                int cgpa = resultSet.getInt(4);
//                String department = resultSet.getString(5);
//                Date dob = resultSet.getDate(6);
//                String phNo = resultSet.getString(7);
//
//                System.out.println("Id: "+id);
//                System.out.println("Name: "+name);
//                System.out.println("city: "+city);
//                System.out.println("cgpa: "+cgpa);
//                System.out.println("department: "+department);
//                System.out.println("dob: "+dob);
//                System.out.println("phNo: "+phNo);
//                System.out.println("\n");
//
//
//            }
//
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }
//}
