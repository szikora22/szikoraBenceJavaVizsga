package feladat05;

public class VasutVonal {
	
	private int vonalszam;
	private String startallomas;
	private String celallomas;
	private int tavolsag_km;
	private int alapar;
	
	
	public VasutVonal(int vonalszam, String startallomas, String celallomas, int tavolsag_km, int alapar) {
		this.vonalszam = vonalszam;
		this.startallomas = startallomas;
		this.celallomas = celallomas;
		this.tavolsag_km = tavolsag_km;
		this.alapar = alapar;
	}
	
	
	public void setAlapar(int alapar) {
		this.alapar = alapar;
	}


	public int getVonalszam() {
		return vonalszam;
	}



	public String getStartallomas() {
		return startallomas;
	}



	public String getCelallomas() {
		return celallomas;
	}



	public int getTavolsag_km() {
		return tavolsag_km;
	}



	public int getAlapar() {
		return alapar;
	}

}
