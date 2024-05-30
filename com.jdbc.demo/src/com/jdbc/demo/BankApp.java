package com.jdbc.demo;

import java.sql.*;

public class BankApp {

	static String url = "jdbc:mysql://localhost/febOb";
	static String user = "root";
	static String password = "MyPassword";

	public static void main(String[] args) throws SQLException {
//		createTable();
		crateAccount();
		// updateAccount();
	}

	public static void createTable() throws SQLException {

		String sql = "CREATE TABLE bank1(accNum INT, name VARCHAR(10), balance INT)";
		Connection con = DriverManager.getConnection(url, user, password);
		Statement st = con.createStatement();
		st.executeUpdate(sql);
	}

	public static void crateAccount() throws SQLException {

		String sql = "INSERT INTO bank VALUES(2222,'ayuse',12),(2,'ayuseasdf',122)";
		Connection con = DriverManager.getConnection(url, user, password);
		Statement st = con.createStatement();
		st.executeUpdate(sql);
	}

	public static void updateAccount() throws SQLException {
		String sql1 = "UPDATE bank SET balance=223 WHERE accNum = 2222";
		String sql2 = "UPDATE bank SET balance=2 WHERE accNum = 2";

		Connection con = DriverManager.getConnection(url, user, password);
		Statement st = con.createStatement();
		st.executeUpdate(sql1);
	}

}