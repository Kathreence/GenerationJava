import java.util.Scanner;

public class EsempioSwitch2 {
	public static void main (String[]args) { // args sarebbero le variabili?
		Scanner scan = new Scanner(System.in);
		System.out.println("Indica il mese attuale");
		String mese = scan.nextLine();
		int numeroGiorni = 1;
		boolean error = false;

		switch (mese) {
			case "gennaio": case "marzo": case "maggio": case "luglio": case "agosto": case "ottobre": case "dicembre": {
				numeroGiorni = 30;
				break;
			}
			case "aprile": case "giugno": case "settembre": case "novembre": {
				numeroGiorni = 31;
				break;
			}
			case "febbraio": {
				System.out.println("l'anno è bisestile? rispondi true/false");
				boolean b = scan.nextBoolean();
				numeroGiorni = b ? 29 : 28;
				break;
			}
			default: {
				System.out.println("Non è un mese");
				error = true;
			} 
		}
		
		if (!error) {
			System.out.println("Il mese selezionato ha " + numeroGiorni + " giorni");
		}
	}	
}