package funciones;

public class GeneraNumerosAleatorios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numAleatorios=aleatorios(5, 8);
		System.out.println(numAleatorios);
	}
	
	public static int aleatorios(int min, int max) {
		return (int)(Math.random() * (max-min+1) + (min));
	}

}
