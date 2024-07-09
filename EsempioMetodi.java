import java.util.Scanner;

public class EsempioMetodi {
	public static void main(String[] args) { // i metodi che verranno richiamati devono avere static il void non ha una return
        int x = 3;
        int y = 4;
        int z = -1;
        somma(x, y, z);
        System.out.println("");
        int risultato = somma2(2, 8, 5);
        System.out.println(risultato);
        System.out.println("");
        risultato = sommaN(10);
        System.out.println("La somma tra 0 e 9: " + risultato);
        System.out.println("La somma tra 0 4: " + sommaN(5));

		Scanner scan = new Scanner(System.in);
        int n = checkN(scan);
        scan.close();

        System.out.println("Programma terminato");
    }

    static void somma (int a,int b,int c) { // firma e variabili del metodo
		System.out.println("ricevute in ingresso: " + a + "," + b + ","+ c);
        int d = a+b+c;
        System.out.println("la loro somma - "+d );
    }

    static int somma2 (int a,int b,int c) { // firma e variabili del metodo in perchè ci restituirà una variabile int
		System.out.println("ricevute in ingresso: " + a + "," + b + ","+ c);
        int d = a+b+c;
        return d;
    }

    static int sommaN (int n) {
        int risultato = 0;
        if (n<=0) {
            System.out.println("Devi fornire numero positivo");
        } else {
            for (int i = 0; i < n; i++) {
                risultato+=i;
            }
        }
            return risultato;
    }

    static int checkN (Scanner scan) {
        int n;
        do { 
           System.out.println("Inserire numero positivo");
           n = scan.nextInt();
           if (n<0) {
               System.out.println("Numero non valido: solo positivi");
           } 
        } while (n<0);
        return  n;
    } 
}