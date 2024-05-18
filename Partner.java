public class Partner {

	private string idPartnera;
	private string nazwa;
	private List<Usluga> uslugi;

	public string getIdPartnera() {
		return this.idPartnera;
	}

	public void setIdPartnera(string idPartnera) {
		this.idPartnera = idPartnera;
	}

	public string getNazwa() {
		return this.nazwa;
	}

	public void setNazwa(string nazwa) {
		this.nazwa = nazwa;
	}

	public List<Usluga> getUslugi() {
		return this.uslugi;
	}

	public void setUslugi(List<Usluga> uslugi) {
		this.uslugi = uslugi;
	}

	public void wymianaDanych() {
		// TODO - implement Partner.wymianaDanych
		throw new UnsupportedOperationException();
	}

}