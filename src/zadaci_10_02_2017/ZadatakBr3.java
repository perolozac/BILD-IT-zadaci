package zadaci_10_02_2017;

import java.util.Scanner;

public class ZadatakBr3 {
	/*
	 * 3. Nizovi niz1 i niz2 su striktno identièni ukoliko su svi njihovi
	 * elementi na istim pozicijama jednaki. Napisati metodu koja vraæa true
	 * ukoliko su nizovi niz1 i niz2 striktno identièni. Koristiti sljedeæi
	 * header:
	 * 
	 * public static boolean equals(int[ ] niz1, int[ ] niz2)
	 * 
	 * Napisati testni program koji pita korisnika da unese dva niza cijelih
	 * brojeva te provjerava da li su striktno identièni.
	 */
	public static void main(String[] args) {
		// objekat tipa Scanner kako bih omoguæili korisniku unos iz konzole
		Scanner unos = new Scanner(System.in);
		
		System.out.println("Unesite dva niza kako bih provjerili da li su indenticni!");
		
		System.out.println("Za pocetak unesite koju ce duzinu imati nizevi:");
		
			int duzinaNiza=unos.nextInt();	

		int niz1[] = new int[duzinaNiza];
		int niz2[] = new int[duzinaNiza];// pravimo dva objekat, tj dva prazan 1d niza ,
								// duzine 5 elemenata

		for (int i = 0; i < duzinaNiza; i++) { // petlja koja omogucava da
										// korisnik"napuni"niz sa cjelobrojnim
										// vrjednostima
			System.out.println("Unesite cjelobrojnu vrjednost br. " + (i + 1)
					+ ":");
			niz1[i] = unos.nextInt();
		}
		System.out.println("Unesite vrednosti za drugi niz: ");
		for (int i = 0; i < duzinaNiza; i++) { // petlja koja omogucava da
			// korisnik"napuni"niz sa cjelobrojnim
			// vrjednostima
			System.out.println("Unesite cjelobrojnu vrjednost br. " + (i + 1)
					+ ":");
			niz2[i] = unos.nextInt();

		}
		// pozivamo metodu i prosledjujemo joj argumente, i ispisujemo rezultat
		System.out.println("Da li su uneseni nizovi indenticni?\nOdgovor :"
				+ equals(niz1, niz2));
	}

	public static boolean equals(int[] niz1, int[] niz2) {

		for (int i = 0; i < niz2.length; i++) {
			if ((niz1[i] != niz2[i])) {            // ako neki od elemnata niza nisu isti
				return false;                           // vraca false
			}

		}
		return true;      // u koliko je metoda uspjela proci sve provjere, znaci da
						// su nizovi indenticni,
						// pa vracamo true
	}
}
