// Creare una classe Operatori5 con un metodo main, che:
// riceva in input da console due booleani (chiedendo prima all’utente l’inserimento per ciascuno dei due)
// stampi a console la and dei due booleani
// stampi a console la or dei due booleani
// stampi a console il not del primo booleano
// stampi a console il not del secondo booleano
// le stampe a console devono venire così (supponendo di ricevere in input true e false):
// La and di true e false vale: false
// L'or di true e false vale: true
// Il not di true vale: false
// Il not di false vale: true

import java.util.Scanner;

public class Operatori5 {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digitare false o true");
		boolean a = scan.nextBoolean();
		System.out.println("Digitare false o true");
		boolean b = scan.nextBoolean();
		
		System.out.println("la and dei due booleani " + (a&&b));
		System.out.println("la or dei due booleani " + (a||b));
		System.out.println("il not del primo booleano " + !a);
		System.out.println("il not del secondo booleano " + !b);

		scan.close();
	}
}