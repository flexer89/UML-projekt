public class SledzeniePrzesylki {

	private string idSledzenia;
	private Zamowienie zamowienie;
	private string aktualnaLokalizacja;
	private string status;
	private Date szacowanyCzasDostawy;

	public string getIdSledzenia() {
		return this.idSledzenia;
	}

	public void setIdSledzenia(string idSledzenia) {
		this.idSledzenia = idSledzenia;
	}

	public Zamowienie getZamowienie() {
		return this.zamowienie;
	}

	public void setZamowienie(Zamowienie zamowienie) {
		this.zamowienie = zamowienie;
	}

	public string getAktualnaLokalizacja() {
		return this.aktualnaLokalizacja;
	}

	public void setAktualnaLokalizacja(string aktualnaLokalizacja) {
		this.aktualnaLokalizacja = aktualnaLokalizacja;
	}

	public string getStatus() {
		return this.status;
	}

	public void setStatus(string status) {
		this.status = status;
	}

	public Date getSzacowanyCzasDostawy() {
		return this.szacowanyCzasDostawy;
	}

	public void setSzacowanyCzasDostawy(Date szacowanyCzasDostawy) {
		this.szacowanyCzasDostawy = szacowanyCzasDostawy;
	}

	/**
	 * 
	 * @param Status
	 */
	public void aktualizujStatus(string Status) {
		// TODO - implement SledzeniePrzesylki.aktualizujStatus
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param klient
	 */
	public void powiadomKlienta(Klient klient) {
		// TODO - implement SledzeniePrzesylki.powiadomKlienta
		throw new UnsupportedOperationException();
	}

	public void przegladajHistorie() {
		// TODO - implement SledzeniePrzesylki.przegladajHistorie
		throw new UnsupportedOperationException();
	}

}