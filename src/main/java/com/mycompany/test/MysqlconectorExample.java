package com.mycompany.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MysqlconectorExample {


    public static void main(String[] args) {


        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cafe?useSSL=false", "root", "root");

            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("select * from product");

            while (rs.next()){
                System.out.println(rs.getInt(1)+ " "+ rs.getString(2)+ " "+ rs.getString(3));
            }

        }catch (Exception e){
            System.out.println(e);
        }


    }





}
