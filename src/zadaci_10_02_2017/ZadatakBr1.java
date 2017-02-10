package zadaci_10_02_2017;

import java.util.Scanner;

public class ZadatakBr1 {
	/*
	 * 1. Napisati metodu koja prima 2 argumenta: poèetni broj i krajnji broj te
	 * printa sve proste brojeve u zadanom rangu. BONUS: metoda može primati i
	 * treæi argument, broj brojeva za isprintati po liniji.
	 */
	public static void main(String[] args) {

		// objekat tipa Scanner kako bih omoguæili korisniku unos iz konzole
		Scanner unos = new Scanner(System.in);
		System.out
				.println("Upisite dva broja u cijem intervalu da ispisemo proste brojeve !\n"
						+ "Poèetni broj:");
		
		// korisniku omogucujemo upis iz konzole
		int pocetniBroj = unos.nextInt();
		System.out.println("Unesite krajnji broj:");
		
		// korisniku omogucujemo upis iz konzole
		int krajnjiBroj = unos.nextInt();
		System.out.println("Unesite broj brojeva za isprintati po liniji:");
		
		// korisniku omogucujemo upis iz konzole
		int brojevaPoLiniji = unos.nextInt();

		System.out.println("Svi prosti brojevi u intervalu od " + pocetniBroj
				+ " do " + krajnjiBroj + ":");
		isprintajProsteBrojeve(pocetniBroj, krajnjiBroj, brojevaPoLiniji);

	}

	// metoda za ispisivanje prostih brojeva
	public static void isprintajProsteBrojeve(int pocetak, int kraj,
			int brojevaPOLiniji) {
		int brojac = 0;
		
		for (int i = pocetak; i < kraj; i++) {// petlja koja ide (od-do)u
												// zadatom intervalu od strane
												// korisnika
			if (daLiJeprost(i)) { // prosledjivanje argumenta metodi
				System.out.printf("%5d ", i); // ispis
				brojac++;
				if (brojac == brojevaPOLiniji) { // da predje u novi red
					System.out.println();
					brojac = 0; // restartujemo brojac, da bih mogao brojati
								// izpocetka
				}
			}
		}
	}

	// metoda koja ispituje da li je uneseni broj prost
	public static boolean daLiJeprost(int brojKojiSeIspituje) {
		for (int i = 2; i < brojKojiSeIspituje; i++) {
			if (brojKojiSeIspituje % i == 0) {
				return false;
			}
		}

		return true;
	}
}
