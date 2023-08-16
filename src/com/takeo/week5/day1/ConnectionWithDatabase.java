package com.takeo.week5.day1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionWithDatabase {
    public static void main(String[] args)  throws SQLException {
        String url= "jdbc:postgres://localhost:5432/postgres";
        String user = "postgres";
        String password ="postgres";
        Connection connection= DriverManager.getConnection(url,user,password);
        System.out.println("Connected");
        connection.close();
    }
}
