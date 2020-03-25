package TestCases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import USC_Booking.ChampionClass;

class TESTChampionClass {

	@Test
	void testChampionClass() {
		ChampionClass cc = new ChampionClass();
		int exp =0; //Expected
		int act=cc.income;
		assertEquals(exp,act);
		
	}


}