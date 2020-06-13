package ficheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class LeerHasta {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		// Create un fichero externo, pide un numero de lineas y lee hasta ese numero de
		// lineas.
		// Si el numero de lineas que ingresan es negativo o tiene mas lineas de las que
		// tiene el archivo lanza excepcion

		Scanner sc = new Scanner(System.in);
		System.out.println("Hasta que linea quieres leer?");
		int leerHasta = sc.nextInt();

		try {
			MetodoLeer(leerHasta);
		} catch (MiError e) {
			// TODO Auto-generated catch block
			System.out.println("No hay mas lineas por leer");

		}

	}

	public static void MetodoLeer(int l) throws MiError {

		try {
			BufferedReader leer = new BufferedReader(
					new FileReader("C:/Users/gonza/eclipse-workspace/DuroDeRoer/src/ficheros/ejemplo4.txt"));

			if (l < 0)
				throw new IOException("No puedes leer " + l + " lineas");

			String[] array = new String[l];
			int contador = 0;
			String linea = "";
			while (contador < l) {
				if (linea == null) {
					throw new MiError();

				} else {
					linea = leer.readLine();
					array[contador] = linea;
					contador++;
				}
			}

			for (int i = 0; i < array.length; i++) {
				if(linea!=null)
				System.out.println(array[i]);
				else throw new MiError();

			}

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}

class MiError extends Exception {

	public MiError() {

	}

	public MiError(String mensaje) {

		super(mensaje);

	}
}