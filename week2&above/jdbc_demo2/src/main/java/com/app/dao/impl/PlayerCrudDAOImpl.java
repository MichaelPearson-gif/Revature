package com.app.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.app.dao.PlayerCrudDAO;
import com.app.dao.dbutil.PostgresqlConnection;
import com.app.exception.BusinessException;
import com.app.model.Player;

public class PlayerCrudDAOImpl implements PlayerCrudDAO{

	@Override
	public int createPlayer(Player player) throws BusinessException {
		int c = 0;
		// Perform steps 1, 2, and 6 of connecting DB
		try(Connection connection = PostgresqlConnection.getConnection()){
			
			// Step 3 of connecting to DB
			// ? corresponds to the placement of the values in test.player()
			String sql = "insert into test.player(id, name, team_id, dob) values(?, ?, ?, ?)";
			
			// Creating the Statement
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, player.getId());
			preparedStatement.setString(2, player.getName());
			preparedStatement.setInt(3, player.getTeamId());
			preparedStatement.setDate(4, new java.sql.Date(player.getDob().getTime())); // util.Date to sql.Date
			
			// Executing the Statement
			c = preparedStatement.executeUpdate();
			
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e); // Take off this line when app is live
			throw new BusinessException("Internal error occured contact SYSADMIN");
		}
		return c;
	}

	@Override
	public void deletePlayer(int id) {
		// TODO Auto-generated method stub
		String sql = "delete from test.player where id = ?";
		
	}

	@Override
	public int updatePlayerTeamId(int id, int teamId) throws BusinessException {
		int c = 0;
		
		try(Connection connection = PostgresqlConnection.getConnection()){
			
			String sql = "update test.player set team_id = ? where id = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, teamId);
			preparedStatement.setInt(2, id);
			
			c = preparedStatement.executeUpdate();
			
			
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e); // Take off this line when app is live
			throw new BusinessException("Internal error occured contact SYSADMIN");
		}
		return c;
	}

	@Override
	public Player getPlayerById(int id) throws BusinessException {
		Player player = null;
		
		try(Connection connection = PostgresqlConnection.getConnection()){
			String sql = "select name, team_id, dob from test.player where id = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				player = new Player();
				player.setId(id);
				player.setName(resultSet.getString("name"));
				player.setTeamId(resultSet.getInt("team_id"));
				player.setDob(resultSet.getDate("dob"));
			}else {
				throw new BusinessException("No Player found with Id " + id);
			}
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e); // Take off this line when app is live
			throw new BusinessException("Internal error occured contact SYSADMIN");
		}
		return player;
	}

	@Override
	public List<Player> getAllPlayers() throws BusinessException {
		List<Player> playersList = new ArrayList<>();
		
		try(Connection connection = PostgresqlConnection.getConnection()){
			String sql = "select id, name, team_id, dob from test.player";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				Player player = new Player();
				player.setId(resultSet.getInt("id"));
				player.setName(resultSet.getString("name"));
				player.setTeamId(resultSet.getInt("team_id"));
				player.setDob(resultSet.getDate("dob"));
				playersList.add(player);
			}
			if (playersList.size() == 0) {
				throw new BusinessException("No Player in teh DB so far");
			}
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e); // Take off this line when app is live
			throw new BusinessException("Internal error occured contact SYSADMIN");
		}
		return playersList;
	}
	

}
