package com.app.service.impl;

import java.util.List;

import com.app.dao.dao.PlayerSearchDAO;
import com.app.dao.impl.PlayerSearchDAOImpl;
import com.app.exception.BusinessException;
import com.app.model.Player;
import com.app.service.PlayerSearchService;

public class PlayerSearchServiceImpl implements PlayerSearchService {
	
	// Create an instance to the DAO Implementation Layer
	private PlayerSearchDAO playerSearchDAO = new PlayerSearchDAOImpl();

	@Override
	public Player getPlayerById(int id) throws BusinessException {
		Player player = null;
		if (id > 0 && id < 100) {
			//code here for DAO
			player = playerSearchDAO.getPlayerById(id);
		}else {
			throw new BusinessException("Enter Player Id " + id + " is INVALID.....");
		}
		return player;
	}

	@Override
	public List<Player> getPlayerByTeamId(int teamId) throws BusinessException {
		List<Player> playersTeamList = null;
		if (teamId >= 100 && teamId < 1000) {
			playersTeamList = playerSearchDAO.getPlayerByTeamId(teamId);
		}else {
			System.out.println("Enter Team Id " + teamId + " is INVALID.....");
		}
		return playersTeamList;
	}

	@Override
	public List<Player> getAllPlayers() throws BusinessException {

		List<Player> allPlayersList = null;
		allPlayersList = playerSearchDAO.getAllPlayers();
		return allPlayersList;
	}

	@Override
	public List<Player> getPlayersByDob(String dob) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

}
