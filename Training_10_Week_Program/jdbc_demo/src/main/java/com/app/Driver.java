package com.app;

import java.sql.Date;

import com.app.model.Card;
import com.app.repository.impl.CardRepositoryImpl;
import com.app.service.CardService;

public class Driver {

	public static void main(String[] args) {
		
		/*
		 * Note that we do not ordinarily call methods that are present on our repository directly.
		 * We usually pass this data through our service layer.
		 * This means that we should be using our CardService in this layer - NOT our CardRepository.
		 */
		CardService cardService = new CardService();
		CardRepositoryImpl cri = new CardRepositoryImpl();
//		Card toBeInserted = new Card(0, "Water Elf", 2, true, new Date(1998, 7, 4));
//		cri.insert(toBeInserted);
		
//		System.out.println(cri.findByName("Fire Ant"));
		
//		System.out.println(cri.findAll());
		
		cardService.findAllOmittingType(3);

	}

}
