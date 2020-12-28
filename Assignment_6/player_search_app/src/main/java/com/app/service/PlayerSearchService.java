package com.app.service;

import java.util.List;

import com.app.exception.BusinessException;
import com.app.model.Player;

public interface PlayerSearchService {

	public Player getPlayerById(int id) throws BusinessException;
	public List<Player> getPlayerByTeamId(int teamId) throws BusinessException;
	public List<Player> getAllPlayers() throws BusinessException;
	public List<Player> getPlayersByDob(String dob) throws BusinessException;
}
