package feladat04;

public class Csatorna {
	
	private String megnevezes;
	private String kategoria;
	private String nyelv;
	private int csatornahely;
	private int alapitasEve;
	
	
	
	public Csatorna(String megnevezes, String kategoria, String nyelv, int csatornahely, int alapitasEve) {
		super();
		this.megnevezes = megnevezes;
		this.kategoria = kategoria;
		this.nyelv = nyelv;
		this.csatornahely = csatornahely;
		this.alapitasEve = alapitasEve;
	}



	public String getMegnevezes() {
		return megnevezes;
	}



	public String getKategoria() {
		return kategoria;
	}



	public String getNyelv() {
		return nyelv;
	}



	public int getCsatornahely() {
		return csatornahely;
	}



	public int getAlapitasEve() {
		return alapitasEve;
	}



	@Override
	public String toString() {
		return megnevezes + " " + kategoria + " " + nyelv + " " + csatornahely +  " " + alapitasEve;
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
