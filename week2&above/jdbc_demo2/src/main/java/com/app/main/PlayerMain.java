package com.app.main;

import java.util.Date;
import java.util.List;

import com.app.dao.PlayerCrudDAO;
import com.app.dao.impl.PlayerCrudDAOImpl;
import com.app.exception.BusinessException;
import com.app.model.Player;

public class PlayerMain {

	public static void main(String[] args) {
		
		PlayerCrudDAO dao = new PlayerCrudDAOImpl();
		
//		Player p = new Player(12, "Jake Henshaw", 102, new Date());
//		
//		// Creating a new player in our DB
//		try {
//			if (dao.createPlayer(p) != 0) {
//				System.out.println("Player created successfully");
//			}
//		} catch (BusinessException e) {
//			System.out.println(e.getMessage());;
//		}
		
		try {
			Player player = dao.getPlayerById(10);
			if (player != null) {
				System.out.println("Details of player with id " + player.getId());
				System.out.println(player);
			}
		} catch (BusinessException e) {
			
			System.out.println(e.getMessage());
		}
		

//		try {
//			List<Player> playerList = dao.getAllPlayers();
//			if (playerList != null && playerList.size() != 0) {
//				System.out.println("\n\nFound " + playerList.size() + " players in DB... Printing them all");
//				for (Player p:playerList) {
//					System.out.println(p);
//				}
//			}
//		} catch (BusinessException e) {
//			System.out.println(e.getMessage());
//		}
		
		try {
			dao.updatePlayerTeamId(1, 100);
			System.out.println("Changed player's team id");
			
		} catch (BusinessException e) {
			
			System.out.println(e.getMessage());
		}
	}

}
