package jdbc_demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) {
//		System.out.println("Hello World with Maven");

		Connection connection = null;
		
		try {
			// Step 1 - Load Driver
			Class.forName("org.postgresql.Driver");
			System.out.println("Driver Loaded Successfully");
			// Step 2 - Open Connection (url, username, password)
			String url = "jdbc:postgresql://localhost:5432/postgres";
			String username1 = "postgres";
			String password = "trxr4kidz";
			connection = DriverManager.getConnection(url, username1, password);
			System.out.println("Connection Successful");
			// Step 3 - Create Statement
			Statement statement = connection.createStatement();
			String sql = "select id,name,team_id from test.player order by team_id";
			// Step 4 - Execute Query
			ResultSet resultSet = statement.executeQuery(sql);
			System.out.println("Query executed");
			// Step 5 - Process Results
			while (resultSet.next()) {
				System.out.println("Id: " + resultSet.getInt("id"));
				System.out.println("Name: " + resultSet.getString("name"));
				System.out.println("Team Id: " + resultSet.getInt("team_id"));
			}
			System.out.println("Results Processed");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e);;
		}
		finally {
			try {
				// Step 6 - Close Connection
				connection.close();
				System.out.println("Connection closed");
			}catch(SQLException e) {
				System.out.println(e);
			}
		}
	}

}
