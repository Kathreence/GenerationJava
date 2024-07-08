// Creare una classe EsercizioIf con un metodo main, che:
// riceva in input da console due numeri interi (chiedendo prima all’utente l’inserimento per ciascuno dei due) 
// se il secondo numero è zero stampi a video il messaggio non si può dividere per zero
// solo se entrambi i numeri sono positivi e se il secondo è minore o uguale al primo effettui la divisione dei due numeri e stampi a video il risultato
// alla fine, stampare un messaggio programma terminato

import java.util.Scanner;

public class EsercizioIf {
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);

        System.out.println("inserire numero intero");
        int b1 = scan.nextInt();
        System.out.println("inserire numero intero");
        int b2 = scan.nextInt();
    

		if (b2==0) {
			System.out.println("non si può dividere per zero");
		}
		else if (b2>0 && b2<=b1) {
			System.out.println((float)b1/b2);
			
		}
		else {
			System.out.println("Dati non validi");
		}
		System.out.println("programma terminato");
		scan.close();
	}
}