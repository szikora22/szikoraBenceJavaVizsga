package feladat04;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsatornaKiosztasApp {

	public static void main(String[] args) throws IOException {
		
		FajlKezeles fajlObj = new FajlKezeles();
		List<Csatorna> csatornak = fajlObj.fajlBeolvas("kiosztas.csv", ",");
		
		for (Csatorna csatorna : csatornak) {
			
			if(csatorna.getAlapitasEve() > 2010) {
				
				System.out.println(csatorna.toString());
				
			}
			
		}
		
		int csatornaSzam = szamolcsatornak(csatornak,2010);
		
		System.out.println("2010 utáni csatornák száma: " + csatornaSzam);
		
		
		List<Csatorna> csatornak2010Utan = new ArrayList<>();
		
		for (Csatorna csatorna : csatornak) {
			
			if(csatorna.getAlapitasEve() > 2010) {
				
				csatornak2010Utan.add(csatorna);
				
			}
		}
		
				
		//fajlObj.fajlbaIr(csatornak2010Utan,"csatorna2010utan.csv",",");
		
		
	}

	public static int szamolcsatornak(List<Csatorna> csatornak, int ev) {
		int szam = 0;
        for (Csatorna csatorna : csatornak) {
            if (csatorna.getAlapitasEve() > ev) {
                szam++;
            }
        }
        return szam;
	}

}
