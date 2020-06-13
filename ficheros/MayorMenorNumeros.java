package ficheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//dado un fichero de texto con una lista de numeros indica cual es el mayor y el menor

public class MayorMenorNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		int numLineas;

		try (BufferedReader lecturaArray = new BufferedReader(
				new FileReader("C:/Users/gonza/eclipse-workspace/DuroDeRoer/src/ficheros/ejemplo5.txt"));) {
			numLineas = cuentaNumLineas("C:/Users/gonza/eclipse-workspace/DuroDeRoer/src/ficheros/ejemplo5.txt");
			int[] array = new int[numLineas];

			int menor = Integer.MAX_VALUE;
			int mayor = Integer.MIN_VALUE;

			for (int i = 0; i < array.length; i++) {
				array[i] = Integer.parseInt(lecturaArray.readLine());

			}

			for (int i = 0; i < array.length; i++) {
				if (array[i] > mayor) {
					mayor = array[i];
				}
				if (array[i] < menor) {
					menor = array[i];
				}
			}

			System.out.println(menor + " es el minimo y " + mayor + " es el maximo");

		} catch (IOException e) {
			e.getMessage();
		} catch (NumberFormatException e) {
			System.out.println(("No se puede convertir algun dato en numero, revisa el fichero " + e.getMessage()));
		}

	}

	private static int cuentaNumLineas(String string) throws IOException {

		int contador = 0;

		BufferedReader br = new BufferedReader(new FileReader(string));
		String linea = "";

		while ((linea = br.readLine()) != null) {

			contador++;
		}

		return contador;
	}

}
