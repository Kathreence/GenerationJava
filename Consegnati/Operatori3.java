/*Creare una classe Operatori3 con un metodo main, che:
riceva in input da console un numero intero
stampi a console il numero effettuando contemporaneamente un post-incremento del numero
stampi a console il valore del numero (quindi successivamente rispetto al post-incremento)
stampi a console il numero effettuando contemporaneamente un pre-incremento del numero
stampi a console il valore del numero (quindi successivamente rispetto al pre-incremento)
per le 4 stampe a console si concatenino i valori dei numeri con delle stringhe esplicative
*/

import java.util.Scanner;

public class Operatori3 {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digitare un numero intero");
		int a = scan.nextInt();

		System.out.println("Questo è il tuo numero " + (a++));
		System.out.println("Questo è il numero successivo " + (a));
		System.out.println("Questo è il numero successivo " + (++a));
		System.out.println("Questo è il valore finale " + (a));
	}
}