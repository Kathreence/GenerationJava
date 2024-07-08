// Creare una classe EsercizioDoWhile1 con un metodo main, che:
// riceva in input da console un numero intero (chiedendo prima all’utente l’inserimento) 
// se il numero è minore o uguale a zero stampi a console una stringa del tipo "Si deve inputare un numero maggiore di 0"  e termini il programma
// altrimenti stampi a console, con un ciclo do-while, tutti i numeri da 0 al numero inputato – 1. Ad. esempio se si inputa 3, stampi i numeri da 0 a 2
// Provare a fare un controllo bloccante sul numero richiesto all’utente, con un ciclo che richieda nuovamente all’utente di inserire il numero finchè è minore o uguale a 0

import java.util.Scanner;


/*
public class EsercizioDoWhile {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("l’inserimento primo numero: ");
		int f = scan.nextInt();
        if (f<=0) {
		    System.out.println("Si deve imputare un numero maggiore di 0");
        } else {
            System.out.println("l’inserimento primo numero: ");
		    int s = scan.nextInt();
            if (s<=0) {
		        System.out.println("Si deve imputare un numero maggiore di 0");
            } else if (s>=f) {
	    	    System.out.println("Si deve imputare un numero minore di " + f);
            } else {
                int i = 0;
                do {
                     System.out.println(i+=s);
                } while (i<f);
            }
        }
		System.out.println("termine programma");
        scan.close();
	}
}
*/

public class EsercizioDoWhile {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("l’inserimento primo numero: ");
		int f = scan.nextInt();
        if (f<=0) {
		    System.out.println("Si deve imputare un numero maggiore di 0");
        } else {
            int i = 0;
            do {
                System.out.println(i+=1);
            } while (i<f);
        }
        System.out.println("termine programma");
        scan.close();
	}
}

// import java.util.Scanner;

// public class EsercizioDoWhile {

// 	public static void main(String[] args) {
// 		Scanner scanner = new Scanner(System.in);
// 		int a;
// 		do {
// 			System.out.println("Digitare un numero: ");
// 			a = scanner.nextInt();
// 			if ( a <=0 ){
// 				System.out.println("Si deve inputare un numero maggiore di 0");
// 			}
// 		}while(a<=0);
// 		int i = 0;
// 		do{
// 			System.out.println(i);
// 			i++;
// 		}while ( i<a );
// 		scanner.close();
// 	}

// }