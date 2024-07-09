// Creare una classe TestStampa con due metodi:
// main
// stampa
// il metodo stampa, dati due numeri interi soglia e  incremento, deve stampare a video tutti i numeri da 0 a soglia con un incremento pari ad incremento. Ad es. se: soglia=7, incremento=3, deve stampare 0-3-6
// il metodo deve fare la stampa a video solo se soglia e incremento sono entrambi positivi e incremento è minore di soglia; se il controllo non passa, il metodo deve stampare a video un messaggio di errore
// il metodo main deve:
// richiedere all’utente tramite Scanner due numeri interi (uno per la soglia e l’altro per l’incremento)
// invocare il metodo stampa passandogli in input i due numeri

import java.util.Scanner; 

public class TestStampa{
    static void stampa (int soglia, int incremento) {
        int i = 0;
        if (incremento<soglia && incremento>0) {
            do {
                System.out.println(i+=incremento);	
            } while (i<soglia);  
        } else {
                System.out.println("Dati inseriti non compatibili");	
        }
    }
	public static void main(String[] args) {
        int scelta;
        Scanner scan  = new Scanner(System.in);
        do {
            int soglia;
            do { 
                System.out.println("Inserire soglia");
                soglia = scan.nextInt();
                if (soglia<=0) {
                    System.out.println("Numero non valido: solo positivi e diverso da zero");
                }
            } while (soglia<=0); 

            int incremento;
            do { 
                System.out.println("Inserire incremento");
                incremento = scan.nextInt();
                if (incremento>=soglia || incremento==0) {
                    System.out.println("Numero non valido: minore e diverso da soglia e diverso da zero");
                } 
            } while (incremento>=soglia || incremento==0); 
            stampa(soglia, incremento);

            System.out.println("Per terminare premere 0");
			scelta = scan.nextInt();					
        } while (scelta!=0);
		scan.close();	
	}
}


