package funciones;

public class MuestraDigitos {

	private static final int DIVISOR = 10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []mostrarNumeros=muestraNumeros(4565655);
		
		for (int i = mostrarNumeros.length; i > 0; i--) {
			System.out.print(mostrarNumeros[i-1] + " ");
		}

	}

	private static int[] muestraNumeros(int numero) {
		// TODO Auto-generated method stub
		String cadena=String.valueOf(numero);
		int[] resultado = new int[cadena.length()];
		for (int i = numero, j = 0; i > 0; i /= DIVISOR, j++) {
			resultado[j] = i % DIVISOR;
		}
		return resultado;

	}

}
