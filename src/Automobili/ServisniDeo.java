package Automobili;

public class ServisniDeo {

	private Marka marka;
	private Model model;
	private String naziv_dela;
	private double cena;
	
	
	public ServisniDeo() {
		this.marka=Marka.audi;
		this.model=Model.A4;
		this.naziv_dela="";
		this.cena=0;
	}
	

	public String getNaziv_dela() {
		return naziv_dela;
	}

	public void setNaziv_dela(String naziv_dela) {
		this.naziv_dela = naziv_dela;
	}

	public double getCena() {
		return cena;
	}

	public void setCena(double cena) {
		this.cena = cena;
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

	

}
