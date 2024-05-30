package com.jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost/febOb";
        String user = "root";
        String password = "MyPassword";
        String sql = "INSERT INTO student(roll, name) VALUES (1, 'John Doe')";

        try (Connection con = DriverManager.getConnection(url, user, password);
             Statement st = con.createStatement()) {
            st.executeUpdate(sql);
            System.out.println("Record inserted successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
