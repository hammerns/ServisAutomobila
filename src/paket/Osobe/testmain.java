package paket.Osobe;

public class testmain {

	public static void main(String[] args) {
		
		Musterija musterija = new Musterija("Nikola","Devic","123456789156","Musko","Becejska","06428977","Niko",1234, 55);

		test.snimiPodatke(musterija);

		String sadrzaj = test.ucitajSadrzaj() ;
		System.out.println(sadrzaj);
	}

}
