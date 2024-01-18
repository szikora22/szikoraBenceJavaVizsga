package feladat01;

import java.util.Scanner;

public class KategorizaloApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Kérem adja meg a termék kategóriakódját: ");
		int kategoriaKod = Integer.parseInt(sc.nextLine());
		
		System.out.print("Kérem adja meg a termék alapárát: ");
		int alapar = Integer.parseInt(sc.nextLine());
		
		System.out.print(kategorizal(kategoriaKod) + ", ");
		osztalyMeghatarozas(kategoriaKod, alapar);
		
		sc.close();

	}


	public static String kategorizal(int kod) {
		
		String szoveg = null;
		switch (kod) {
		
		case 1:
			szoveg = "I. osztályú termék";
			break;
		case 2:
			szoveg = "II. osztályú termék";
			break;
		case 3:
			szoveg = "III. osztályú termék";
			break;
		
		}
		
		return szoveg;
	}
	
	public static void osztalyMeghatarozas(int kategoriaKod, int alapar) {
		
		if(kategoriaKod == 1) {
			
			System.out.println("alapár: " + alapar + ", aktuális ár: "+ alapar);
			
		}
		
		if(kategoriaKod == 2) {
			
			System.out.println("az alapár= " + alapar + " Ft" + ", az aktuális ár="+ (alapar * 0.9) + "Ft");
			
		}
		
		if(kategoriaKod == 3) {
			
			System.out.println("az alapár= " + alapar + ", az aktuális ár="+ (alapar * 0.8));
			
		}
		
		
		
	}
	
	
	

}
