package paket.Osobe;

public class Administrator extends Osobe {

	private Double plata;
	
	public Administrator(String name, String prezime, String jMBG, String pol, String adresa, String broj_telefona,
			String korisnicko_ime, int lozinka, Double plata) {

		super(name, prezime, jMBG, pol, adresa, broj_telefona, korisnicko_ime, lozinka);		
		this.plata = plata;
	}
	
	public Double getPlata() {
		return plata;
	}

	public void setPlata(Double plata) {
		this.plata = plata;
	}
	
	
}
