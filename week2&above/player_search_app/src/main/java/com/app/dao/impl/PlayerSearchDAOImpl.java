package com.app.dao.impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.app.dao.dao.PlayerSearchDAO;
import com.app.dao.dbutil.PostgresqlConnection;
import com.app.exception.BusinessException;
import com.app.model.Player;

public class PlayerSearchDAOImpl implements PlayerSearchDAO {

	@Override
	public Player getPlayerById(int id) throws BusinessException {
		Player player = null;
		try(Connection connection = PostgresqlConnection.getConnection()){
			String sql = "select * from test.player where id = ?";
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
	public List<Player> getPlayerByTeamId(int teamId) throws BusinessException {
		List<Player> playersTeamList = new ArrayList<>();
		
		try(Connection connection = PostgresqlConnection.getConnection()){
			String sql = "select id, name, team_id, dob from test.player where team_id = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, teamId);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				Player player = new Player();
				player.setId(resultSet.getInt("id"));
				player.setName(resultSet.getString("name"));
				player.setTeamId(resultSet.getInt("team_id"));
				player.setDob(resultSet.getDate("dob"));
				playersTeamList.add(player);
			}
			if (playersTeamList.size() == 0) {
				throw new BusinessException("No Player for that team in the DB so far");
			}
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e); // Take off this line when app is live
			throw new BusinessException("Internal error occured contact SYSADMIN");
		}
		return playersTeamList;
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
				throw new BusinessException("No Player in the DB so far");
			}
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e); // Take off this line when app is live
			throw new BusinessException("Internal error occured contact SYSADMIN");
		}
		return playersList;
	}

	@Override
	public List<Player> getPlayersByDob(String dob) throws BusinessException {
		List<Player> playersDOBList = new ArrayList<>();
		
		try(Connection connection = PostgresqlConnection.getConnection()){
			// Convert the string to a sql date type
			Date date = Date.valueOf(dob);
			String sql = "select id, name, team_id, dob from test.player where dob = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setDate(1, date);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				Player player = new Player();
				player.setId(resultSet.getInt("id"));
				player.setName(resultSet.getString("name"));
				player.setTeamId(resultSet.getInt("team_id"));
				player.setDob(resultSet.getDate("dob"));
				playersDOBList.add(player);
			}
			if (playersDOBList.size() == 0) {
				throw new BusinessException("No Player with that date of birth in the DB so far");
			}
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e); // Take off this line when app is live
			throw new BusinessException("Internal error occured contact SYSADMIN");
		}
		return playersDOBList;
	}
		

}
