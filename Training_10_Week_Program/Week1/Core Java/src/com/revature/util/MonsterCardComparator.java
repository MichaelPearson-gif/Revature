package com.revature.util;

import java.util.Comparator;

import com.revature.model.MonsterCard;

/*
 * Comparator provides an additional, external method of defining an order for elements in a collection
 */

public class MonsterCardComparator implements Comparator<MonsterCard>{

	@Override
	public int compare(MonsterCard o1, MonsterCard o2) {
		
		/*
		 * We've chosen to order cards by their ID this time.
		 */
		return o1.getId() - o2.getId();
	}

}
