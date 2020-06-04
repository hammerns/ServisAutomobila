package Automobili;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import artikli.Kompozicija;

public class ServisneKnjizice {

	private Automobil automobil;
	private ArrayList<Servis> lista_servisa;
	
	public Automobil() {
		this.automobil = new Automobil();
		this.podaci_oautu = new ArrayList<Automobil>();

		
	}
	
	public ArrayList<Servis> getLista_servisa() {
		return lista_servisa;
	}

	public void setLista_servisa(ArrayList<Servis> lista_servisa) {
		this.lista_servisa = lista_servisa;
	}
	
	
	public ServisneKnjizice(ArrayList lista_servisa,Automobil automobil) {
		super();
		this.lista_servisa = lista_servisa;
		this.automobil = automobil;
		
	}

}
