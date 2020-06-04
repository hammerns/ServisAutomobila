package Automobili;

import java.util.Date;

import paket.Osobe.Musterija;
import paket.Osobe.Osobe;

public class Automobil {

	private int id;
	private Marka marka;
	private Model model;
	private Gorivo gorivo;
	private String godina_proizvodnje;
	private double zapremina_motora;
	private double snaga_motor;
	protected Musterija musterija;
	
	protected Automobil(Marka marka, Model model, Gorivo gorivo, String godina_proizvodnje, double zapremina_motora,
			double snaga_motor, Musterija vlasnik) {
		super();
		this.marka = marka;
		this.model = model;
		this.gorivo = gorivo;
		this.godina_proizvodnje = godina_proizvodnje;
		this.zapremina_motora = zapremina_motora;
		this.snaga_motor = snaga_motor;
		this.musterija = musterija;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public Gorivo getGorivo() {
		return gorivo;
	}



	public void setGorivo(Gorivo gorivo) {
		this.gorivo = gorivo;
	}



	public Musterija getMusterija() {
		return musterija;
	}



	public void setMusterija(Musterija musterija) {
		this.musterija = musterija;
	}



	public Automobil() {
		this.musterija = new Musterija();
		this.godina_proizvodnje = "";
		this.zapremina_motora = 0;
		this.snaga_motor = 0;
		this.gorivo = gorivo.benzin;
		this.model = model.A4;
		this.marka = marka.audi;
	}


	
	protected Automobil(Marka marka, Model model, String godina_proizvodnje, double zapremina_motora,
			double snaga_motor,Musterija musterija) {
		super();
		this.musterija = new Musterija();
		this.marka = marka;
		this.model = model;
		this.godina_proizvodnje = godina_proizvodnje;
		this.zapremina_motora = zapremina_motora;
		this.snaga_motor = snaga_motor;
	}



	public Marka getMarka() {
		return marka;
	}



	public void setMarka(Marka marka) {
		this.marka = marka;
	}



	public Model getModel() {
		return model;
	}



	public void setModel(Model model) {
		this.model = model;
	}



	public void setSnaga_motor(double snaga_motor) {
		this.snaga_motor = snaga_motor;
	}



	public String getGodina_proizvodnje() {
		return godina_proizvodnje;
	}
	public void setGodina_proizvodnje(String godina_proizvodnje) {
		this.godina_proizvodnje = godina_proizvodnje;
	}
	public double getZapremina_motora() {
		return zapremina_motora;
	}
	public void setZapremina_motora(double zapremina_motora) {
		this.zapremina_motora = zapremina_motora;
	}
	public Double getSnaga_motor() {
		return snaga_motor;
	}
	public void setSnaga_motor(Double snaga_motor) {
		this.snaga_motor = snaga_motor;
	}


}

