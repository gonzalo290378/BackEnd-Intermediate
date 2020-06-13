package funciones;

public class DigitoMasGrande {

	private static int DIV = 10;
	private static int masAlto = Integer.MIN_VALUE;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numeros = separarDigito(14455889);

		for (int i = 0; i < numeros.length; i++) {
			
			if (numeros[i] > masAlto) {
				masAlto=numeros[i];
			}

		}

		System.out.println("El numero mas alto es " + masAlto);

	}

	public static int[] separarDigito(int numero) {
		String cadena = String.valueOf(numero);
		int[] arrayDigito = new int[cadena.length()];
		for (int i = numero, j = 0; i > 0; i /= DIV, j++) {
			arrayDigito[j] = i % DIV;
		}

		return arrayDigito;
	}

}
