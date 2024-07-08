import java.util.Scanner; //per importare classe Scanner dalle utility di java

public class EsempioConsole2{
	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		System.out.println("Inserire un numero");	//print line
		int numero = scan.nextInt(); 				//blocca il programma e regitra la stringa che la converte in primitiva int
		System.out.println("Hai digitato " + numero);
		scan.close();	
	}
}


