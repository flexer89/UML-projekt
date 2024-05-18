public class Kurier extends Uzytkownik {

	private Trasa trasa;
	private List<Paczka> dostepnePaczki;
	private string aktualnaLokalizacja;

	public Trasa getTrasa() {
		return this.trasa;
	}

	public void setTrasa(Trasa trasa) {
		this.trasa = trasa;
	}

	public List<Paczka> getDostepnePaczki() {
		return this.dostepnePaczki;
	}

	public void setDostepnePaczki(List<Paczka> dostepnePaczki) {
		this.dostepnePaczki = dostepnePaczki;
	}

	public string getAktualnaLokalizacja() {
		return this.aktualnaLokalizacja;
	}

	public void setAktualnaLokalizacja(string aktualnaLokalizacja) {
		this.aktualnaLokalizacja = aktualnaLokalizacja;
	}

	/**
	 * 
	 * @param parameter
	 */
	public void sprawdzStatusPaczki(Paczka parameter) {
		// TODO - implement Kurier.sprawdzStatusPaczki
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param parameter
	 */
	public void aktualizujStatusPaczki(Paczka parameter) {
		// TODO - implement Kurier.aktualizujStatusPaczki
		throw new UnsupportedOperationException();
	}

}