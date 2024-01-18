package feladat03;

public class Vizsgazo {
	
	// TODO Vizsgázók tárolása
	
	private String nev;
	private String email;
	private String intezmenyNev;
	
	
	
	public Vizsgazo(String nev, String email, String intezmenyNev) {
		super();
		this.nev = nev;
		this.email = email;
		this.intezmenyNev = intezmenyNev;
	}


	public String getNev() {
		return nev;
	}


	public String getEmail() {
		return email;
	}


	public String getIntezmenyNev() {
		return intezmenyNev;
	}


	@Override
	public String toString() {
		return "Vizsgázó neve: " + nev + " Email cím: " + email + " Intézménynév" + intezmenyNev;
	}
	
	
	
	
	
	
	
	
	
	

}
