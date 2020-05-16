package paket.Osobe;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;




public class test {
	


public static void snimiPodatke(Object obj) {
	String prethodniSadrzaj = ucitajSadrzaj();
	String noviSadrzaj = obj.toString();
	try {
		File korisniciFile = new File("test.txt");
		BufferedWriter writer = new BufferedWriter(new FileWriter(korisniciFile));
		writer.write(prethodniSadrzaj + noviSadrzaj);
		writer.close();
		System.out.println("Uspesno ste upisali");
	}catch(IOException e) {
		System.out.println("Greska prilikom upisa u datotoeku test.txt");
	}
}
public static String ucitajSadrzaj() {
	String sadrzaj = "";
	try {
		File file = new File("test.txt");
		BufferedReader reader = new BufferedReader(new FileReader(file));
		String line;
		while((line = reader.readLine()) != null) {
			sadrzaj += line + "\n";
		}
		reader.close();
	}catch(IOException e) {
		System.out.println("Greska prilikom citanja datoteke ");
	}
	return sadrzaj;
}



	
	
	
	
	
	
	
	
	
	
	
	
	
}
