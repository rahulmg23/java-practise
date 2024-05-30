package com.kn.jdbc.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String URL = "jdbc:mysql://localhost:3306/University";
		String USER_NAME = "root";
		String PASSWORD = "root";
				
		  try {
		      // 1. Load & Register Driver
		      Class.forName("com.mysql.cj.jdbc.Driver");
		      // FQCN(Fully Qualified Class Name) - Canonical Name
		      System.out.println("====>Driver Loaded and Registered Successfully!");
		      // 2. Establish the connection with Database
		      
		      Connection con = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
		      System.out.println("====>Connection established successfully");
		     
		      //3 Create a object
		      Statement stmt = con.createStatement();
		      //4 
		      stmt.execute(CREATE_STUDENT_QUERY);
		      System.out.println("stud 6 table created succefully");
		    } catch (ClassNotFoundException e) {
		      System.out.println("Driver not found");
		      e.printStackTrace();
		    } catch (SQLException e) {
		      System.out.println("Failed to establish connection");
		      e.printStackTrace();
		    }

		  }

		}