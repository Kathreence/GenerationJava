// Creare una classe EsercizioFor con un metodo main, che:
// riceva in input da console un numero intero (chiedendo prima all’utente l’inserimento) 
// se il numero è minore o uguale a zero stampi a console una stringa del tipo "Si deve inputare un numero maggiore di 0"  e termini il programma
// altrimenti stampi a console, con un ciclo for, tutti i numeri da 0 al numero inputato – 1. Ad. esempio se si inputa 3, stampi i numeri da 0 a 2

import java.util.Scanner;

public class EsercizioFor {
	public static void main (String[]args) { 
        Scanner scan = new Scanner(System.in);
		System.out.println("Digitare qualcosa: ");
		int i = scan.nextInt();

        if (i==0) {
			System.out.println("Si deve inputare un numero maggiore di 0");

        } else {
            for (int in = 0 ;in<i;in++) {
			System.out.println(in);
		    }
        }

        System.out.println("Termine programma");
		scan.close();
	}
}