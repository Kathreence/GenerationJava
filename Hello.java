public class Hello {
	public static void main (String[]args){ 	// main è un metodo
		System.out.println("Hello");			// tra le graffe diamo sempre delle istruzioni
	}
}

/* 
	VARIABILI 
la DICHIARAZIONE di una variabile avviene UNA SOLA VOLTA in java 
se no avviene ERRORE duplicazione del nome della variabile
tipo di variabile e poi nome della variablie
	String s
assegnasione di valore ad una variabile
	s = "Ciso"
questi possono essere sovrascritti
queste due operazioni possono essere fatte insieme sulla stessa linea

sintassi va in camelCase

tipi primitivi
- 8byte		numeri interi per un fine di quanta dimensione delle variabili per ottimizzare
- 16short	numeri interi
- 32int 	numeri interi piu utilizzato
- 64long 	numeri interi piu utilizzato L
- 32float 	numero reale con la virgola F (obbligatoria)
- 64double 	numero reale con la virgola D (obbligatoria)
- boolean 	true/false
- char 		''

ambito o scope

specificatore di accesso

METODO
main

CLASSI 
per ricevere più dati
- Scanner
- System.in

	import
da inserire prima della classe

import java.util.Scanner; 							IMPORT
public class Test {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digitare il nome:");
		String s = scanner.nextLine();
		System.out.println("Digitato " + s);
		scanner.close();							questo non è necessario ma è meglio inserirlo
	}
}
*/
