// Creare una classe EsercizioWhile con un metodo main, che:
// riceva in input da console due numeri interi (chiedendo prima all’utente l’inserimento per ciascuno dei due) 
// se il primo numero è minore o uguale a zero stampi a console una stringa del tipo "Si deve inputare un numero maggiore di 0"  e termini il programma
// se il secondo numero è minore o uguale a zero stampi a console una stringa del tipo "Si deve inputare un numero maggiore di 0"  e termini il programma
// se il secondo numero è maggiore o uguale al primo numero stampi a console una stringa del tipo "Si deve inputare un numero minore di a" (dove a va sostituito col valore effettivo) e termini il programma
// altrimenti, tramite un ciclo while, detti a e b i due numeri, stampi a console i numeri da 0 ad a con un passo di b
// es. se a=25 e b=7 dovrà stampare 0-7-14-21

import java.util.Scanner;


public class EsercizioWhile {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
		System.out.println("l’inserimento primo numero: ");
		int f = scan.nextInt();
		System.out.println("l’inserimento primo numero: ");
		int s = scan.nextInt();

		int i = 0;
		
        if (f<=0) {
		    System.out.println("Si deve imputare un numero maggiore di 0");
        } else if (s<=0) {
		    System.out.println("Si deve imputare un numero maggiore di 0");
        } else if (s>=f) {
		    System.out.println("Si deve imputare un numero minore di " + f);

        } else {
            while (i<f) {
                System.out.println(i+=s);
            }
        }
		System.out.println("termine programma");
        scan.close();
	}
}