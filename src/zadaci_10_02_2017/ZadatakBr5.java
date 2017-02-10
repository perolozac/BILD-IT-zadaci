package zadaci_10_02_2017;

import java.util.Scanner;

public class ZadatakBr5 {
	/*
	 * 5. Implementirati sljedeæu metodu da sortira redove u 2D nizu.
	 * 
	 * public static double[ ][ ] sortRows(double[ ][ ] array)
	 * 
	 * Napisati testni program koji pita korisnika da unese 3x3 matricu (ili da
	 * pita korisnika koliku matricu želi unijeti) te mu ispisuje na konzoli
	 * matricu sa sortiranim redovima - od najmanjeg broja do najveæeg.
	 */public static void main(String[] args) {
		// objekat tipa Scanner kako bih omoguæili korisniku unos iz konzole

		Scanner unos = new Scanner(System.in);
		System.out
				.println("Unesite vrjednosti za 2d niz kako bih pronasli lokaciju najveceg elementa!");

		System.out.println("Za pocetak unesite velicinu matrice:");

		int brKol_iRed = unos.nextInt(); // unos iz konzole koliko ce matrica
											// imati redova i kolona

		System.out.println("Unesite " + (brKol_iRed * brKol_iRed) // mnozenjem
																	// dobijamo
																	// uk broj
																	// lelmenata
																	// koje
																	// matrica
																	// ima
				+ " decimalnih vrjednosti:");

		double niz[][] = new double[brKol_iRed][brKol_iRed];

		for (int i = 0; i < niz.length; i++) { // ugnjezdena petlja koja
												// omogucava da
			for (int j = 0; j < niz[i].length; j++) { // korisnik"napuni"2niz

				niz[i][j] = unos.nextDouble(); // unos iz konzole decimalnih
												// vrjednosti
			}
		}

		System.out.println("Upravo uneseni 2d niz izgleda ovako:");
		// ispis unesenog 2dniza, pozivanjem metode i prosledjivanje argumenta u
		// vidu 2d niza
		ispisiNiz(niz);

		double[][] sortiraniNiz = sortRow(niz);
		System.out.println("Nakon sortiranja, vas niz izgleda ovako:");
		ispisiNiz(sortiraniNiz);
	}

	// metoda za sortiranje, tzv bubble sort
	public static double[][] sortRow(double[][] array) {

		// kontrola redova
		for (int i = 0; i < array.length; i++) {

			// poredenje svih elemenata u nizu, ugnjezdenim for petljama
			for (int j = 0; j < array[i].length; j++) {
				for (int k = 0; k < array[i].length - 1; k++) {
					if (array[j][k] > array[j][k + 1]) { // ako je veci od
															// susjednog elment
						double temp = array[j][k]; // mjenjamo mjesta
						array[j][k] = array[j][k + 1];
						array[j][k + 1] = temp;
					}
				}
			}
		}
		return array; // vraca 2d niz u sortiranom obliku
	}

	// metoda sa dvije ugnjezdene for petlje, koja slizi za ispis 2d niza
	public static void ispisiNiz(double[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println(); // prelazak u novi red

		}
	}
}
