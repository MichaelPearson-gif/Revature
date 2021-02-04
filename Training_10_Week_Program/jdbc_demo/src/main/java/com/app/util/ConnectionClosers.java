package com.app.util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * This is an optional utility 
 */

public class ConnectionClosers {

	public static void close(Connection conn) {
		try {
			conn.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void close(Statement stmt) {
		try {
			stmt.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void close(ResultSet resultSet) {
		try {
			resultSet.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
}
