package com.app.service.impl;

import java.util.List;

import com.app.exception.BusinessException;
import com.app.model.Player;
import com.app.service.PlayerSearchService;

public class PlayerSearchServiceImpl implements PlayerSearchService {

	@Override
	public Player getPlayerById(int id) throws BusinessException {
		Player player = null;
		if (id > 0 && id < 100) {
			//code here for DAO
		}else {
			throw new BusinessException("Enter Player Id " + id + " is INVALID.....");
		}
		return player;
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
