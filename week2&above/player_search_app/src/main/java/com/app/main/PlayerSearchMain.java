package com.app.main;

import java.util.Scanner;

public class PlayerSearchMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to PlayerSearch App V1.0");
		System.out.println("--------------------------------------");
		int ch = 0;
		do {
			System.out.println("PLAYER SEARCH MENU");
			System.out.println("==========================");
			System.out.println("1) By ID");
			System.out.println("2) By Team ID");
			System.out.println("3) By Dob");
			System.out.println("4) Show All Players");
			System.out.println("9) Exit");
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
				}catch (NumberFormatException e) {
					System.out.println("Player Id cannot be special characters or symbols or white spaces. It is numeric");
				}
				break;
			case 2:
				System.out.println("Thank you for your interest this option is still under construction");
				
				break;
			case 3:
				System.out.println("Thank you for your interest this option is still under construction");
				
				break;
			case 4:
				System.out.println("Thank you for your interest this option is still under construction");
				
				break;
			case 5:
				System.out.println("Thank you for using out PlayerSearch App V1.0");
				
				break;
			
			}
		}while(ch != 5);

	}

}
