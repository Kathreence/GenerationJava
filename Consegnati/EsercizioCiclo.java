// Creare una classe EsercizioCiclo con un metodo main, che:
// riceva in input da console due numeri interi (chiedendo prima all’utente l’inserimento per ciascuno dei due) 
// se il primo numero è minore o uguale a zero stampi a console una stringa del tipo "Si deve inputare un numero maggiore di 0"  e termini il programma
// se il secondo numero è minore o uguale a zero stampi a console una stringa del tipo "Si deve inputare un numero maggiore di 0"  e termini il programma
// se il secondo numero è maggiore o uguale al primo numero stampi a console una stringa del tipo "Si deve inputare un numero minore di a" (dove a va sostituito col valore effettivo) e termini il programma
// altrimenti, detti a e b i due numeri, crei un ciclo for da 0 ad a, con passo 1, in cui venga saltato solo il passo di iterazione uguale a b. Il ciclo for deve stampare a console il numero che rappresenta il passo di iterazione
// es. se a=5 e b=3 dovrà stampare 0-1-2-4


import java.util.Scanner;

public class EsercizioCiclo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a;
		do {
			System.out.println("Digitare primo numero: ");
			a = scanner.nextInt();
			if ( a <=0 ){
				System.out.println("Si deve inputare un numero maggiore di 0");
			}
		}while(a<=0);
        int b;
        // do { 
        //     do {
        //         System.out.println("Digitare secondo numero: ");
        //         b = scanner.nextInt();
        //         if ( b <=0 ){
        //             System.out.println("Si deve inputare un numero maggiore di 0");
        //         }
        //     }while(b<=0);
        //     System.out.println("Si deve inputare un numero minore di "+a);
        // } while (b>a);
        do { 
                System.out.println("Digitare secondo numero: ");
                b = scanner.nextInt();
            if (b<=0) {
                System.out.println("Si deve inputare un numero maggiore di 0");
            } else if (b>=a) {
                System.out.println("Si deve inputare un numero minore di "+a);
            }
        } while (b<=0||b>=a);
        if (b<a){
            int i;
            for (i=0; i < a; i++) {
                if(i==b){
                    continue;
                }
                System.out.println(i);
            }
        }
		scanner.close();
	}

}