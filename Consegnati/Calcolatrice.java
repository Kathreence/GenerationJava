// Creare una classe Calcolatrice con i seguenti metodi:
// somma: riceve in ingresso due numeri interi e restituisce al chiamante la loro somma
// differenza: riceve in ingresso due numeri interi e restituisce al chiamante la loro differenza
// moltiplicazione: riceve in ingresso due numeri interi e restituisce al chiamante il loro prodotto
// divisione: riceve in ingresso due numeri interi e restituisce al chiamante la loro divisione
// main: 
// riceve in input da console tre numeri interi
// il primo corrisponde alla scelta da parte dell’utente (che deve essere preventivamente avvisato con un opportuno messaggio a console) dell’operazione da effettuare: 1=somma, 2=sottrazione, 3=moltiplicazione, 4=divisione. Se l’utente non sceglie un valore compreso tra 1 e 4, terminare il programma
// il secondo ed il terzo corrispondono ai due operandi (anche qui, per entrambi ci dovrà essere prima il messaggio a console che richiede all’utente l’inserimento del numero)
// a seconda dell’operazione scelta dall’utente:
// invoca uno dei quattro metodi indicati prima
// salva il risultato del metodo invocato in una variabile intera
// stampa a console il risultato, nel formato a+b=c, a-b=c, etc. 
// Effettuare un controllo sul primo numero che blocchi l’utente finchè non ha inserito un numero compreso tra 1 e 4
// provare ad inserire il controllo del punto precedente in un metodo

import java.util.Scanner; 

public class Calcolatrice{

    static int somma ( int n1, int n2) {
        return n1 + n2;
    }
    
    static int sottrazione ( int n1, int n2) {
        return n1 - n2;
    }

    static int moltiplicazione ( int n1, int n2) {
        return n1 * n2;
    }

    static int divisione ( int n1, int n2) {
        return n1 / n2;
    }
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        int scelta;

        do {
            int n3;
            do { 
                System.out.println("Inserire 1-somma 2-sottrazione 3-moltiplicazione 4-divisione");
                n3 = scan.nextInt();
                if (n3>4||n3<1) {
                    System.out.println("Valore non valido");
                }
            } while (n3>4||n3<1);
             
            System.out.println("Inserire primo valore");
            int n1 = scan.nextInt();
            System.out.println("Inserire secondo valore");
            int n2 = scan.nextInt();
            

            if (n3==1) {
                System.out.println(n1 + " + " + n2 + " = " + somma(n1,n2));
            } 
            if (n3==2) {
                System.out.println(n1 + " - " + n2 + " = " + sottrazione(n1, n2));
            }
            if (n3==3) {
                System.out.println(n1 + " * " + n2 + " = " + moltiplicazione(n1, n2));
            } 
            if (n3==4) {
                System.out.println(n1 + " / " + n2 + " = " + divisione(n1, n2));
            }
            System.out.println("Per terminare premere 0");
			scelta = scan.nextInt();		
        } while (scelta!=0);
        scan.close();
    }
}