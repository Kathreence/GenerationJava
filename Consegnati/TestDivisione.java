// creare una classe TestDivisione con 2 metodi:
// main
// divisione
// il metodo divisione, dati due double, deve stampare a video il risultato della divisione dei due numeri. 
// Però, prima di effettuare la divisione deve fare un controllo ( if ) sul secondo numero: 
// se questo è pari a zero deve stampare a video un messaggio di errore altrimenti deve procedere con la divisione e stampare il risultato della divisione
// il metodo main deve invocare il metodo divisione passandogli due numeri double richiesti all’utente tramite Scanner.

import java.util.Scanner;

public class TestDivisione {
	public static void main(String[] args) { 

		Scanner scan = new Scanner(System.in);
        double risultato = checkN(scan, scan);
        System.out.println("La divisione tra i due numeri è: " + risultato);
        
        scan.close();

        System.out.println("Programma terminato");
    }

    static double  checkN (Scanner scan1, Scanner scan2) {
        double n1;
        do { 
           System.out.println("Inserire primo numero positivo");
           n1 = scan1.nextDouble();
           if (n1<0) {
               System.out.println("Numero non valido: solo positivi");
           } 
        } while (n1<0);

        double n2;
        do { 
           System.out.println("Inserire secondo numero positivo");
           n2 = scan2.nextDouble();
           if (n2>n1 || n2==0) {
               System.out.println("Numero non valido: solo positivo, diverso da 0 e minore di " + n1);
           } 
        } while (n2>n1 || n2==0);

        double risultato = n1/n2;
        return  risultato;
    } 
}

// import java.util.Scanner;

// public class TestDivisione {

// 	public static void main(String[] args) {
// 		Scanner scanner = new Scanner(System.in);
// 		int scelta;
// 		do {
// 			System.out.println("Inserire il primo numero");
// 			double x = scanner.nextDouble();
// 			System.out.println("Inserire il secondo numero");
// 			double y = scanner.nextDouble();
// 			divisione(x,y);
// 			System.out.println("Per terminare premere 0, per proseguire premere qualsiasi altro numero");
// 			scelta = scanner.nextInt();
// 		}while(scelta!=0);
// 		System.out.println("Programma terminato");
// 		scanner.close();
// 	}
	
// 	private static void divisione(double a,double b) {
// 		if( b==0 ) {
// 			System.out.println("Non si può fare la divisione per zero");
// 		}
// 		else {
// 			System.out.println(a + "/" + b + " = " + a/b);
// 		}
// 	}

// }