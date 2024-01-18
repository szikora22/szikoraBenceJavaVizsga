package teszt03;

import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

import feladat03.Vizsgazo;
import feladat03.VizsgaztatoApp;

class VizsgaztatoAppTeszt {

	@Test
	void ellenorizIntezmenyTeszt() {

		Map<String, Vizsgazo> vizsgazok = new HashMap<>();
        vizsgazok.put("1", new Vizsgazo("Teszt1", "teszt1@example.com", "ProfiSuli"));
        vizsgazok.put("2", new Vizsgazo("Teszt2", "teszt2@example.com", "MásIntezmeny"));
        vizsgazok.put("3", new Vizsgazo("Teszt3", "teszt3@example.com", "IsmeretlenIntézmény"));
        
        
        
        assertEquals(true, VizsgaztatoApp.ellenorizIntezmeny(vizsgazok, "ProfiSuli"));
        assertEquals(false, VizsgaztatoApp.ellenorizIntezmeny(vizsgazok, "MásIntezmeny"));
        assertEquals(false, VizsgaztatoApp.ellenorizIntezmeny(vizsgazok, "IsmeretlenIntézmény"));
	}

}
