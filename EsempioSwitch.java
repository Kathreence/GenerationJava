public class EsempioSwitch {
	public static void main (String[]args) { // args sarebbero le variabili?
		int x = 5;
		int y = 3;

		switch(x-y) {
			case 1 : {
				System.out.println("Il risultato è 1");
				break;
			}
			case 2 : {
				System.out.println("Il risultato è 2");
				break;
			} 
			default : {
				System.out.println("Il risultato è diverso da 1 e da 2");
				break;
			}
		}

		if (x-y==1) {
				System.out.println("Il risultato è 1");
		} else if (x-y==2) {
				System.out.println("Il risultato è 2");
		} else {
				System.out.println("Il risultato è diverso da 1 e da 2");		
		}
		
		System.out.println("Programma terminato");
	}	
}