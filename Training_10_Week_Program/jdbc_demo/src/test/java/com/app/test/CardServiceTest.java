package com.app.test;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.app.model.Card;
import com.app.repository.impl.CardRepositoryImpl;
import com.app.service.CardService;

public class CardServiceTest {
	
	/*
	 * I've identified my object under test as the CardService type. This means
	 * that I will need an instance of this type in order to test its methods.
	 * 
	 * We use the @InjectMocks annotation to inject our mocks into our object under
	 * test.
	 */
	
	@InjectMocks
	private static CardService cardService;
	
	/*
	 * We are now going to use Mockito to mock out our dependencies. In this case,
	 * our CardRepositoryImpl is a dependency of our CardService as our CardService's
	 * implementation depends heavily on the CardRepositoryImpl's implementation.
	 */
	
	@Mock
	private CardRepositoryImpl cardRepositoryImpl;
	
	@BeforeAll
	public static void setup() {
		cardService = new CardService();
	}
	
	@BeforeEach
	public void beforeSetup() {
		MockitoAnnotations.openMocks(this);
	}
	
	@Test
	public void testFindAllCardsOmittingType() {
		
		/*
		 * We can use Mockito to stub the return value for the findAllOmittingType
		 * method. This means we can control the output when this method is called AND
		 * that the actual method is never called.
		 */
		
		ArrayList<Card> myCards = new ArrayList<>(Arrays.asList(new Card(1, "Dragon Girl", 2, true, new Date(424234)),
						new Card(2, "Monster Under My Bed", 3, false, new Date(324525)),
								new Card(3, "Nubian Cat", 1, true, new Date(32423))
				));
		
		Mockito.when(cardRepositoryImpl.findAll()).thenReturn(myCards);
		
		List<Card> returnedCards = cardService.findAllOmittingType(1);
		
		for(Card c : returnedCards) {
			Assertions.assertNotEquals(1, c.getCardType());
		}
	}

	
}
