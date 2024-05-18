public class OptymalizacjaTrasy {

	private string idTrasy;
	private List<Zamowienie> zamowienia;
	private string aktualneWarunki;
	private List<Trasa> sugerowaneTrasy;

	public string getIdTrasy() {
		return this.idTrasy;
	}

	public void setIdTrasy(string idTrasy) {
		this.idTrasy = idTrasy;
	}

	public List<Zamowienie> getZamowienia() {
		return this.zamowienia;
	}

	public void setZamowienia(List<Zamowienie> zamowienia) {
		this.zamowienia = zamowienia;
	}

	public string getAktualneWarunki() {
		return this.aktualneWarunki;
	}

	public void setAktualneWarunki(string aktualneWarunki) {
		this.aktualneWarunki = aktualneWarunki;
	}

	public List<Trasa> getSugerowaneTrasy() {
		return this.sugerowaneTrasy;
	}

	public void setSugerowaneTrasy(List<Trasa> sugerowaneTrasy) {
		this.sugerowaneTrasy = sugerowaneTrasy;
	}

	public void analizujRuchDrogowy() {
		// TODO - implement OptymalizacjaTrasy.analizujRuchDrogowy
		throw new UnsupportedOperationException();
	}

	public void proponujAlternatywnaTrase() {
		// TODO - implement OptymalizacjaTrasy.proponujAlternatywnaTrase
		throw new UnsupportedOperationException();
	}

	public void aktualizujHarmonogram() {
		// TODO - implement OptymalizacjaTrasy.aktualizujHarmonogram
		throw new UnsupportedOperationException();
	}

}