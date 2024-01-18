package feladat02;

import java.util.Random;

public class MerkozesApp {

	public static void main(String[] args) {
		
		
        Merkozes merkozes = new Merkozes("Hazai Csapat", "Vendég Csapat");

       
        for (int perc = 1; perc <= merkozes.getIdotartam(); perc++) {
          
            int randomSzam = new Random().nextInt(25) + 1;

            
            if (randomSzam == 10) {
                merkozes.gooool(merkozes.getHazai()); 
            } else if (randomSzam == 20) {
                merkozes.gooool(merkozes.getVendeg()); 
            }

            
            System.out.println("Perc: " + perc + ", " + merkozes.getHazai() +
                    " " + merkozes.getHazaiGolszam() + " - " + merkozes.getVendegGolszam() +
                    " " + merkozes.getVendeg());
        }
		

	}

}
