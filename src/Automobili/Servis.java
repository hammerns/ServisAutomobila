package Automobili;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import paket.Osobe.Serviseri;

public class Servis {
	public Servis() {
		super();
		this.auto = new Automobil();
		this.datum_vreme = "1.1.2000";
		ArrayList<ServisniDeo> delovi = new ArrayList<ServisniDeo>();
		delovi.add(0,null);
	}
	
	protected Status status;
	protected Automobil auto;	
	private String datum_vreme;
	private ArrayList<ServisniDeo> delovi; 
	


	public String getDatum_vreme() {
		return datum_vreme;
	}

	public void setDatum_vreme(String datum_vreme) {
		this.datum_vreme = datum_vreme;
	}

	
	public ArrayList<ServisniDeo> getDelovi() {
		return delovi;
	}

	public void setDelovi(ArrayList<ServisniDeo> delovi) {
		this.delovi = delovi;
	}
}
