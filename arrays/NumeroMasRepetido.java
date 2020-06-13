package arrays;

public class NumeroMasRepetido {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 1, 5, 4, 3, 1, 2, 2, 2, 2, 2, 2, 2, 4, 3, 4, 6, 5, 5, 6 };

		int contador = 0;
		int mayor = 0;
		int repeticiones = 0;
		int numeroBuscado;
		int numeroActual;

		for (int i = 0; i < a.length; i++) {
			numeroBuscado = a[i];
			contador = 0;

			for (int j = 0; j < a.length; j++) {
				numeroActual = a[j];
				if (numeroBuscado == numeroActual) {
					contador++;
				}
			}

			if (contador >= repeticiones) {
				mayor = numeroBuscado;
				repeticiones = contador;
			}
		}

		System.out.println("El numero que mas se repite es " + mayor + " con " + repeticiones + " repeticiones");

	}

}
