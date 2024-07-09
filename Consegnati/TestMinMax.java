// Creare una classe TestMinMax con due metodi:
// main
// minMax
// il metodo minMax, dati 3 numeri interi ed un boolean, deve restituire al chiamante il minimo o il massimo dei 3 numeri interi a seconda se il parametro boolean è rispettivamente true o false
// il metodo main deve:
// richiedere all’utente tramite Scanner tre numeri interi ed un boolean
// invocare il metodo minMax passandogli in input i tre numeri ed il boolean e prendere il valore di ritorno del metodo
// stampare a video una stringa del tipo "il minimo è x" oppure il "massimo è x" (dove x è il valore di ritorno del metodo minMax) a seconda del valore boolean fornito dall’utente tramite Scanner


import java.util.Scanner; 

public class TestMinMax{

    static int minMax ( int n1, int n2, int n3, boolean b) {
        if (b) {
            int min = n1;
            if (n2 < min) {
                min = n2;
            }
            if (n3 < min) {
                min = n3;
            }
            return min;
        } else {
            int max = n1;
            if (n2 > max) {
                max = n2;
            }
            if (n3 > max) {
                max = n3;
            }
            return max;
        }
    }
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        int scelta;

        do { 
            System.out.println("Inserire primo valore");
            int n1 = scan.nextInt();
            System.out.println("Inserire secondo valore");
            int n2 = scan.nextInt();
            System.out.println("Inserire terzo valore");
            int n3 = scan.nextInt();
            System.out.println("Inserire true per valore minimo false per valore massimo");
            boolean b = scan.nextBoolean();
            if (b) {
                System.out.println("Il minimo è : " + minMax(n1, n2, n3, b));
            } else {
                System.out.println("Il massimo è : " + minMax(n1, n2, n3, b));
            } 
            System.out.println("Per terminare premere 0");
			scelta = scan.nextInt();		
        } while (scelta!=0);
    }
}

// import java.util.Scanner;

// public class TestMinMax {

// 	public static void main(String[] args) {
// 		Scanner scanner = new Scanner(System.in);
// 		int scelta;
// 		do {
// 			System.out.println("Inserire primo numero");
// 			int x = scanner.nextInt();
// 			System.out.println("Inserire secondo numero");
// 			int y = scanner.nextInt();
// 			System.out.println("Inserire terzo numero");
// 			int z = scanner.nextInt();
// 			System.out.println("Digitare true per trovare il minimo, false per il massimo");
// 			boolean minimo = scanner.nextBoolean();
// 			int risultato = minMax(x, y, z, minimo);
// 			String prefix = minimo? "minimo" : "massimo";
// 			System.out.println("Il " + prefix + " tra " + x + ", " + y + ", " + z + " è: " + risultato);
// 			System.out.println("Per terminare il programma premere 0, per proseguire premere qualsiasi altro numero");
// 			scelta = scanner.nextInt();
// 		}while(scelta != 0);
// 		System.out.println("Programma terminato");
// 		scanner.close();
// 	}
	
// 	private static int minMax(int a,int b,int c,boolean min) {
// 		if( min ) {
// 			if ( a<=b && a<=c ) {
// 				return a;
// 			}
// 			if ( b<=a && b<=c ) {
// 				return b;
// 			}
// 			return c;
// 		}
// 		// automaticamente sono nell'else -> min==false -> cerco il massimo
// 		if ( a>=b && a>=c ) {
// 			return a;
// 		}
// 		if ( b>=a && b>=c ) {
// 			return b;
// 		}
// 		return c;
// 	}
// }