public class Zamowienie {

	private string idZamowienia;
	private Klient nadawca;
	private Klient odbiorca;
	private Paczka szczegolyPaczki;
	private string status;

	public string getIdZamowienia() {
		return this.idZamowienia;
	}

	public void setIdZamowienia(string idZamowienia) {
		this.idZamowienia = idZamowienia;
	}

	public Klient getNadawca() {
		return this.nadawca;
	}

	public void setNadawca(Klient nadawca) {
		this.nadawca = nadawca;
	}

	public Klient getOdbiorca() {
		return this.odbiorca;
	}

	public void setOdbiorca(Klient odbiorca) {
		this.odbiorca = odbiorca;
	}

	public Paczka getSzczegolyPaczki() {
		return this.szczegolyPaczki;
	}

	public void setSzczegolyPaczki(Paczka szczegolyPaczki) {
		this.szczegolyPaczki = szczegolyPaczki;
	}

	public string getStatus() {
		return this.status;
	}

	public void setStatus(string status) {
		this.status = status;
	}

	public void utworzZamowienie() {
		// TODO - implement Zamowienie.utworzZamowienie
		throw new UnsupportedOperationException();
	}

	public void generujEtykiete() {
		// TODO - implement Zamowienie.generujEtykiete
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param status
	 */
	public void aktualizujZamowienie(string status) {
		// TODO - implement Zamowienie.aktualizujZamowienie
		throw new UnsupportedOperationException();
	}

}