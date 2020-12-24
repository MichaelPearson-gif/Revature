package com.app.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.app.dao.PlayerSearchDAO;
import com.app.dao.dbutil.PostgresqlConnection;
import com.app.exception.BusinessException;
import com.app.model.Player;

public class PlayerSearchDAOImpl implements PlayerSearchDAO{

	@Override
	public Player getPlayerByName(String name) throws BusinessException {
		Player player = null;
		try(Connection connection = PostgresqlConnection.getConnection()){
			String sql = "select id, name, team_id, dob from test.player where name = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, name);
			ResultSet resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				player = new Player();
				player.setId(resultSet.getInt("id"));
				player.setName(resultSet.getString("name"));
				player.setTeamId(resultSet.getInt("team_id"));
				player.setDob(resultSet.getDate("dob"));
			}else {
				throw new BusinessException("No Player found with the name  " + name);
			}
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e); // Take off this line when app is live
			throw new BusinessException("Internal error occured contact SYSADMIN");
		}
		return player;
	}

	@Override
	public List<Player> getPlayersByTeamId(int teamId) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

}
