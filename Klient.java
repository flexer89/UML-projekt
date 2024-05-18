public class Klient extends Uzytkownik {

	private string adres;
	private List<Zamowienie> historiaZamowien;

	public string getAdres() {
		return this.adres;
	}

	public void setAdres(string adres) {
		this.adres = adres;
	}

	public List<Zamowienie> getHistoriaZamowien() {
		return this.historiaZamowien;
	}

	public void setHistoriaZamowien(List<Zamowienie> historiaZamowien) {
		this.historiaZamowien = historiaZamowien;
	}

	public void zlozZamowienie() {
		// TODO - implement Klient.zlozZamowienie
		throw new UnsupportedOperationException();
	}

	public void edytujZamowienie() {
		// TODO - implement Klient.edytujZamowienie
		throw new UnsupportedOperationException();
	}

}