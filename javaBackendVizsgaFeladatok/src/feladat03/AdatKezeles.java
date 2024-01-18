package feladat03;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AdatKezeles {
	
	private static int sorszam=0;
	
		
	public Map<String, Vizsgazo> adatBekeres(){
		
		Map<String, Vizsgazo> vizsgazok = new HashMap<String, Vizsgazo>();
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 4; i++) {
            System.out.println("Adatok bekérése a(z) " + (i + 1) + ". vizsgazóhoz:");
            System.out.print("Vizsgázó neve: ");
            String nev = sc.nextLine();

            System.out.print("Email címe: ");
            String email = sc.nextLine();

            System.out.print("Képző intézmény neve: ");
            String kepzoIntezmeny = sc.nextLine();

            // Azonosító generálása
            String azonosito = azonositoGeneralas();
            
            Vizsgazo vizsgazo = new Vizsgazo(nev, email, kepzoIntezmeny);

            vizsgazok.put(azonosito, vizsgazo);
          
        }
	          
		
		return vizsgazok;
		
	}
	
	
	
	public String azonositoGeneralas() {
		
		sorszam++;
		return "Vizsgazo"+sorszam;
		
	}
	
	

}
