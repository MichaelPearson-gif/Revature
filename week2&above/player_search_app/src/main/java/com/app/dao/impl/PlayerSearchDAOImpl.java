package com.app.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.app.dao.dao.PlayerSearchDAO;
import com.app.dao.dbutil.PostgresqlConnection;
import com.app.exception.BusinessException;
import com.app.model.Player;
import com.app.service.PlayerSearchService;

public class PlayerSearchDAOImpl implements PlayerSearchDAO {

	private class PlayerSearchServiceImpl implements PlayerSearchService{
		

		@Override
		public Player getPlayerById(int id) throws BusinessException {
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
			return null;
		}

		@Override
		public Player getPlayerByTeamId(int teamId) throws BusinessException {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<Player> getAllPlayers() throws BusinessException {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<Player> getPlayersByDob(String dob) throws BusinessException {
			// TODO Auto-generated method stub
			return null;
		}
	}
		

}
