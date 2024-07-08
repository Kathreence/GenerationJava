/*
Creare una classe Operatori2 con un metodo main, che:
riceva in input da console due numeri interi (chiedendo prima all’utente l’inserimento per ciascuno dei due)
sommi i due numeri
stampi a console il risultato della somma, con una stringa del tipo «la somma dei due numeri fa: » concatenata col risultato
*/		

/*
import java.util.Scanner;

public class Operatori2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digitare il primo numero:");	
		int p = scanner.nextInt();
		System.out.println("Digitare il secondo numero:");	
		int s = scanner.nextInt();
		int somma = p+s;
		System.out.println("la somma dei due numeri fa: " + somma);
		scanner.close();							
	}
}	
*/

import java.util.Scanner;

public class Operatori2 {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Operazione di somma");
		System.out.println("Digitare il primo numero");
		int a = scan.nextInt();
		System.out.println("Digitare il primo numero");
		int b = scan.nextInt();
		int somma = a + b;
		System.out.println("La somma dei due numeri fa: " + somma);
	}
}