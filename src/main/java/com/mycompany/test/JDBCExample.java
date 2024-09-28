package com.mycompany.test;

import java.security.spec.ECField;
import java.sql.*;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Stream;

public class JDBCExample {

    public static void main(String[] args) {


        try {


            /*Drivers can register themselves with the DriverManager using the
            DriverManager.registerDriver(Driver driver) method.
           When a JDBC driver is loaded (typically via Class.forName()),
            it automatically calls DriverManager.registerDriver() internally to register itself.
*/
            Class.forName("com.mysql.cj.jdbc.Driver");// after jdbc 4 this line not needed... because jdbc driver automatically load it.
//            DriverManager.registerDriver();
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cafe", "root", "root");

            Statement st = con.createStatement();


//            String insertSQL = "INSERT INTO product (name, description, price) VALUES ('Djhala', 'Dhaka is dhaka', 999)";

//            int insert = st.executeUpdate(insertSQL);
//            if (insert>0){
//                System.out.println("data save successfully.");
//            }

            ResultSet rs = st.executeQuery("select * from product");

            while (rs.next()){
                System.out.println(rs.getInt(1)+ " "+ rs.getString(2)+" "+ rs.getString(3)+" " + rs.getInt(4));
            }


        con.close(); /// after java 7 this line is not needed because try catch block automatically close the Connection, Statement and resultset.
        }catch (Exception e){
            System.out.println(e);
        }

    }




}

class ConnectionTest{

    int b = 20;

    public static void main(String[] args) {



        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Properties prop = new Properties();
            prop.setProperty("user","root");
            prop.setProperty("password", "root");

            Connection con = DriverManager.getConnection( "jdbc:mysql://localhost:3306/cafe", prop);

            Statement stm = con.createStatement();
//            String sql = "insert into product (name, description) values ('sakib', 'rakib lives in dhaka');";
//          String sql = "delete from product where id = 6";
//            String sql = "update product set price =120 where id =12";
//            String sql = "update product set price =120, name = 'sajeebs', description = 'sajeebs' where id =15";
//            int value = stm.executeUpdate(sql);



            ResultSet rs = stm.executeQuery("select * from product");


            while (rs.next()){
                System.out.println(rs.getInt(1) + " "+ rs.getString(2) +" "+ rs.getString(3) + " "+ rs.getInt(4));
            }

        rs.close();

//            ResultSet rs = stm.executeQuery("select * from product");



        }catch (Exception e){
            System.out.println();
        }
    }
}



class ConAndGetData{

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cafe", "root", "root");
            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from product");

            while (resultSet.next()){
                System.out.println(resultSet.getInt(1)+ " "+ resultSet.getString(2)+ " "+ resultSet.getString(3));
            }


        }catch (Exception e){

        }


    }


}

class  ConAndIsertData{


    public static void main(String[] args) {

        try {
            Class.forName("java.sql.DriverManager");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cafe", "root", "root");
            Statement statement = connection.createStatement();

            int s = statement.executeUpdate("insert into product( name) values ('Sajeebssssssssssssssss');");

                if (s>0){
                    System.out.println("Data saved");
                }


        }catch (Exception e){
            System.out.println( e);
        }

    }


}

class ConAndUpdateByID{

    public static void main(String[] args) {

            try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cafe", "root", "root");

      Statement statement = connection.createStatement();

      int insert = statement.executeUpdate("update product set description = 'Dhaka', name ='Sajeeb' where id = 20");

      if (insert>0){
          System.out.println("data updated");
      }






            } catch (Exception e) {
                e.printStackTrace();
            }




    }
}

class ConAndDeleteByID{

    public static void main(String[] args) {
        try {
            Class.forName("java.sql.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cafe", "root", "root");
            Statement statement = connection.createStatement();
            int delete = statement.executeUpdate("delete from product where id =20");
            if (delete>0){
                System.out.println("Delete succefully");
            }




        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

class ConAndRetriveByID{

    public static void main(String[] args) {
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cafe","root", "root");

            Statement statement =connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from product where id = 21");

            while (resultSet.next()){
                System.out.println(resultSet.getInt(1)+ " "+ resultSet.getString(2) + " "+ resultSet.getString(3));
            }



        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}


class StatmentMethod{

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection  connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cafe", "root", "root");
            Statement statement = connection.createStatement();


            statement.addBatch("delete from product where id = 7");
            statement.addBatch("update product set name ='RakibUpdate' where id = 8");

            statement.executeBatch();



//            String sql = "select * from product";
//            String sql = "delete from product where id =16";
//
//            boolean execute = statement.execute(sql);
////            int execute = statement.executeUpdate(sql);
//
//                    ResultSet rs = statement.getResultSet();
//                if (execute){
//
//                    while (rs.next()){
//                        System.out.println("Product ID: "+ rs.getInt(1));
//                        System.out.println("Product Description: "+ rs.getString(2));
//                        System.out.println("Product Name: "+ rs.getString(3));
//                    }
//                }else {
//                    int udateCout = statement.getUpdateCount();
//                    System.out.println(udateCout+" row's affected");
//            }


        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}


class ResultSetInterfaceTest{

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/myhiber", "root", "root");
            Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);



            ResultSet resultSet = statement.executeQuery("select * from student");


            // Move to the previous row (if possible)
//            if (resultSet.previous()) {
//                System.out.println(resultSet.getInt("id")+ " "+ resultSet.getString("address") + " "+ resultSet.getString("name"));
//            } else {
//                System.out.println("No previous row available.");
//            }

//            resultSet.absolute(18);
//            resultSet.first();

            resultSet.absolute(6);

            if (resultSet.relative(-5)){

                System.out.println(resultSet.getInt("id")+ " "+ resultSet.getString("address") + " "+ resultSet.getString("name"));
            }

//            while (resultSet.previous()){
//
//            System.out.println(resultSet.getInt("id")+ " "+ resultSet.getString("address") + " "+ resultSet.getString("name"));
//            }




        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}



