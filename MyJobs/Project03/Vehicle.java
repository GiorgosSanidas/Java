package erg3;

public class Vehicle {
	private String idioktitis;
	public String arKykloforias;
	private int etosKat;
	private SystimaDieythynsis sysdief;
	private Mihani eng;
	

	Vehicle(){
		this.idioktitis = "";
		this.arKykloforias = "";
		this.etosKat = 0;
		this.sysdief = null;
		this.eng = null;
	}

	Vehicle(String idioktitis, String arKykloforias, int etosKat, SystimaDieythynsis sysdief, Mihani eng) {
		this.idioktitis = idioktitis;
		this.arKykloforias = arKykloforias;
		this.etosKat = etosKat;
		this.sysdief = sysdief;
		this.eng = eng;
	}

	public void setIdioktitis(String idioktitis) {
		this.idioktitis = idioktitis;
	}

	public String getIdioktitis() {
		return this.idioktitis;
	}

	public void setArKykloforias(String arKykloforias) {
		this.arKykloforias = arKykloforias;
	}

	public String getArKykloforias() {
		return this.arKykloforias;
	}

	public void setEtosKat(int etosKat) {
		this.etosKat = etosKat;
	}

	public int getEtosKat() {
		return this.etosKat;
	}

	public void setSysdief(SystimaDieythynsis sysdief) {
		this.sysdief = sysdief;
	}

	public SystimaDieythynsis getSysdief() {
		return this.sysdief;
	}

	public void setEng(Mihani eng) {
		this.eng = eng;
	}

	public Mihani getEng() {
		return this.eng;
	}


}
