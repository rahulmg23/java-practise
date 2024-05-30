package com.jdbc.demo;
import java.sql.*;

public class ConnectionDemo {

    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost/febOb";
        String user = "root";
        String password = "MyPassword";
        Connection con = null;

        try {
            con = DriverManager.getConnection(url, user, password);
            System.out.println("Connection established successfully" + con);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
