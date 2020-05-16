package paket.Osobe;

public class Musterija extends Osobe{

protected int sakupljeniBrojBodova;
	
	public Musterija(String name, String prezime, String jMBG, String pol, String adresa, String broj_telefona,
			String korisnicko_ime, int lozinka, int sakupljeniBrojBodova) {

		super(name, prezime, jMBG, pol, adresa, broj_telefona, korisnicko_ime, lozinka);		
		this.setSakupljeniBrojBodova(sakupljeniBrojBodova);
	}


	public Musterija() {
		this.name= "";
		
		
		
	}


	public int getSakupljeniBrojBodova() {
		return sakupljeniBrojBodova;
	}

	public void setSakupljeniBrojBodova(int sakupljeniBrojBodova) {
		this.sakupljeniBrojBodova = sakupljeniBrojBodova;
	}

}
