import java.util.Scanner;

public class EsempioDoWhile {
    public static void main(String[] args) {
        int i = 55;
        do {
            System.out.println(i++);
        } while (i<3);

        Scanner scan = new Scanner(System.in);
        int scelta ;
        do { 
            System.out.println("inserire un numero da 1 a 3");
            scelta = scan.nextInt();
            if (scelta!=1 && scelta!=2 && scelta!=3) {
                System.out.println("errore dato");
            }
        } while (scelta!=1 && scelta!=2 && scelta!=3);

        scan.close();
    }
}