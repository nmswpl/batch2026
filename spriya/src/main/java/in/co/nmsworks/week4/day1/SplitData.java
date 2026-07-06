package in.co.nmsworks.week4.day1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class SplitData {


    public void readFile(){
        try(BufferedReader reader =new BufferedReader(new FileReader("/home/nms-training/Downloads/financial-year-provisional-size-bands.csv"))){

            reader.readLine();
            String line="";

            while((line=reader.readLine())!=null){
                String [] str=line.split(",");

                List<String> list=new ArrayList<>();
                for (String s : str) {
                    list.add(s);
                }

                String[] tableName=str[str.length-1].split("\"");
                String name=tableName[1];
                //System.out.println(name);

                if(name.equals("COUNT")){
                    countDb(list);

                }
                else{
                    amountDb(list);
                }

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void countDb(List<String>list){

        try(Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/splitdata","nms-training","");
            PreparedStatement statement=con.prepareStatement("insert into count_data values(?,?,?,?,?,?)")){

            statement.setInt(1,Integer.parseInt(list.get(0)));
            statement.setString(2,list.get(1));
            statement.setString(3,list.get(2));
            statement.setString(4,list.get(3));
            statement.setString(5,list.get(4));
            statement.setString(6,list.get(5));

            statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void amountDb(List<String>list){

        try(Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/splitdata","nms-training","");
            PreparedStatement statement=con.prepareStatement("insert into amount_data values(?,?,?,?,?,?)")){

            statement.setInt(1,Integer.parseInt(list.get(0)));
            statement.setString(2,list.get(1));
            statement.setString(3,list.get(2));
            statement.setString(4,list.get(3));
            statement.setString(5,list.get(4));
            statement.setString(6,list.get(5));

            statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
