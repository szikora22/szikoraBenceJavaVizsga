package feladat03;

import java.util.Map;

public class VizsgaztatoApp {

	public static void main(String[] args) {
		
		AdatKezeles adatObj = new AdatKezeles();
		
		Map<String, Vizsgazo> vizsgazok = adatObj.adatBekeres();
		
	
		
		
		System.out.println("Vizsgázók adatai:");
        for (Map.Entry<String, Vizsgazo> entry : vizsgazok.entrySet()) {
            System.out.println("Azonosító: " + entry.getKey());
            System.out.println("Adatai: " + entry.getValue());
            System.out.println();
        }
        
    
        String keresettIntezmeny = "ProfiSuli";
        boolean erkezettE = ellenorizIntezmeny(vizsgazok, keresettIntezmeny);
        
     
        if (erkezettE) {
            System.out.println("Érkezett vizsgázó a(z) " + keresettIntezmeny + " intézményből.");
        } else {
            System.out.println("Nem érkezett vizsgázó a(z) " + keresettIntezmeny + " intézményből.");
        }
    }

	
	
	
    
    
    public static boolean ellenorizIntezmeny(Map<String, Vizsgazo> vizsgazok, String intezmeny) {
        for (Vizsgazo vizsgazo : vizsgazok.values()) {
            if (vizsgazo.getIntezmenyNev().equals(intezmeny)) {
                return true; 
            }
        }
        return false; 
    }
    
    
	

}
