package paket.Osobe;

public abstract class Osobe {

     protected String name;
     protected String prezime;
	 protected String JMBG;
	 protected String pol;
	 protected String adresa;
	 protected String broj_telefona;
	 protected String korisnicko_ime;
	 protected int lozinka;
	 
	 
	
	 
	 
	public Osobe(String name, String prezime, String jMBG, String pol, String adresa, String broj_telefona,
			String korisnicko_ime, int lozinka) {
		super();
		this.name = name;
		this.prezime = prezime;
		JMBG = jMBG;
		this.pol = pol;
		this.adresa = adresa;
		this.broj_telefona = broj_telefona;
		this.korisnicko_ime = korisnicko_ime;
		this.lozinka = lozinka;
	}
	
	public Osobe() {
		
		this.name = "";
		this.prezime = "";
		JMBG = "";
		this.pol = "";
		this.adresa = "";
		this.broj_telefona = "";
		this.korisnicko_ime = "";
		this.lozinka = 0;
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	public String getJMBG() {
		return JMBG;
	}
	public void setJMBG(String jMBG) {
		JMBG = jMBG;
	}
	public String getPol() {
		return pol;
	}
	public void setPol(String pol) {
		this.pol = pol;
	}
	public String getAdresa() {
		return adresa;
	}
	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}
	public String getBroj_telefona() {
		return broj_telefona;
	}
	public void setBroj_telefona(String broj_telefona) {
		this.broj_telefona = broj_telefona;
	}
	public String getKorisnicko_ime() {
		return korisnicko_ime;
	}
	public void setKorisnicko_ime(String korisnicko_ime) {
		this.korisnicko_ime = korisnicko_ime;
	}
	public int getLozinka() {
		return lozinka;
	}
	public void setLozinka(int lozinka) {
		this.lozinka = lozinka;
	}
	@Override
	public String toString() {
		return "osobe [name=" + name + ", prezime=" + prezime + ", JMBG=" + JMBG + ", pol=" + pol + ", adresa=" + adresa
				+ ", broj_telefona=" + broj_telefona + ", korisnicko_ime=" + korisnicko_ime + ", lozinka=" + lozinka
				+ "]";
	}

	 
	 
	 
	
}
