package com.app.main;

import java.util.List;
import java.util.Scanner;

import com.app.exception.BusinessException;
import com.app.model.Player;
import com.app.service.PlayerSearchService;
import com.app.service.impl.PlayerSearchServiceImpl;

public class PlayerSearchMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to PlayerSearch App V1.0");
		System.out.println("--------------------------------------");
		int ch = 0;
		PlayerSearchService playerSearchService = new PlayerSearchServiceImpl();
		do {
			System.out.println("PLAYER SEARCH MENU");
			System.out.println("==========================");
			System.out.println("1) By ID");
			System.out.println("2) By Team ID");
			System.out.println("3) By Dob");
			System.out.println("4) Show All Players");
			System.out.println("5) Exit");
			System.out.println("Please enter appropriate choice between 1-5");
			try {
				ch = Integer.parseInt(sc.nextLine());
			}catch (NumberFormatException e) {
				
			}
			switch (ch) {
			case 1:
				System.out.println("Enter Player Id to get Player Details...");
				try {
					int id = Integer.parseInt(sc.nextLine());
					// code to service
					Player player = playerSearchService.getPlayerById(id);
					if (player != null) {
						System.out.println("Player found with id: " + id + " details of player is: ");
						System.out.println(player);
					}
				}catch (NumberFormatException e) {
					System.out.println("Player Id cannot be special characters or symbols or white spaces. It is numeric");
				} catch (BusinessException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 2:
				System.out.println("Enter a Team Id to get all players that are on that team");
				try {
					int teamId = Integer.parseInt(sc.nextLine());
					List<Player> playersTeamList = playerSearchService.getPlayerByTeamId(teamId);
					if (playersTeamList != null && playersTeamList.size() > 0) {
						System.out.println("There are " + playersTeamList.size() + " number of player/s on team " + teamId + " ... Printing their details");
						for (Player p:playersTeamList) {
							System.out.println(p);
						}
					}
				} catch (NumberFormatException e) {
					System.out.println("Team Id cannot be special characters or symbols or white spaces. It is numeric");
				}catch (BusinessException e) {
					System.out.println(e.getMessage());
				}
				
				break;
			case 3:
				System.out.println("Enter a date to see all players born on that day");
				String dob = sc.nextLine();
				try {
					List<Player> playersDOBList = playerSearchService.getPlayersByDob(dob);
					if (playersDOBList != null && playersDOBList.size() > 0) {
						System.out.println("There are " + playersDOBList.size() + " number of player/s on team " + dob + " ... Printing their details");
						for (Player p:playersDOBList) {
							System.out.println(p);
						}
					}
				} catch (BusinessException e) {
					System.out.println(e.getMessage());
				}
				
				break;
			case 4:
				System.out.println("Retrieving all the players from backend");
				try {
					List<Player> allPlayersList = playerSearchService.getAllPlayers();
					if (allPlayersList != null && allPlayersList.size() > 0) {
						System.out.println("There are " + allPlayersList.size() + " number of player/s... Printing their details...");
						for (Player p:allPlayersList) {
							System.out.println(p);
						}
					}
				} catch (BusinessException e) {
					System.out.println(e.getMessage());
				}
				
				break;
			case 5:
				System.out.println("Thank you for using out PlayerSearch App V1.0... Have a good one... :");
				
				break;
				
			default: System.out.println("Invalid menu option... Kindly Retry...........!!!!");
				
				break;
			
			}
		}while(ch != 5);

	}

}
