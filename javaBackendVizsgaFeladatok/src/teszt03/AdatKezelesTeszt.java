package teszt03;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import feladat03.AdatKezeles;

class AdatKezelesTeszt {

	@Test
	void azonositoGeneralasTeszt() {
		
		AdatKezeles adatObj = new AdatKezeles();

		String elvartEredmeny = "Vizsgazo1";
		
		assertEquals(elvartEredmeny,adatObj.azonositoGeneralas());
		
	}

}
