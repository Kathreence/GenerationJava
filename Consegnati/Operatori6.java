// Creare una classe Operatori6 con un metodo main, che:
// riceva in input da console un numero intero
// incrementi il numero di 10 usando la notazione abbreviata (+=)
// stampi a console una stringa seguendo questa regola:
// supponendo che il numero in ingresso sia 4, la stringa stampata dovrà essere: «Incrementando 4 di 10 si ottiene 14»
// attenzione al fatto che la notazione abbreviata modifica il valore della variabile, quindi attenzione a non perdere il valore del numero di partenza (nell’esempio 4)

import java.util.Scanner; 

public class Operatori6{
	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		System.out.println("Inserire un numero");	
		int numero = scan.nextInt(); 		
        int risultato = numero; 		
        risultato += 10;
		System.out.println("«Incrementando " + numero + " di 10 si ottiene " + risultato);
		scan.close();	
	}
}
