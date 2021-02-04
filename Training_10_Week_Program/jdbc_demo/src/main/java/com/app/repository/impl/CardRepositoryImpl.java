package com.app.repository.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.app.model.Card;
import com.app.repository.CardRepository;
import com.app.util.ConnectionClosers;
import com.app.util.ConnectionFactory;

/*
 * This class follows the Data Access Object (DAO) design pattern. 
 * The goal of using this class is to hava an object whose single responsibility is to interact with our data source (db in this case).
 */

public class CardRepositoryImpl implements CardRepository{

	@Override
	public void insert(Card card) {
		/*
		 * Generally, there is JDBC workflow that is easy to follow.
		 * You are always, for instance, going to need to grab a JDBC connection.
		 * After that, you will execute a SQL query.
		 * If my query should return a result set, I will store that result set.
		 * 
		 * NOTE: We will modify this method so that we are using a PreparedStatement instead of a simple Statement.
		 * A PreparedStatement protects against SQL injection by precompiling our SQL query and allowing us to 
		 * parameterize our user input.
		 * A PreparedStatement can also be re-used with new parameter values, which can make it faster than
		 * a simple Statement.
		 */
		
		Connection conn = null;
//		Statement stmt = null;
		PreparedStatement pstmt = null;
		
		/*
		 * Note that a PreparedStatement is parameterized.
		 * This means that we do need to pass in the values for those parameters later.
		 */
		final String sql = "INSERT INTO cards VALUES(DEFAULT ?, ?, ?, ?)";
		try {
			// Attempt to get a connection
			conn = ConnectionFactory.getConnection();
			
			//--------------------------------------------------------------------------
			// Old way
			
			// Use our connection to create a SQL query
//			stmt = conn.createStatement();
//			
//			// Execute your SQL query
//			final String sql = "INSERT INTO cards VALUES(" + card.getCardId() + ", '" + card.getCardName() + "', " 
//					+ card.getCardType() + ", " + card.isFaceUp() + ", '" + card.getDateCreated() + "')";
//			
//			stmt.execute(sql);
			//------------------------------------------------------------------------
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, card.getCardName());
			pstmt.setInt(2, card.getCardType());
			pstmt.setBoolean(3, card.isFaceUp());
			pstmt.setDate(4, card.getDateCreated());
			pstmt.executeQuery();
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			ConnectionClosers.close(conn);
			ConnectionClosers.close(pstmt);
		}
		
	}

	@Override
	public List<Card> findAll() {
		List<Card> cards = new ArrayList<>();
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet resultSet = null;
		final String sql = "SELECT * FROM cards";
		
		try {
			
			conn = ConnectionFactory.getConnection();
			stmt = conn.createStatement();
			resultSet = stmt.executeQuery(sql);
			
			while(resultSet.next()) {
				cards.add(
						new Card(
								resultSet.getInt(1),
								resultSet.getString(2),
								resultSet.getInt(3),
								resultSet.getBoolean(4),
								resultSet.getDate(5)
								)
						);
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			ConnectionClosers.close(conn);
			ConnectionClosers.close(stmt);
			ConnectionClosers.close(resultSet);
		}
		
		return cards;
	}

	@Override
	public Card findByName(String cardName) {
		
		Card returnedCard = null;
		
		Connection conn = null;
		Statement stmt = null;
		// We need a ResultSet this time to store the returned records.
		ResultSet resultSet = null;
		
		try {
			
			conn = ConnectionFactory.getConnection();
			stmt = conn.createStatement();
			
			final String sql = "SELECT * FROM cards WHERE card_name = '" + cardName + "'";
			
			resultSet = stmt.executeQuery(sql);
			
			if(resultSet.next()) {
				returnedCard = new Card(resultSet.getInt(1), 
						resultSet.getString(2), 
						resultSet.getInt(3),
						resultSet.getBoolean(4),
						resultSet.getDate(5));
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			ConnectionClosers.close(conn);
			ConnectionClosers.close(stmt);
		}
		
		return returnedCard;
	}

	@Override
	public void update(Card card) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Card card) {
		// TODO Auto-generated method stub
		
	}

}
