package in.co.nmsworks.training.week3.day4;

import java.sql.*;

public class JDBCPractise {
    public static void main(String[] args) {

        JDBCPractise practiseObj = new JDBCPractise();
        practiseObj.insertData("INSERT INTO studentinfo VALUES (27,'Pavithra','Villupuram','CSE',9.5,'7874929045','2008-11-05');");
//        practiseObj.selectData();
        practiseObj.insertData2("INSERT INTO studentinfo VALUES (?,?,?,?,?,?,?);",29,"Amizh","Cuddalore","Chemical", 8.0, "9488013847", Date.valueOf("2006-02-20"));
//        practiseObj.selectData();

        practiseObj.updateId("UPDATE studentinfo SET id = ? WHERE id = ?",2, 102);
        practiseObj.selectData();

    }

    private void updateId(String query,int oldId, int newId)
    {

        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "");
            PreparedStatement preparedStmt = con.prepareStatement(query);)
        {
            preparedStmt.setInt(1,newId);
            preparedStmt.setInt(2,oldId);

            preparedStmt.executeUpdate();
        }
        catch(Exception e ){

        }
    }


    private void insertData2(String query, int id, String name, String city, String dept, double cgpa, String phno, Date dob ) {
        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "");
            PreparedStatement preparedStmt = con.prepareStatement(query);)
        {

            preparedStmt.setInt(1, id);
            preparedStmt.setString(2,name);
            preparedStmt.setString(3,city);
            preparedStmt.setString(4,dept);
            preparedStmt.setDouble(5,cgpa);
            preparedStmt.setString(6,phno);
            preparedStmt.setDate(7, dob);

            preparedStmt.executeUpdate();


        }catch(Exception e){

        }
    }

    private void insertData(String query) {

        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "");
             Statement stmt = con.createStatement();) {
            stmt.executeUpdate(query);

        } catch (Exception e) {

        }
    }


    private void selectData(){
        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "");
            Statement stmt = con.createStatement();){

            ResultSet result = stmt.executeQuery("SELECT * FROM studentinfo");
            System.out.println("ID, Name, City, Dept, CGPA, Phno, DOB");
            while(result.next()){
                System.out.print(result.getInt("ID") + " , ");
                System.out.print(result.getString("Name")+ " , ");
                System.out.print(result.getString("City")+ " , ");
                System.out.print(result.getString("Dept")+ " , ");
                System.out.print(" CGPA : " + result.getFloat("CGPA")+ " , ");
                System.out.print(" Phno : " + result.getString("Phno")+ " , ");
                System.out.print(" DOB : " + result.getDate("DOB"));
                System.out.println();
            }

        }catch(Exception e){

        }
    }
}
