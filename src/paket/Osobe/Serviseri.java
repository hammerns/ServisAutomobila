package paket.Osobe;


public class Serviseri extends Osobe{

protected Double plata;
protected Specijalizacije specijalizacije; 

	public Specijalizacije getSpecijalizacije() {
	return specijalizacije;
}


public void setSpecijalizacije(Specijalizacije specijalizacije) {
	this.specijalizacije = specijalizacije;
}
public Serviseri() {
	this.specijalizacije = specijalizacije.autoelektricar;
	this.plata = 0.0;
	
}
	public Serviseri(String name, String prezime, String jMBG, String pol, String adresa, String broj_telefona,
			String korisnicko_ime, int lozinka, Double plata) {

		super(name, prezime, jMBG, pol, adresa, broj_telefona, korisnicko_ime, lozinka);		
		this.plata = plata;
		this.specijalizacije = specijalizacije;
	}


	public Double getPlata() {
		return plata;
	}

	public void setPlata(Double plata) {
		this.plata = plata;
	}
}
