package com.nure.tikhomirova.taxiManager.controllers;

import java.sql.*;

public class test {
	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost/testdb";

	// Database credentials
	static final String USER = "root";
	static final String PASS = "root";

	public static void doWork() {
		Connection conn = null;
		Statement stmt = null;
		try {
			// STEP 2: Register JDBC driver
			Class.forName("com.mysql.jdbc.Driver");

			// STEP 3: Open a connection
			conn = DriverManager.getConnection(DB_URL, USER, PASS);

			// STEP 4: Execute a query
			stmt = conn.createStatement();
			String sql;
			sql = "INSERT INTO users(username,password,enabled) VALUES ('user1','userpassword1', TRUE);";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.executeUpdate();

			// STEP 6: Clean-up environment
			stmt.close();
			conn.close();
		} catch (SQLException se) {
			// Handle errors for JDBC
			se.printStackTrace();
		} catch (Exception e) {
			// Handle errors for Class.forName
			e.printStackTrace();
		} finally {
			// finally block used to close resources
			try {
				if (stmt != null)
					stmt.close();
			} catch (SQLException se2) {
			}// nothing we can do
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}// end finally try
		}// end try
	}// end main
}// end FirstExample
