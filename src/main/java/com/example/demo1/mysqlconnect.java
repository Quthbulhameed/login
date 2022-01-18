package com.example.demo1;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class mysqlconnect {
    Connection conn = null;
    public static Connection ConnectDb(){

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/market","root","root");
            JOptionPane.showMessageDialog(null, "Connection Established");
            return conn;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }

    }

}