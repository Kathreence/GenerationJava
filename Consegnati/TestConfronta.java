// Creare una classe TestConfronto con due metodi:
// main
// confronta
// il metodo confronta, dati due numeri interi, deve restituire al chiamante:
// -1 se il primo numero è minore del secondo
// 0 se i due numeri sono uguali
// 1 se il primo numero è maggiore del secondo
// il metodo main deve:
// richiedere all’utente tramite Scanner due numeri interi
// invocare il metodo confronta passandogli i due numeri interi e prendere il valore di ritorno del metodo
// in base al valore di ritorno del metodo confronta deve stampare a video una delle seguenti 3 stringhe:
// "i due numeri sono uguali" 
// "il primo numero è minore del secondo"
// "il primo numero è maggiore del secondo"

import java.util.Scanner;

public class TestConfronta {
    
	public static void main(String[] args) { 
        Scanner scan = new Scanner(System.in);
        int scelta;
        do { 
            System.out.println("inserisci primo numero" );
            int a = scan.nextInt();
            System.out.println("inserisci primo numero" );
            int b = scan.nextInt();

            int risultato = confronta(a, b);
            if (risultato==0) {
                System.out.println("i due numeri sono uguali" );
            } else if (risultato==-1) {
                System.out.println("il primo numero è minore del secondo ");
            } else if (risultato==1) {
                System.out.println("il primo numero è maggiore del secondo ");
            } else {
                System.out.println("errore nel confronto dei due numeri");
            }
            System.out.println("Per terminare premere 0");
			scelta = scan.nextInt();
        } while (scelta!=0);

		
        
        
        scan.close();

        System.out.println("Programma terminato");
    }

    static int confronta (int a, int b) {
        int i;
        if (a < b) {
            return i=-1;
        } else if (a == b) {
            return i=0;
        } else {
            return i=1;
        }
    } 
}

// import java.util.Scanner;

// public class TestConfronto {

// 	public static void main(String[] args) {
// 		Scanner scanner = new Scanner(System.in);
// 		int scelta;
// 		do {
// 			System.out.println("Inserire primo numero");
// 			int x = scanner.nextInt();
// 			System.out.println("Inserire secondo numero");
// 			int y = scanner.nextInt();
// 			int risultato = confronta(x,y);
// 			switch (risultato) {
// 				case 0:
// 					System.out.println("I numeri sono uguali");
// 					break;
// 				case -1:
// 					System.out.println(x + " è minore di " + y);
// 					break;
// 				case 1:
// 					System.out.println(x + " è maggiore di " + y);
// 					break;
// 			}
// 			System.out.println("Per terminare premere 0");
// 			scelta = scanner.nextInt();
// 		}while(scelta!=0);
// 		System.out.println("Programma terminato");
// 		scanner.close();	
// 	}
	
// 	private static int confronta(int a,int b) {
// 		if( a==b ) {
// 			return 0;
// 		}
// 		if( a<b ) {
// 			return -1;
// 		}
// 		return 1;
// 	}

// }
