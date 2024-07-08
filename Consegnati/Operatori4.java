/*
Creare una classe Operatori4 con un metodo main, che:
riceva in input da console due numeri interi (chiedendo prima all’utente l’inserimento per ciascuno dei due) a e b
sfruttando l’operatore ternario () ? :  confronti a e b e assegni ad una stringa s il valore «a maggiore o uguale di b», oppure «b maggiore di a» a seconda dei casi
stampi a console la stringa s
*/

import java.util.Scanner;

public class Operatori4 {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digitare un numero intero");
		int a = scan.nextInt();
		System.out.println("Digitare un numero intero");
		int b = scan.nextInt();
		String c = a>=b ? a + " maggiore o uguale di " + b : " maggiore di " + a;

		System.out.println(c);
		scan.close();
	}
}