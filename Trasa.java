public class Trasa {

	private string idTrasy;
	private string lokalizacjaStartowa;
	private short lokalizacjaKoncowa;
	private double odleglosc;
	private double szacowanyCzas;

	public string getIdTrasy() {
		return this.idTrasy;
	}

	public void setIdTrasy(string idTrasy) {
		this.idTrasy = idTrasy;
	}

	public string getLokalizacjaStartowa() {
		return this.lokalizacjaStartowa;
	}

	public void setLokalizacjaStartowa(string lokalizacjaStartowa) {
		this.lokalizacjaStartowa = lokalizacjaStartowa;
	}

	public short getLokalizacjaKoncowa() {
		return this.lokalizacjaKoncowa;
	}

	public void setLokalizacjaKoncowa(short lokalizacjaKoncowa) {
		this.lokalizacjaKoncowa = lokalizacjaKoncowa;
	}

	public double getOdleglosc() {
		return this.odleglosc;
	}

	public void setOdleglosc(double odleglosc) {
		this.odleglosc = odleglosc;
	}

	public double getSzacowanyCzas() {
		return this.szacowanyCzas;
	}

	public void setSzacowanyCzas(double szacowanyCzas) {
		this.szacowanyCzas = szacowanyCzas;
	}

}