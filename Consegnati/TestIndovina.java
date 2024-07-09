// Creare una classe TestIndovina con i seguenti metodi:
// main
// controlla
// il metodo controlla deve restituire un numero random compreso tra 0 e 4 (usare new Random().nextInt(5) e fare l’import di java.util.Random )
// il main deve chiedere all’utente un numero e verificare, invocando il metodo controlla, se il numero digitato dall’utente coincide con il numero random generato da controlla
// se si, stampa a video un messaggio del tipo: «hai indovinato»
// se no, stampa a video un messaggio del tipo: «hai sbagliato, il numero da indovinare era x» (dove x è il numero random restituito dal metodo controlla)

// provare a mantenere attivo il programma, per permettere all’utente di riprovare, finchè l’utente non decide esplicitamente di chiuderlo
// provare a creare una nuova versione del programma in cui l’utente stabilisce anche il numero random massimo da indovinare (quindi il numero random non sarà più compreso tra 0 e 4, ma tra 0 ed un numero scelto dall’utente) 

import java.util.Random;
import java.util.Scanner;

public class TestIndovina {
	
    public static int controlla() {
		return new Random().nextInt(5);
	}
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int scelta;
		do{
            int random = controlla();
            System.out.println("\nScegliere numero nell'intervallo tra 0 e 4 o 5 per uscire\n");			
            scelta = scanner.nextInt();
			if ( scelta < 0 || scelta > 4 ){
				System.out.println("\nBisogna scegliere un numero compreso tra 0 e 4\n");
				continue;
			}
			if ( scelta == 5 ) {
				break;
			}

			if(random == scelta) {
			    System.out.println("\nhai indovinato\n");
            } else {
			    System.out.println("\n«hai sbagliato, il numero da indovinare era  "+random+"\n");
            }
		}while ( scelta != 5 );
		System.out.println("Arrivederci");
		scanner.close();
	}
	
	
}