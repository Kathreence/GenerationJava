/*
import java.util.Scanner;

public class EsempioConsole {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digitare il nome:");	//apertura
		String s = scanner.nextLine();
		System.out.println("Digitato " + s);
		scanner.close();							//chiusura
	}
}
*/


import java.util.Scanner;

public class EsempioConsole {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digitare qualcosa: ");
		String s = scan.nextLine();
		System.out.println("tu hai digitato: "+s);
		scan.close();
	}
}
