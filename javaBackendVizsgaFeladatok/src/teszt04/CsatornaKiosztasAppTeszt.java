package teszt04;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import feladat04.Csatorna;
import feladat04.CsatornaKiosztasApp;

class CsatornaKiosztasAppTeszt {

	@Test
	void szamolcsatornakTeszt() {
		
		List<Csatorna> csatornaLista = new ArrayList<>();
        csatornaLista.add(new Csatorna("Csatorna1", "Kategoria1", "Nyelv1", 1, 2015));
        csatornaLista.add(new Csatorna("Csatorna2", "Kategoria2", "Nyelv2", 2, 2011));
        csatornaLista.add(new Csatorna("Csatorna3", "Kategoria3", "Nyelv3", 3, 2018));
        csatornaLista.add(new Csatorna("Csatorna4", "Kategoria4", "Nyelv4", 4, 2009));
        csatornaLista.add(new Csatorna("Csatorna5", "Kategoria5", "Nyelv5", 5, 2013));
        
        
        int elvartEredmeny = 4; // Az 2010 után alapított csatornák száma
        
        
        int tenylegesEredmeny = CsatornaKiosztasApp.szamolcsatornak(csatornaLista, 2010);
		
        		
        		assertEquals(elvartEredmeny, tenylegesEredmeny);
		
	}

}
