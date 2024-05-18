public class Paczka {

	private string idPaczki;
	private double waga;
	private string wymiary;
	private string opis;
	private string kodQR;

	public string getIdPaczki() {
		return this.idPaczki;
	}

	public void setIdPaczki(string idPaczki) {
		this.idPaczki = idPaczki;
	}

	public double getWaga() {
		return this.waga;
	}

	public void setWaga(double waga) {
		this.waga = waga;
	}

	public string getWymiary() {
		return this.wymiary;
	}

	public void setWymiary(string wymiary) {
		this.wymiary = wymiary;
	}

	public string getOpis() {
		return this.opis;
	}

	public void setOpis(string opis) {
		this.opis = opis;
	}

	public string getKodQR() {
		return this.kodQR;
	}

	public void setKodQR(string kodQR) {
		this.kodQR = kodQR;
	}

	public void generujKodQR() {
		// TODO - implement Paczka.generujKodQR
		throw new UnsupportedOperationException();
	}

}