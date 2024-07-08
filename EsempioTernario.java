public class EsempioTernario {
	public static void main (String[]args) {
		int y = 5;
		int x = (y>3) ? 15 : 20; //dentro le () c'è espressione booleana
		System.out.println("x = " + x);
		float f = y>=5 ? 2.5f : 3.3f;
		System.out.println("f = " + f);
	}	
}