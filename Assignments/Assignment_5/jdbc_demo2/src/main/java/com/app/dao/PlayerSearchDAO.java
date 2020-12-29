package com.app.dao;

import java.util.List;

import com.app.exception.BusinessException;
import com.app.model.Player;

public interface PlayerSearchDAO {

	public Player getPlayerByName(String name) throws BusinessException;
	public List<Player> getPlayersByTeamId(int teamId) throws BusinessException;
}
