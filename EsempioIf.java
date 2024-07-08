import java.util.Scanner;

public class EsempioIf {
	public static void main(String[] args) {
		int a =1;
		int b =2;
		int c =3;

		Scanner scan = new Scanner(System.in);

		if (a<b) {
			System.out.println("a<b");
			System.out.println("inserire true o false");
			boolean b1 = scan.nextBoolean();
			if(b1) {
				System.out.println("Hai messo true");
			} else {
				System.out.println("Hai messo false");
			}
		}
		else if (a==b) {
			System.out.println("a=b");
			System.out.println("inserire true o false");
			boolean b1 = scan.nextBoolean();
			if(!b1) {
				System.out.println("Hai messo false");
			} else {
				System.out.println("Hai messo true");
			}
		}
		else {
			System.out.println("a>b");
			System.out.println("inserire true o false");
			boolean b1 = scan.nextBoolean();
			if(b1) {
				System.out.println("Hai messo true");
			} else {
				System.out.println("Hai messo false");
			}
		}
		System.out.println("programma terminato");
		scan.close();
	}
}