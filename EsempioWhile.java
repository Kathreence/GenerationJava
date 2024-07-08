public class EsempioWhile {
	public static void main(String[] args) {
		int i = 0;
		
		while (i<5) {
			System.out.println(i++);
		}	

		int contatore = 0;
		boolean exit = false;

		while (!exit) {
			if (contatore == 2) {
				exit = true;
			} else {
				System.out.println(++contatore);
			}
		}
	}
}