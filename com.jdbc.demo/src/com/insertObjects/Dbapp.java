package com.insertObjects;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Dbapp {
	public static void insertObject(Student s) {
		int roll = s.getRoll();
		String name = s.getName();
		String branch = s.getBrach();
		//jdbs
		String url = "jdbc:mysql://localhost/febOb";
		String user = "root";
		String password = "MyPassword";
		String sql = "INSERT INTO studentTable VALUES(?,?,?)";

		try {
			Connection con = DriverManager.getConnection(url, user, password);
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, roll);
			ps.setString(2, name);
			ps.setString(3, branch);
			ps.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
