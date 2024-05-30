package com.jdbc.demo;

import java.sql.*;

public class CreateTable {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost/febOb";
        String user = "root";
        String password = "MyPassword";
        String sql = "CREATE TABLE IF NOT EXISTS student(roll INT, name VARCHAR(255))";

        try (Connection con = DriverManager.getConnection(url, user, password);
             Statement st = con.createStatement()) {
            st.executeUpdate(sql);
            System.out.println("Table created successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
