package teszt01;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import feladat01.KategorizaloApp;

class KategorizaloAppTeszt {

	@Test
	void kategorizalTeszt() {
		
		int kod = 2;
		String elvartSzoveg = "II. osztályú termék";
		
		assertEquals(elvartSzoveg, KategorizaloApp.kategorizal(kod));
		
	}
	
	@Test
	void osztalyMeghatarozasTeszt() {
		
		int kod = 1;
		int alapar = 1500;
		
		int elvartErtek = 1500;
		
		
		
	}

}
