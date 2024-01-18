package teszt02;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import feladat02.Merkozes;

class MerkozesTeszt {

	@Test
	void MerkozesTest() {
		
		Merkozes meccs = new Merkozes("BajnokCsapat", "LegjobbCsapat");
		assertEquals(90, meccs.getIdotartam());
		
	}
	
}
