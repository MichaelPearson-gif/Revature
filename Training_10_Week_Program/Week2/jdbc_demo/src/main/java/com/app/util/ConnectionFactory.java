package com.app.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public static Connection getConnection() {

		Connection conn = null;

		try {
			conn = DriverManager.getConnection(System.getenv("dburl"), System.getenv("dbusername"),
					System.getenv("dbpassword"));
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return conn;

	}

}
