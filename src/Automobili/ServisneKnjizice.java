package Automobili;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ServisneKnjizice extends Automobil {

	
	Automobil a = new Automobil();
	private int id = a.getId();
	private ArrayList<Servis> lista_servisa;
	
	public ArrayList<Servis> getLista_servisa() {
		return lista_servisa;
	}

	public void setLista_servisa(ArrayList<Servis> lista_servisa) {
		this.lista_servisa = lista_servisa;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	public ServisneKnjizice(ArrayList lista_servisa,String godina_proizvodnje, double zapremina_motora, double snaga_motor,int id) {
		super();
		this.lista_servisa= lista_servisa;
	}

}
