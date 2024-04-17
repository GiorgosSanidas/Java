package erg3;

public class Mihani {

    private int kyvismos;
    private int ippodynami;


	Mihani() {
		this.kyvismos = 0;
		this.ippodynami = 0;
	}

	Mihani (int kyvismos, int ippodynami) {
		this.kyvismos = kyvismos;
		this.ippodynami = ippodynami;
	}

	public int getKyvismos() {
		return this.kyvismos;
	}

	public int getIppodynami() {
		return this.ippodynami;
	}

	public void setKyvismos(int kyvismos) {
		this.kyvismos = kyvismos;
	}

	public void setIppodynami(int ippodynami) {
		this.ippodynami = ippodynami;
	}


	public void leitourgia() {
        System.out.println("Leitourgia");
	}

	public void kinisi() {
        System.out.println("Kinisi");
	}

	public void svisimo() {
        System.out.println("Svisimo");
	}
	
}
