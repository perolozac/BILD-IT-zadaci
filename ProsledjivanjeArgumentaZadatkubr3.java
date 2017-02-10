package zadaci_09_02_2017;

import java.io.IOException;
import java.util.Scanner;

public class ProsledjivanjeArgumentaZadatkubr3 {

	public static void main(String[] args) throws IOException {
// Pravimo bjekat tipa Scanner, kako bih omogucili korisniku da iz konzole unese ime fajla
		Scanner unos = new Scanner(System.in);
		
		System.out.print("Unesite ime fajla, u kojem zelite da prebrojimo redove,\nrjeci i karaktere koji se u njemu nalaze: "); // ako unesete "test.txt", mozete
													// testirati program
		String imeFajla = unos.nextLine();

		String[] niz = { imeFajla }; // pravimo niz kojem prosledjujemo ime
										// fajla i to je ujedno i jedini
										// elemenat u nizu
		
		ZadatakBr3.main(niz);   //ime fajla prosledjuemo main metodi u ZadatkuBr3
		unos.close();
	}
}